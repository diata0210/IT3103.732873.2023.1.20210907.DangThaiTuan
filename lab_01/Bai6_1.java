package lab_01;
import javax.swing.JOptionPane;
public class Bai6_1 {
  public static void main(String[] args) {
    int option = JOptionPane.showConfirmDialog(null, "Tuan.DT_210907: Do u wanna change to the first class ticket?");
    System.out.println("option: " + JOptionPane.YES_OPTION);
    JOptionPane.showMessageDialog(null, "Tuan.DT_210907: u've chosen: " + (option == JOptionPane.YES_OPTION?"I do":"I don't"));

    System.exit(0);
  }
}
