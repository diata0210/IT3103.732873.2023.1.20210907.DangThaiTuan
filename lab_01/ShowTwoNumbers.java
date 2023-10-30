package lab_01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
  public static void main(String[] args) { // Phương thức main, là điểm bắt đầu của chương trình
    String strNum1, strNum2; // Khai báo hai biến kiểu chuỗi (String) có tên lần lượt là strNum1 và strNum2
    String strNotifycation = "Tuan.DT_210907: You've just entered: "; // Khai báo và khởi tạo biến strNotifycation với
                                                                      // giá trị ban đầu là chuỗi "Tuan.DT_210907:
                                                                      // You've just entered: "
    // Hiển thị hộp thoại để nhập số thứ nhất và lưu giá trị vào biến strNum1
    strNum1 = JOptionPane.showInputDialog(
        null,
        "Tuan.DT_210907:  Please input the first number: ",
        "Tuan.DT_210907: Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
    // Nối chuỗi số thứ nhất vào biến strNotifycation
    strNotifycation += strNum1 + " and ";
    // Hiển thị hộp thoại để nhập số thứ hai và lưu giá trị vào biến strNum2
    strNum2 = JOptionPane.showInputDialog( null, 
                                                  "Tuan.DT_210907: Please input the second number: ", 
                                                          "Tuan.DT_210907: Input the second number",
        JOptionPane.INFORMATION_MESSAGE);
    // Nối chuỗi số thứ hai vào biến strNotifycation
    strNotifycation += strNum2;
    // Hiển thị hộp thoại thông báo chứa chuỗi strNotifycation
    JOptionPane.showMessageDialog( null, 
                                                    strNotifycation, 
                                                    "Tuan.DT_210907: Show two numbers", 
                                                    JOptionPane.INFORMATION_MESSAGE);
  }
}
