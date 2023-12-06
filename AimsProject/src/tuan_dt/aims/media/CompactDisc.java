package AimsProject.src.tuan_dt.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends disc implements Playable{
  private String artist;
  private ArrayList<track> tracks = new ArrayList<track>();

  @Override
  public void play() {
		if (getLength() <= 0) {
			System.out.println("This CD cannot be played.");
			return;
		}
		System.out.println("Playing CD: " + this.getTitle() + " by " + this.getArtist());
		System.out.println("CD total length: " + this.getLength());
		for (track t : tracks) {
			t.play();
		}
	}

  public void addTrack(track track) {
		if (tracks.contains(track)) {
			System.out.println("Track already exists.");
		} else {
			tracks.add(track);
			System.out.println("Added track " + track.getTitle() + " to CD.");
		}
	}

	public void removeTrack(track track) {
		if (tracks.remove(track)) {
			System.out.println("Removed track " + track.getTitle() + " from CD.");
		} else {
			System.out.println("Track doesn't exists.");
		}
	}

  public CompactDisc(String title) {
    super(title);
  }

  public CompactDisc(String title, String category, float cost){
    super(title, category, cost);
  }

  public CompactDisc(String title, String category, String director, float cost ) {
    super(title, category, director, cost);
  }

	public CompactDisc(String title, String category, String artist, String director, float cost) {
    super(title, category,director, cost);
    this.artist = artist;
  }

  public String getArtist() {
    return artist;
  }

  // tuan.dt_210907 method find track 
  private boolean findAuthor(track track){
    if(tracks.contains(track)){
      return true;
    }else {
      return false;
    }
  }

  //tuan.dt_210907 method add track 
  public void addAuthor(track track){
    if(!findAuthor(track)){
      tracks.add(track);
    }
  }

  //tuan.dt_210907 method remove track 
  public void removeAuthor(track track){
    if(findAuthor(track)){
      tracks.remove(track);
    }
  }

  // tuan.dt210907 method get length 

  public int getLength(){
    int length = 0;
    for(track t: tracks){
      length += t.getLength();
    }
    this.length = length;
    return length;
  }

  public static CompactDisc createCD() {
		System.out.println("---New CD---");
		String title, category, artist, director;
		float cost;
		int nbTracks;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		title = sc.nextLine();

		System.out.print("Enter category: ");
		category = sc.nextLine();

		System.out.print("Enter artist: ");
		artist = sc.nextLine();

		System.out.print("Enter director: ");
		director = sc.nextLine();

		System.out.print("Enter cost: ");
		cost = sc.nextFloat();

		CompactDisc cd = new CompactDisc(title, category, artist, director, cost);

		System.out.print("Enter number of tracks: ");
		nbTracks = sc.nextInt();

		for (int i = 0; i < nbTracks; i++) {
			System.out.println("\nTrack no. " + (i + 1));
			cd.addTrack(track.createTrack());
		}

		return cd;
	}
  
}
