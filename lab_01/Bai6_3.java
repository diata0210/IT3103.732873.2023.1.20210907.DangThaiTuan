package lab_01;
import java.util.Scanner;
public class Bai6_3 {
  public static void main(String[] args) {
    // khai báo scan để nhập thông tin 
    Scanner scan = new Scanner(System.in);
    // in ra chuỗi
    System.out.println("Tuan.DT_210907:\n Nhap so tu nhien: ");
    int n = scan.nextInt();
    for (int i = 1; i <= n; i++) {
      // in ra khoảng trắng 
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // in ra ngôi sao
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      // in dấu xuống dòng
      System.out.println();
    }
  }
}
