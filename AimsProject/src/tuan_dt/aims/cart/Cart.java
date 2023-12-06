package AimsProject.src.tuan_dt.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import AimsProject.src.tuan_dt.aims.media.media;

public class Cart {
	private int qtyOrdered;
	public static final int MAX_NUMBERS_ORDERED = 20;

	private ArrayList<media> itemsOrdered = new ArrayList<media>();

	public void addMedia(media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("Tuan_DT_210907: The cart is full.");
		} else if (itemsOrdered.contains(media)) {
			System.out.println("Tuan_DT_210907: Media already in cart.");
		} else {
			itemsOrdered.add(media);
			System.out.println("Tuan_DT_210907: Added " + media.toString() + " to cart.");
		}
		System.out.println("Tuan_DT_210907: Current items in cart: " + itemsOrdered.size());
	}

	public void removeMedia(media media) {
		if (itemsOrdered.remove(media)) {
			System.out.println("Tuan_DT_210907: Removed " + media.toString() + " from cart.");
		} else {
			System.out.println("Tuan_DT_210907: Couldn't find this item.");
		}
	}

	// lay thong tin title
	public media fetchMedia(String title) {
		for (media m : itemsOrdered) {
			if (m.isMatch(title))
				return m;
		}
		return null;
	}

	// in ra so luong
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("**************************************************");
	}

	public void placeOrder() {
		if (itemsOrdered.isEmpty()) {
			System.out.println("The cart is empty.");
			return;
		}
		itemsOrdered.clear();
		System.out.println("Your order has been placed.");
	}

	// tinh tong tien
	public float totalCost() {
		float cost = 0;
		for (media m : itemsOrdered) {
			cost += m.getCost();
		}
		return cost;
	}

	// sap xep boi title

	public void sortByTitle() {
		Collections.sort(itemsOrdered, media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCost() {
		Collections.sort(itemsOrdered, media.COMPARE_BY_COST_TITLE);
	}

	//sap xep boi gia

	public void printCart() {
		System.out.println("Tuan_DT_210907: ***********************CART***********************");
		System.out.println("Tuan_DT_210907: Ordered Items:\n");
		// Tính tổng số đĩa
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(i + 1 + ". DVD - " + itemsOrdered.get(i).getTitle());
		}
		// in ra tổng số tiền
		System.out.println("Tuan_DT_210907: \nTotal cost: " + totalCost());
		System.out.println("Tuan_DT_210907: ***************************************************");
	}

	public void searchById(int id) {
		// duyệt tất cả các đĩa
		System.out.println("Tuan_DT_210907: Search results for ID: " + id);
		for (media m : itemsOrdered) {
			if (m.getId() == id) {
				System.out.println(m.toString());
				return;
			}
		}
		System.out.println("Tuan_DT_210907: No items found.");
		// nếu không tìm thấy thì in ra chuỗi notfounded + id
	}

	public void searchByTitle(String title) {
		boolean found = false;
		// duyệt tất cả các đĩa nếu trùng thì trả về true
		for (media m : itemsOrdered) {
			if (m.isMatch(title)) {
				System.out.println(m.toString());
				found = true;
			}
		}
		// Nếu không tìm thấy thì trả về not founded
		if (!found) {
			System.out.println("Tuan_DT_210907: Not founded: " + title);
		}
	}
}
