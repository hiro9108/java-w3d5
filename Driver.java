import java.util.Scanner;

public class Driver {
	
	// method to print just one object which pass as an argument
	public static void printRecord(Record record) {
		System.out.println("\nID : " + record.getId() +
							"\nTitle : " + record.getRecordTitle() +
							"\nSinger Name : " + record.getSingerName() +
							"\nRecord Length : " + record.getRecordLength() +
							"\nRecord Ranking : " + record.getRecordRanking());
	}
	
	// method to iterate through the array and find the index for the title
	// return the index of record if we do not have it ---> return -1
	public static int findRecordIndex(Record[] records, String title) {
		for (int i = 0; i < records.length; i++) {
			if (records[i].getRecordTitle().equalsIgnoreCase(title)) {
				return i;
			} 
		}
		return -1;
	}
	
	// getAverage of lengthRecord --> return average
	public static double AverageOfRecordLength(Record[] records) {
		double sumOfRcordLength = 0;
		for (int i = 0; i < records.length; i++) {
			sumOfRcordLength += records[i].getRecordLength();
		}
		return sumOfRcordLength / records.length;
	}
	
	// getAverage of ranking --> return average
	public static double AverageOfRecordRanking(Record[] records) {
		int sumOfRanking = 0;
		for (int i = 0; i < records.length; i++) {
			sumOfRanking += records[i].getRecordRanking();
		}
		return sumOfRanking / records.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// at least create 7 object
		Record record_0 = new Record("Canada", "Smith", 100.3, 2);
		Record record_1 = new Record("China", "Den", 200.3, 3);
		Record record_2 = new Record("Japan", "Tom", 304.1, 2);
		Record record_3 = new Record("Korea", "Tomsh", 60, 4);
		Record record_4 = new Record("Africa", "Som", 23, 1);
		Record record_5 = new Record("England", "Zom", 122.2, 3);
		Record record_6 = new Record("America", "Uom", 42.2, 2);

		
		// create array and add these objects to array
		Record[] records = new Record[7];	
		records[0] = record_0;
		records[1] = record_1;
		records[2] = record_2;
		records[3] = record_3;
		records[4] = record_4;
		records[5] = record_5;
		records[6] = record_6;
		
		// ask the user to enter the title of record
		System.out.print("Please Enter the title of record: ");
		String inputTitle = input.nextLine();
		
		// findRecord
		int indexRecord =findRecordIndex(records, inputTitle);
		
		if (indexRecord == -1) {
			System.err.println("\nNot found the title");
		} else {
			// print the record
			printRecord(records[indexRecord]);
			
		}
		
		// print the averages
		System.out.println("\nAverage of Record Length: " + AverageOfRecordLength(records));
		System.out.println("Average of Record Length: " + AverageOfRecordRanking(records));
		
	}

}
