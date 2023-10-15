package lab_01;

import javax.swing.JOptionPane;

public class Bai2_2_5 {
  public static void main(String[] args) {
    String strNum1, strNum2;
    // Nhập số thứ 1
    strNum1 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input the first number: ",
        "Tuan.DT210907: Input the first number", JOptionPane.INFORMATION_MESSAGE);
    // Nhập số thứ 2
    strNum2 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input the second number: ",
        "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    double num1 = Double.parseDouble(strNum1); // Chuyển từ string => double 
    double num2 = Double.parseDouble(strNum2); // Chuyển từ string => double 

    double resultPlus = num1 + num2; // tính tổng
    double resultMinus = num1 - num2; // tính trừ
    double resultMul = num1 * num2; // tính nhân
    double resultDiv; // chia 

    if (num2 == 0) {
      JOptionPane.showMessageDialog(null, "Tuan.DT210907: Error: Division by zero", "Tuan.DT210907: Error", JOptionPane.ERROR_MESSAGE);
    } else {
      resultDiv = num1 / num2;
      JOptionPane.showMessageDialog(null, "Tuan.DT210907: \n" + "Addition: " + resultPlus + "\nSubtraction: " + resultMinus
          + "\nMultiplication: " + resultMul + "\nDivision: " + resultDiv, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
