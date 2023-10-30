package lab_01;
import java.util.Scanner;
public class Bai6_2 {

  public static void main(String args[]) {
    // Khai báo keyboard để có thể nhập thông tin
    Scanner keyboard = new Scanner(System.in);
    // in chuỗi ra màn hình
    System.out.println("Tuan.DT_210907: What's your name?");
    // Nhập chuỗi cho strName
    String strName = keyboard.nextLine();
    // in chuỗi ra màn hình
    System.out.println("Tuan.DT_210907: How old are you?");
    // Nhập số cho iAge
    int iAge = keyboard.nextInt();
    // in chuỗi ra màn hình
    System.out.println("Tuan.DT_210907: How tall are you(m) ?");
    // Nhập số cho dHeight
    double dHeight = keyboard.nextDouble();
    // in chuỗi ra màn hình
    System.out.println(
        "Tuan.DT_210907: \nMrs/Ms. " + strName + ", " + iAge + "years old. " + "Your height is " + dHeight + ".");
  }
}
