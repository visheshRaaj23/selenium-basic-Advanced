package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVRead {
	
	public static List<String[]> get(String fileName){
		
		List<String[]> arrayObj = new ArrayList<String[]>();
		String testRow=null;
		try {
			BufferedReader bf = new  BufferedReader(new FileReader(fileName));
			while((testRow=bf.readLine())!=null) {
				String[] eachPar = testRow.split(",");
				arrayObj.add(eachPar);
			}
		}catch(Exception exc) {
			System.out.println("File Not found or Couldn't Read from CSV File");
		}
		return arrayObj;
	}

}
