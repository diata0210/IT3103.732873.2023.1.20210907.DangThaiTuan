package AimsProject.src.tuan_dt.aims.media.aim;

import java.util.Scanner;

import AimsProject.src.tuan_dt.aims.cart.Cart;
import AimsProject.src.tuan_dt.aims.media.CompactDisc;
import AimsProject.src.tuan_dt.aims.disc.DigitalVideoDisc;
import AimsProject.src.tuan_dt.aims.media.media;
import AimsProject.src.tuan_dt.aims.store.Store;

public class aims {

	private static final String PREFIX = "Tuan.DT_210907 ";

	private static final int VIEW_STORE = 1;
	private static final int UPDATE_STORE = 2;
	private static final int SEE_CURRENT_CART = 3;
	private static final int EXIT = 0;

	private static final int SEE_MEDIA_DETAILS = 1;
	private static final int ADD_TO_CART = 2;
	private static final int PLAY_MEDIA = 3;
	private static final int SEE_CURRENT_CART_STORE = 4;

	private static final int ADD_TO_STORE = 1;
	private static final int REMOVE_FROM_STORE = 2;

	private static final int FILTER_IN_CART = 1;
	private static final int SORT_IN_CART = 2;
	private static final int REMOVE_FROM_CART = 3;
	private static final int PLAY_MEDIA_IN_CART = 4;
	private static final int PLACE_ORDER = 5;

	private static Scanner sc;
	private static Store store;
	private static Cart cart;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		store = new Store();
		cart = new Cart();
		showMenu();
		sc.close();
	}

	public static String inputMediaTitle() {
		System.out.print(PREFIX + "Enter title: ");
		sc.nextLine(); // Clear buffer
		return sc.nextLine();
	}

	public static void showMenu() {
		System.out.println(PREFIX + "AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out
				.println("Please choose a number: " + EXIT + "-" + VIEW_STORE + "-" + UPDATE_STORE + "-" + SEE_CURRENT_CART);

		switch (sc.nextInt()) {
			case EXIT:
				System.out.println(PREFIX + "Application closed.");
				return;
			case VIEW_STORE:
				storeMenu();
				break;
			case UPDATE_STORE:
				updateStoreMenu();
				break;
			case SEE_CURRENT_CART:
				cartMenu();
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
		showMenu();
	}

	public static void storeMenu() {
		store.displayItems();
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + SEE_MEDIA_DETAILS + "-" + ADD_TO_CART + "-" + PLAY_MEDIA + "-"
				+ SEE_CURRENT_CART_STORE + "-" + EXIT);

		switch (sc.nextInt()) {
			case SEE_MEDIA_DETAILS:
				mediaDetailsMenu();
				break;
			case ADD_TO_CART:
				addMediaToCartMenu();
				break;
			case PLAY_MEDIA:
				playMediaFromStore();
				break;
			case SEE_CURRENT_CART_STORE:
				cartMenu();
				break;
			case EXIT:
				return;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
		storeMenu();
	}

	public static void mediaDetailsMenu() {
		media media = store.fetchMedia(inputMediaTitle());
		if (media == null) {
			System.out.println(PREFIX + "Item not found.");
			return;
		}
		System.out.println(media.getDetails());
		boolean playable = media instanceof DigitalVideoDisc || media instanceof CompactDisc;
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		if (playable)
			System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println(
				"Please choose a number: " + EXIT + "-" + ADD_TO_CART + (playable ? "-" + PLAY_MEDIA : "") + "-" + EXIT);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case ADD_TO_CART:
				cart.addMedia(media);
				break;
			case PLAY_MEDIA:
				playMedia(media);
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
	}

	public static void playMediaFromStore() {
		media media = store.fetchMedia(inputMediaTitle());
		playMedia(media);
	}

	public static void playMedia(media media) {
		if (media == null) {
			System.out.println(PREFIX + "Item not found.");
			return;
		}

		if (media instanceof DigitalVideoDisc)
			((DigitalVideoDisc) media).play();
		else if (media instanceof CompactDisc)
			((CompactDisc) media).play();
		else {
			System.out.println(PREFIX + "Cannot play this media.");
		}
	}

	public static void updateStoreMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media to store");
		System.out.println("2. Remove a media from store.");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + EXIT + "-" + ADD_TO_STORE + "-" + REMOVE_FROM_STORE);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case ADD_TO_STORE:
				addMediaToStoreMenu();
				break;
			case REMOVE_FROM_STORE:
				removeMediaFromStoreMenu();
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
		updateStoreMenu();
	}

	public static void addMediaToStoreMenu() {
		System.out.println("Choose type of media: ");
		System.out.println("--------------------------------");
		System.out.println("1. Digital Video Disc (DVD)");
		System.out.println("2. Compact Disc (CD)");
		System.out.println("3. Book");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + EXIT + "-" + ADD_TO_STORE + "-" + REMOVE_FROM_STORE + "-" + EXIT);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case ADD_TO_STORE:
				store.addMedia(DigitalVideoDisc.createDVD());
				break;
			case REMOVE_FROM_STORE:
				store.addMedia(CompactDisc.createCD());
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
	}

	public static void playMediaFromCart() {
		media media = cart.fetchMedia(inputMediaTitle());
		playMedia(media);
	}

	public static void removeMediaFromStoreMenu() {
		media media = store.fetchMedia(inputMediaTitle());
		if (media == null) {
			System.out.println(PREFIX + "Item not found.");
			return;
		}

		store.removeMedia(media);
	}

	public static void cartMenu() {
		cart.print();
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + EXIT + "-" + FILTER_IN_CART + "-" + SORT_IN_CART + "-"
				+ REMOVE_FROM_CART + "-" + PLAY_MEDIA_IN_CART + "-" + PLACE_ORDER);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case FILTER_IN_CART:
				filterCartMenu();
				break;
			case SORT_IN_CART:
				sortCartMenu();
				break;
			case REMOVE_FROM_CART:
				removeMediaFromCartMenu();
				break;
			case PLAY_MEDIA_IN_CART:
				playMediaFromCart();
				break;
			case PLACE_ORDER:
				cart.placeOrder();
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
		cartMenu();
	}

	public static void filterCartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + EXIT + "-" + FILTER_IN_CART + "-" + SORT_IN_CART);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case FILTER_IN_CART:
				System.out.print(PREFIX + "Enter ID: ");
				cart.searchById(sc.nextInt());
				break;
			case SORT_IN_CART:
				cart.searchByTitle(inputMediaTitle());
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
	}

	public static void sortCartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: " + EXIT + "-" + SORT_IN_CART + "-" + REMOVE_FROM_CART);

		switch (sc.nextInt()) {
			case EXIT:
				return;
			case SORT_IN_CART:
				cart.sortByTitle();
				break;
			case REMOVE_FROM_CART:
				cart.sortByCost();
				break;
			default:
				System.out.println(PREFIX + "Invalid choice.");
		}
	}

	public static void addMediaToCartMenu() {
		media media = store.fetchMedia(inputMediaTitle());
		if (media == null) {
			System.out.println(PREFIX + "Item not found.");
			return;
		}
		cart.addMedia(media);
	}

	public static void removeMediaFromCartMenu() {
		media media = cart.fetchMedia(inputMediaTitle());
		if (media == null) {
			System.out.println(PREFIX + "Item not found.");
			return;
		}
		cart.removeMedia(media);
	}
}
