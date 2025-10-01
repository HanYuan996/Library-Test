package mylibrary;

import java.util.ArrayList;

public class database {
	
	private ArrayList<books.Books> library;
	
	public database()
	{
		this.library = new ArrayList<books.Books>();
	}
	
	public void addBook(String name, String author, String region, String iSBN, int pagenum)
	{
		books.Books newbook = new books.Books(name,author,region,iSBN,pagenum);
		library.add(newbook);
	}
	
	public void searchBook(String isbn)
	{
		Loop1:
		for(books.Books b : library)
		{
			if(isbn == b.getISBN())
			{
				System.out.println("Here is the book "+"《"+b.getName()+"》");
				break Loop1;
			}
		}
	}
	
	public void getBook(int num)
	{
		System.out.println("["+library.get(num).getName()+","+library.get(num).getAuthor()+","
				           +library.get(num).getRegion()+","+library.get(num).getISBN()+","
				           +library.get(num).getPagenum()+"]");
	}
	
	public void removeBook(int num)
	{
		library.remove(num);
	}
	
	aaa
	
	bbb
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		database l = new database ();
		l.addBook("活着", "余华", "China", "7530221531", 216);
		
		l.searchBook("7530221531");
		
		l.getBook(0);
	}

}
