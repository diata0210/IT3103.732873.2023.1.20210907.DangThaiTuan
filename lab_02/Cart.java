package lab_02;

public class Cart {
  private int qtyOrdered;
  public static final int MAX_NUMBERS_ORDERED = 20;
  private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    // Kiểm tra xem còn chỗ trống trong mảng để thêm đĩa không
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
      itemsOrdered[qtyOrdered] = disc; // Thêm vào mảng
      qtyOrdered++; // Tăng số lượng đã thêm vào
      System.out.println("Tuan.DT210907: The disc has been added"); // In thông báo thêm thành công
    } else {
      System.out.println("Tuan.DT210907: The cart is almost full"); // In thông báo nếu đầy
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    for (DigitalVideoDisc disc : dvdList) {
      // Kiểm tra xem số lượng đĩa đã đầy chưa 
      if (qtyOrdered < MAX_NUMBERS_ORDERED) {
        itemsOrdered[qtyOrdered] = disc; // Thêm đĩa 
        qtyOrdered++; // Tăng số lượng đĩa hiện tại lên 1
        System.out.println("Tuan.DT210907: The disc '" + disc.getTitle() + "' has been added");
      } else {
        System.out.println("Tuan.DT210907: The cart is almost full. Cannot add '" + disc.getTitle() + "'");
      }
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    // Kiểm tra xem hiện tại đã đầy chưa.
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
      // thêm đĩa dvd1 
      itemsOrdered[qtyOrdered] = dvd1;
      qtyOrdered++;
      System.out.println("Tuan.DT210907: The disc '" + dvd1.getTitle() + "' has been added");
    } else {
      System.out.println("Tuan.DT210907: The cart is almost full. Cannot add '" + dvd1.getTitle() + "'");
    }

    // Kiểm tra xem hiện tại đã đầy chưa.
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
      // thêm đĩa dvd2
      itemsOrdered[qtyOrdered] = dvd2; 
      qtyOrdered++;
      System.out.println("Tuan.DT210907: The disc '" + dvd2.getTitle() + "' has been added");
    } else {
      System.out.println("Tuan.DT210907: The cart is almost full. Cannot add '" + dvd2.getTitle() + "'");
    }
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    boolean found = false;
    int index = 0;
    // Tìm vị trí của đĩa cần xóa trong mảng
    for (int i = 0; i < qtyOrdered; i++) {
      if (itemsOrdered[i] == disc) {
        found = true;
        index = i;
        break;
      }
    }

    if (found) {
      // Di chuyển các phần tử còn lại của mảng để loại bỏ đĩa
      for (int i = index; i < qtyOrdered - 1; i++) {
        itemsOrdered[i] = itemsOrdered[i + 1];
      }
      // Đặt phần tử cuối cùng trong mảng thành null
      itemsOrdered[qtyOrdered - 1] = null;
      qtyOrdered--; // Giảm số lượng đĩa đã thêm vào giỏ hàng
      System.out.println("Tuan.DT210907: Removed '" + disc.getTitle() + "' from the cart."); // In thông báo xóa
                                                                                             // đĩa thành công
    } else {
      System.out.println("Tuan.DT210907: The disc is not in the cart."); // In thông báo nếu đĩa không có trong
                                                                         // giỏ hàng
    }
  }

  public float totalCost() {
    float total = 0;
    for (int i = 0; i < qtyOrdered; i++) {
      total += itemsOrdered[i].getCost();
    }
    return total;
  }
}
