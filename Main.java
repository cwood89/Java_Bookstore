import java.util.Scanner;
import bookstore.Bookstore;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    Bookstore myStore = new Bookstore("United Book Nation");
    System.out.println(myStore);
    System.out.println(myStore.getName());
    myStore.printBooks();

    System.out.println(myStore.totalBooks());
    System.out.println("Search for a book: ");

    myStore.findBook(in.nextLine());

    in.close();
  }
}