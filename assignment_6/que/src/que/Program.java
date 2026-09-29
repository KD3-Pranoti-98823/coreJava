package que;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
		static List<Book>bookList = new ArrayList<>();
		static Scanner sc =new Scanner(System.in);
		
		public static  void addBook() {
			System.out.println("Enter isbn :");
			String isbn = sc.nextLine();
			System.out.println("enter price :");
			double price =sc.nextDouble();
			
			sc.nextLine();
			
			System.out.println("authorName :");
			String authorName =sc.nextLine();
			System.out.println(" Enter quantity :");
			int quantity=sc.nextInt();
			
			Book book = new Book(isbn,price,authorName,quantity);
			bookList.add(book);			
		}
		
		
			public static void main(String[] args) {
				addBook();
				
			}
}

