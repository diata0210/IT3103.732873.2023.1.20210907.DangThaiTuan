package lab_01;

import java.util.Scanner;

public class Bai6_2 {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Tuan.DT_210907: What's your name?");
    String strName = keyboard.nextLine();
    System.out.println("Tuan.DT_210907: How old are you?");
    int iAge = keyboard.nextInt();
    System.out.println("Tuan.DT_210907: How tall are you(m) ?");
    double dHeight = keyboard.nextDouble();
    System.out.println("Tuan.DT_210907: \nMrs/Ms. " + strName + ", " + iAge + "years old. " + "Your height is " + dHeight + ".");
  }
}
