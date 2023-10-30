package lab_01;
import java.util.Scanner;
public class Bai6_6 {
  public static void main(String[] args) {
    // Khai báo scanner -> nhập thông tin 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Tuan.DT_210907: Do u want to enter matrix (Y/N): ");
    String optionInput = scanner.next();

    double[][] matrix1; // ma trận 1 
    double[][] matrix2; // Ma trận 2.
    int rows = 3, columns = 3; // Khai báo số hàng số cột mặc định 
    double[][] result = new double[rows][columns];
    // Nếu người dùng chọn Y 
    if (optionInput.equalsIgnoreCase("Y")) {
      System.out.print("Tuan.DT_210907: Enter the number of rows: ");
      rows = scanner.nextInt(); // nhập rows
      System.out.print("Tuan.DT_210907: Enter the number of columns: ");
      columns = scanner.nextInt(); // Nhập columns
      matrix1 = new double[rows][columns]; // ma trận 1 
      matrix2 = new double[rows][columns]; // ma trận 2 
      // Nhập giá trị cho ma trận 1
      System.out.println("Tuan.DT_210907: Enter elements for the first matrix:");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print("Tuan.DT_210907: Enter element [" + i + "][" + j + "]: ");
          matrix1[i][j] = scanner.nextDouble();
        }
      }
      // Nhập giá trị cho ma trận 2
      System.out.println("Tuan.DT_210907: Enter elements for the second matrix:");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print("Tuan.DT_210907: Enter element [" + i + "][" + j + "]: ");
          matrix2[i][j] = scanner.nextDouble();
        }
      }
    } else {
      // Nếu người dùng không nhập
      matrix1 = new double[][] {
          { 1, 1, 1 },
          { 1, 1, 1 },
          { 1, 1, 1 }
      }; // ma trận mặc định
      matrix2 = new double[][] {
          { 1, 1, 1 },
          { 1, 1, 1 },
          { 1, 1, 1 }
      };
    } // ma trận mặc định

    // Thực hiện phép cộng ma trận
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j]; // ma trận mới sẽ được tính bằng 
      }
    }
    // Hiển thị ma trận 1:
    System.out.println("Tuan.DT_210907: Matrix 1:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
    // Hiển thị ma trận 2:
    System.out.println("Tuan.DT_210907: Matrix 2:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix2[i][j] + " ");
      }
      System.out.println();
    }
    // Hiển thị ma trận kết quả
    System.out.println("Tuan.DT_210907: Result Matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }

    
  }
}
