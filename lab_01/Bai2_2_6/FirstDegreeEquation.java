package lab_01.Bai2_2_6;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input a: ",
                "Tuan.DT210907: Input the first number", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null, "Tuan.DT210907: Please input b: ",
                "Tuan.DT210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        // Set up dạng format cần đổi 
        DecimalFormat decimalFormat = new DecimalFormat("#.####"); 
        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: Infinitely many roots", "Tuan.DT210907: Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: The equation has no solution", "Tuan.DT210907: Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double result = -(b / a);
            // Đổi format nếu result = 0 từ trừ -0.0 -> 0.0
            if (result == -0.0) {
              result = 0; 
            }
            // Chuyển format của result
            String formattedResult = decimalFormat.format(result);
            JOptionPane.showMessageDialog(null, "Tuan.DT210907: Result: " + formattedResult, "Tuan.DT210907: Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
