import java.util.ArrayList;

public class Book{
	private String title;
	private String author;
	private int isbn;
	private static ArrayList<Book> bookArr = new ArrayList<Book>();
	
	public Book(String Title, String Auth, int Isbn){
		this.title = Title;
		this.author = Auth;
		this.isbn = Isbn;
	}
	
	public String getTit(){
		return title;
	}
	public String getAu(){
		return author;
	}
	public int getIs(){
		return isbn;
	}
	
	public static void addBook(Book book){
		bookArr.add(book);
	}
	
	
	public static ArrayList<Book> returnBook(){
		return bookArr;
	}
	
}