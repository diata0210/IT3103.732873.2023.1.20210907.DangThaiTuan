package lab_01.Bai2_2_6;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class LinearSystemSolver {
  public static void main(String[] args) {
    // a11*x1+a12*x2=b1
    String strA11 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a11: ",
        "Tuan.DT210907: Input the first number", JOptionPane.INFORMATION_MESSAGE);
    String strA12 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a12: ",
        "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    String strB1 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input b1: ",
        "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    // a21*x1+a22*x2=b2
    String strA21 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a21: ",
        "Tuan.DT210907: Input the first number", JOptionPane.INFORMATION_MESSAGE);
    String strA22 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a22: ",
        "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    String strB2 = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input b2: ",
        "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    // Chuyển từ string -> double
    DecimalFormat decimalFormat = new DecimalFormat("#.####");     // Cài đặt format
    double a11 = Double.parseDouble(strA11);
    double a12 = Double.parseDouble(strA12);
    double a21 = Double.parseDouble(strA21);
    double a22 = Double.parseDouble(strA22);
    double b1 = Double.parseDouble(strB1);
    double b2 = Double.parseDouble(strB2);
    // Tìm D, D1, D2 để tính nghiệm và check điều kiẹn có nghiệm
    double D = a11 * a22 - a21 * a12;
    double D1 = b1 * a22 - b2 * a12;
    double D2 = a11 * b2 - a21 * b1;
    if (D == 0) {
      if (D1 != 0 || D2 != 0) {
        JOptionPane.showMessageDialog(null, "Tuan.DT210907: The equation has no solution", "Tuan.DT210907: Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
    }
    double x1 = D1 / D;
    double x2 = D2 / D;
    String formattedResultX1 = decimalFormat.format(x1);
    String formattedResultX2 = decimalFormat.format(x2);
    JOptionPane.showMessageDialog(null, "Tuan.DT210907: Solution:\nx1 = " + formattedResultX1 + "\nx2 = " + formattedResultX2,
        "Tuan.DT210907: Result", JOptionPane.INFORMATION_MESSAGE);
  }
}
