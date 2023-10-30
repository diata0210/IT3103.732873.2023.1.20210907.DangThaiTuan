package lab_01;
import java.util.Scanner;
public class Bai6_4 {
  // Hàm để xác định tháng khi nhập chuỗi
  public static int getValidMonthInput(String input, String[] monthNames, String[] monthAbbreviations,
    // Khai báo 1 mảng gồm các chuỗi có 3 chữ cái viết tắt 
    String[] monthAbbreviation_3leStrings) {
      // chuyển input từ thường -> hoa 
    String inputLower = input.toLowerCase();
    // Kiểm tra chuỗi nhập vào có trùng với các tên tháng, viết tắt, viết tắt 3 chữ cái của các tháng hay không
    // Nếu trùng, trả về vị trí của tháng đó (tính từ 1 đến 12), nếu không trùng, trả về -1
    for (int i = 0; i < 12; i++) {
      if ((monthNames[i].toLowerCase().equals(inputLower)
          || monthAbbreviations[i].toLowerCase().equals(inputLower)
          || monthAbbreviation_3leStrings[i].toLowerCase().equals(inputLower))) {
        return i + 1;
      }
    }
    return -1;
  }

  // Hàm xác định kí tự nhập vào có phải là số hay không?
  public static boolean isNumeric(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Tạo ra các mảng lưu các chuỗi có nghĩa để search
    String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" }; // Mảng gồm tên 12 tháng 
    String[] monthAbbreviations = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.",
        "Nov.", "Dec." }; // Mảng gồm tên 12 tháng viết tắt 
    String[] monthAbbreviation_3leStrings = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
        "Nov", "Dec" };  // Mảng gồm tên 12 tháng viết tắt 
    int month; // biến tháng
    String monthInput; // biến tháng được nhập vào 
    do {
      System.out.print("Tuan.DT_210907: Please enter the month (e.g., January, Jan., Jan, 1): "); // in ra chuỗi
      monthInput = scanner.next();  // nhập tháng từ màn hình
      // nếu hợp lệ -> gán biến monthInput -> month nếu không chạy lại 
      if (isNumeric(monthInput)) {
        month = Integer.parseInt(monthInput);
      } else {
        month = getValidMonthInput(monthInput, monthNames, monthAbbreviations, monthAbbreviation_3leStrings);
      }
    } while (month < 1 || month > 12);
    // xét tính hợp lệ của năm 
    int year = -1;
    do {
      System.out.print("Tuan.DT_210907: Please enter the year (e.g., 1999): ");
      if (scanner.hasNextInt()) {
        year = scanner.nextInt();
      } else {
        scanner.next();
        year = -1;
      }
    } while (year < 0);

    // Check xem có phải năm nhuận hay không ?
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    int[] daysInMonth = { 0, 31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // Tìm xem tháng được nhập vào có bao nhiêu ngày
    int numsDayInMonth = daysInMonth[month];
    System.out.println("Tuan.DT_210907:\n" + month + "/" + year + " has " + numsDayInMonth + " days.");
  }

}