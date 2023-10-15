package lab_01.Bai2_2_6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        String strA, strB, strC;
        // Nhập các hệ số
        strA = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a (a ≠ 0): ",
                "Tuan.DT210907: Input the number", JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input b: ",
                "Tuan.DT210907: Input the number", JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input c: ",
                "Tuan.DT210907: Input the number", JOptionPane.INFORMATION_MESSAGE);
        // Chuyển đổi string => double
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        // Set up dạng format cần đổi
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        // Tính delta Δ
        double delta = b * b - 4 * a * c;
        // Kiểm tra và hiển thị kết quả
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: Error: a cannot be zero (a ≠ 0)",
                    "Tuan.DT210907: Error", JOptionPane.ERROR_MESSAGE);
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: The equation has no solution", "Tuan.DT210907: Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            // Chuyển format của x
            String formattedResultX = decimalFormat.format(x);
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: One real double root:\nx = " + formattedResultX,
                    "Tuan.DT210907: Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            String formattedResultX1 = decimalFormat.format(x1);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            String formattedResultX2 = decimalFormat.format(x2);
            JOptionPane.showMessageDialog(null,
                    "Tuan.DT210907: Two real roots:\nx1 = " + formattedResultX1 + "\nx2 = " + formattedResultX2,
                    "Tuan.DT210907: Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
