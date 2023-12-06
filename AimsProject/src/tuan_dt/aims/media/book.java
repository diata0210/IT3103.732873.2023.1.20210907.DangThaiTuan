package AimsProject.src.tuan_dt.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book extends media{
  private List<String> authors = new ArrayList<String>();
  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }
  public List<String> getAuthors() {
    return authors;
  }

  public book() {
		super();
	}
    public book(String title) {
		super(title);
	}

	public book(String title, String category, float cost) {
		super(title, category, cost);
	}

  // tuan.dt_210907 find Author 
  private boolean findAuthor(String authorName){
    if(authors.contains(authorName)){
      return true;
    }else {
      return false;
    }
  }

  //tuan.dt_210907 method add author 
  public void addAuthor(String authorName){
    if(!findAuthor(authorName)){
      authors.add(authorName);
    }
  }

  //tuan.dt_210907 method remove author 
  public void removeAuthor(String authorName){
    if(findAuthor(authorName)){
      authors.remove(authorName);
    }
  }

  	public static book createBook() {
		System.out.println("---New Book---");
		String title, category;
		float cost;
		String[] authors;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		title = sc.nextLine();

		System.out.print("Enter category: ");
		category = sc.nextLine();

		System.out.print("Enter author name(s): ");
		authors = sc.nextLine().split(",\\s*");

		System.out.print("Enter cost: ");
		cost = sc.nextFloat();

		book book = new book(title, category, cost);
		for (String author : authors) {
			book.addAuthor(author);
		}

		return book;
	}
}
