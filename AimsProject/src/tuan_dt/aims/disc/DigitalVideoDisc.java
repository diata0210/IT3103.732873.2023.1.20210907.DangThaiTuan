package AimsProject.src.tuan_dt.aims.disc;

import java.util.Scanner;

import AimsProject.src.tuan_dt.aims.media.Playable;
import AimsProject.src.tuan_dt.aims.media.disc;

public class DigitalVideoDisc extends disc implements Playable {

    @Override
    public void play() {
        if (length <= 0) {
            System.out.println("Tuan.DT_210907: This DVD cannot be played.");
            return;
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public static DigitalVideoDisc createDVD() {
        System.out.println("---New DVD---");
        String title, category, director;
        int length;
        float cost;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter category: ");
        category = sc.nextLine();

        System.out.print("Enter director: ");
        director = sc.nextLine();

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter cost: ");
        cost = sc.nextFloat();

        return new DigitalVideoDisc(title, category, director, length, cost);
    }
}
