package lab_01;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
  public static void main(String[] args) {
    String strNum1, strNum2;
    String strNotifycation = "Tuan.DT_210907: You've just entered: ";
    strNum1 = JOptionPane.showInputDialog(null, "Tuan.DT_210907:  Please input the first number: ",
        "Tuan.DT_210907: Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
    strNotifycation += strNum1 + " and ";
    strNum2 = JOptionPane.showInputDialog(null, "Tuan.DT_210907: Please input the second number: ",
        "Tuan.DT_210907: Input the second number", JOptionPane.INFORMATION_MESSAGE);
    strNotifycation += strNum2;
    JOptionPane.showMessageDialog(null, strNotifycation, "Tuan.DT_210907: Show two numbers",
        JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);

  }
}