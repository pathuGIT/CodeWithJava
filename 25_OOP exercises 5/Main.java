import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Book book1 = new Book("AA","zz",1234);
		Book book2 = new Book("AAA","zz",1234);
		
		Book.addBook(book1);
		Book.addBook(book2);
		
		ArrayList<Book> bookArr = Book.returnBook();
		
		for(Book i: bookArr){
			System.out.println(i.getTit()+","+i.getAu()+","+i.getIs());
		}
	}
}