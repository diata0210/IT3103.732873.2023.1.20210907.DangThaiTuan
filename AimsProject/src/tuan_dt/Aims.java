package AimsProject.src.tuan_dt;

import AimsProject.src.tuan_dt.aims.cart.Cart;
import AimsProject.src.tuan_dt.aims.disc.DigitalVideoDisc;

public class Aims {
  public static void main(String[] args) {
    Cart anOrder = new Cart();
    // tạo đối tượng dvd1
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 89, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);
    // tạo đối tượng dvd2
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);
    // tạo đối tượng dvd3
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
    anOrder.addDigitalVideoDisc(dvd3);
    System.out.println("Tuan.DT210907: Total Cost is: ");
    System.out.println(anOrder.totalCost());

  }
}
