public class BibleBook 
{
	private String BookName;
	private int NumOfChapters;
	private String Summary;
	
	public BibleBook(String BookName, int NumOfChapters, String Summary) 
	{
		this.BookName = BookName;
		this.NumOfChapters = NumOfChapters;
		this.Summary = Summary;		
	}
	
	public BibleBook(String commaDelimited) 
	{
		String[] parts = commaDelimited.split("//");
		this.BookName = parts[0];
		this.NumOfChapters =  Integer.parseInt(parts[1]);
		this.Summary = parts[2]; 
	}
	
	public void display()
	{
		System.out.printf("BookName: %s NumOfChapters: %d Summary: %s \n", this.BookName, this.NumOfChapters, this.Summary);
	}
	
	public String getBookName() 
	{
		return BookName;
	}
	
	public int getNumOfChapters() 
	{
		return NumOfChapters;
	}
	
	public String getSummary() 
	{
		return Summary;
	}	
}
