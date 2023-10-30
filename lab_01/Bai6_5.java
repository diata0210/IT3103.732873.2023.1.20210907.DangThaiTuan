package lab_01;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai6_5 {
  // Set up format
  public static String formatNumber(double number) {
    DecimalFormat format = new DecimalFormat("#.##");
    return format.format(number);
  }

  // Định dạng format cho các phần tử trong mảng
  public static String formatArray(double[] array) {
    StringBuilder formattedArray = new StringBuilder();
    for (double num : array) {
      formattedArray.append(formatNumber(num)).append(", ");
    }
    return formattedArray.toString();
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Tuan.DT_210907: Do you want to enter an array (Y/N)? ");
    String optionInput = scanner.next();
    double[] array; // Khai báo mảng 
    double sum = 0;  // Khai báo tổng 
    // Nếu chọn Y 
    if (optionInput.equalsIgnoreCase("Y")) {
      System.out.print("Tuan.DT_210907: Enter the number of elements in the array: ");
      int n = scanner.nextInt(); // Nhập n 
      array = new double[n]; // mảng gồm n phần tử 
      System.out.println("Tuan.DT_210907: Enter the array elements:"); // in ra chuỗi 
      for (int i = 0; i < n; i++) {
        System.out.print("Tuan.DT_210907: array[" + i + "]: "); // in ra chuỗi 
        array[i] = scanner.nextDouble(); // nhập array[i]
      }
    } else {
      // Nếu người dùng không nhập
      array = new double[] { 1789.0, 2035.0, 1899.0, 1456.0, 2013.0 };
    }
    // Sắp xếp mảng
    Arrays.sort(array);
    for (double num : array) {
      sum += num;     // Tính tổng
    }
    // Tính trung bình
    double average = sum / array.length;
    // Display the results with the requested formatting
    System.out.println("Tuan.DT_210907: Sorted Array: " + formatArray(array)); // in ra chuỗi 
    System.out.println("Tuan.DT_210907: Sum of Array Elements: " + formatNumber(sum)); // in ra tổng 
    System.out.println("Tuan.DT_210907: Average of Array Elements: " + formatNumber(average)); //in ra trung bình 
  }

}
