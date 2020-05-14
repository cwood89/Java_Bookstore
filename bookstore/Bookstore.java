package bookstore;

import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {

  public String name = "Chris's Vintage Books";
  public String address = "2000 Melrose Blvd.";
  public boolean hasUsedBooks = true;
  public boolean open = true;
  public String openingTime = "10am";
  public String closingTime = "7pm";

  private ArrayList<String> titles;

  // this will create an instance with all the default values.
  public Bookstore() {
    titles = new ArrayList<String>();
    loadTitles();
  }

  // this will create an instance overriding only one default value.
  public Bookstore(String name) {
    this.name = name;
    titles = new ArrayList<String>();
    loadTitles();
  }

  // this will create an instance while overriding some default values.
  public Bookstore(String name, String address, boolean hasUsedBooks) {
    this.name = name;
    this.address = address;
    this.hasUsedBooks = hasUsedBooks;
    titles = new ArrayList<String>();
    loadTitles();
  }

  // this will create an instance overriding all default values.
  public Bookstore(String name, String address, boolean hasUsedBooks, boolean open, String openingTime,
      String closingTime) {
    this.name = name;
    this.address = address;
    this.hasUsedBooks = hasUsedBooks;
    this.open = open;
    this.openingTime = openingTime;
    this.closingTime = openingTime;
    titles = new ArrayList<String>();
    loadTitles();
  }

  private void loadTitles() {
    try {
      Utils.loadStringsToArray(this.titles);
    } catch (IOException e) {
      // for now simply init the array to zero
      System.out.println("Could not initialize the titles");
      // make sure it is empty
      this.titles = new ArrayList<String>();

    }
  }

  public void printBooks() {
    for (String book : this.titles) {
      System.out.println(book);
    }
  }

  public int totalBooks() {
    return this.titles.size();
  }

  public void findBook(String name) {
    for (String book : this.titles) {
      if (book.toLowerCase().contains(name.toLowerCase())) {
        System.out.println(book);
      }
    }
  }

  public void getAttributes() {

  }

  @Override
  public String toString() {
    return String.format("%s has all your reading needs. We're located at %s and are open from %s to %s.%n", this.name,
        this.address, this.openingTime, this.closingTime);
  }

}