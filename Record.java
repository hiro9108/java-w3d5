
public class Record {
	private int id; // 100 to 10000
	private String recordTitle; // null or empty
	private String singerName; // null or empty
	private double recordLength; // more than zero
	private int recordRanking; // more than zero less than 6(1~5)
	
	
	public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
	}
	
	// getters
	
	public int getId() {
		return this.id;
	}
	
	public String getRecordTitle() {
		return this.recordTitle;
	}
	
	public String getSingerName() {
		return this.singerName;
	}
	
	public double getRecordLength() {
		return this.recordLength;
	}
	
	public int getRecordRanking() {
		return this.recordRanking;
	}
	
	
	// setters
	
	public void setId() {
		this.id = (int)(Math.random() * 901) + 100;
	}
	
	public void setRecordTitle(String recordTitle) {
		this.recordTitle = recordTitle.isEmpty() || recordTitle.equalsIgnoreCase(null) ? "Unknown" : recordTitle;
	}
	
	public void setSingerName(String singerName) {
		this.singerName = singerName.isEmpty() || singerName.equalsIgnoreCase(null) ? "Unknown" : singerName;
	}
	
	public void setRecordLength(double recordLength) {
		this.recordLength = recordLength > 0 ? recordLength : -1;
	}
	
	public void setRecordRanking(int recordRanking) {
		this.recordRanking = recordRanking > 0 && recordRanking < 6 ? recordRanking : -1;
	}

}
