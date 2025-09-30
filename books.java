package books;

public class Books {
	
	private String name;
	private String author;
	private String region;
	private String ISBN;
	private int pagenum;
	
	
//initialization
	public Books(String name, String author, String region, String iSBN, int pagenum) {
		super();
		this.name = name;
		this.author = author;
		this.region = region;
		ISBN = iSBN;
		this.pagenum = pagenum;
	}
	
	public Books() {
		this.name = "";
		this.author = "";
		this.region = "";
		ISBN = "";
		this.pagenum = 0;
	}

//method getting the name of the book
	public String getName()
	{
		return name;
	}

//method getting the name of the author
	public String getAuthor()
	{
		return author;
	}

//method getting the region where the author comes from
	public String getRegion()
	{
		return region;
	}

//method getting the page number of the book
	public int getPagenum()
	{
		return pagenum;
	}	

//method getting the ISBN of the book
	public String getISBN()
	{
		return ISBN;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
