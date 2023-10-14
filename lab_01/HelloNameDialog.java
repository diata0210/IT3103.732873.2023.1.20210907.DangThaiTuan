package lab_01;
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "Tuan.DT_210907: Please inter your name");
        JOptionPane.showMessageDialog(null, "Tuan.DT_210907: Hi " + result + "!");
        System.exit(0);
    }
}
