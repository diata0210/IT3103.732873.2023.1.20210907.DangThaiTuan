package AimsProject.src.tuan_dt.aims.media;

import java.util.Objects;
import java.util.Scanner;

public class track implements Playable {

  @Override
  public void play() {
    System.out.println("Playing track: " + this.getTitle());
    System.out.println("Track length: " + this.getLength());
  }

  private String title;
  private int length;

  public track(String title) {
    this.title = title;
  }

  public track(String title, int length) {
    this.title = title;
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public String getTitle() {
    return title;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    track other = (track) obj;
    return length == other.length && Objects.equals(title, other.title);
  }

  	public static track createTrack() {
		String title;
		int length;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter track title: ");
		title = sc.nextLine();
		System.out.print("Enter track length: ");
		length = sc.nextInt();
		return new track(title, length);
	}
  
}
