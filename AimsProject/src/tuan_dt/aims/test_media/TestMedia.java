package AimsProject.src.tuan_dt.aims.test_media;

import java.util.ArrayList;
import java.util.List;

import AimsProject.src.tuan_dt.aims.disc.DigitalVideoDisc;
import AimsProject.src.tuan_dt.aims.media.CompactDisc;
import AimsProject.src.tuan_dt.aims.media.book;
import AimsProject.src.tuan_dt.aims.media.media;

public class TestMedia {
  public static void main(String[] args) {
    List<media> medias = new ArrayList<media>();
    book books = new book("Nha cgia kim", "Literature", 29.90f);
    media cd = new CompactDisc("Christmas", "Music", "Leroy Sane", "ABC", 20.4f);
    media dvd = new DigitalVideoDisc("The lord", "Animation", "Tom MN", 50, 21.5f);
    medias.add(dvd);
    medias.add(books);
    medias.add(cd);
    for (media m : medias) {
      System.out.println(m.toString());
    }
  }
}
