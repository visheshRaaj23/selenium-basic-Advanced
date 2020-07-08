package utilities;

import java.util.List;

public class ReadDataFrom_CSV {

	public static void main(String[] args) {
	readCSV();

	}
	public static void readCSV() {						
		
		List<String[]> records = utilities.CSVRead.get("C:/Users/Vishesh and Varsha/Desktop/MY Resume/UserAccounts.csv");
		for(String record[]:records) {
			for(String line:record) {
				System.out.println(line);
			}
		}
	}

}
