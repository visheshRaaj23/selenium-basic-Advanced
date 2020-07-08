package excelDataDump;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelSheets {
	public ArrayList<String> getData(String className) {
		ArrayList<String> arrayOfData = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			int sheets = workBook.getNumberOfSheets();
			for (int sheetN = 0; sheetN < sheets; sheetN++) {
				if (workBook.getSheetName(sheetN).equalsIgnoreCase("Locators")) {
					XSSFSheet sheet = workBook.getSheetAt(sheetN);
					Iterator<Row> rows = sheet.iterator();
					Row firstRow = rows.next();
					Iterator<Cell> columnHeaders = firstRow.cellIterator();
					int k = 0;
					int column = 0;
					while (columnHeaders.hasNext()) {
						Cell firstRowHeaderCell = columnHeaders.next();
						if (firstRowHeaderCell.getStringCellValue().equalsIgnoreCase("Page ClassName")) {
							column = k;
						}
						k++;
					}
					System.out.println(column);
					while (rows.hasNext()) {
						Row nextRows = rows.next();
						if (nextRows.getCell(column).getStringCellValue().contains(className)) {
							Iterator<Cell> reqRowCell = nextRows.cellIterator();

							while (reqRowCell.hasNext()) {
								Cell eachCell = reqRowCell.next();
								if (eachCell.getCellType() == CellType.STRING) {
									arrayOfData.add(eachCell.getStringCellValue());
								} else {
									//For Numeric Cell Value
									arrayOfData.add(NumberToTextConverter.toText(eachCell.getNumericCellValue()));
								}
							}
						}
					}

				}
			}

			workBook.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return arrayOfData;
	}

	public static void main(String[] args) {
		ReadFromExcelSheets readData = new ReadFromExcelSheets();
		ArrayList<String> x = readData.getData("Class4");
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
	}
}
