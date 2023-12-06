package AimsProject.src.tuan_dt.aims.store;
import java.util.ArrayList;
import AimsProject.src.tuan_dt.aims.media.media;
public class Store {
    private ArrayList<media> itemsInStore = new ArrayList<media>();

    public void addMedia(media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("Item already in store.");
		} else {
			itemsInStore.add(media);
            System.out.println("Tuan_DT_210907: Added DVD to the store: " + media.toString());
		}
	}

	public void removeMedia(media media) {
		if (itemsInStore.remove(media)) {
			System.out.println("Removed " + media.toString() + " from store.");
		} else {
        System.out.println("Tuan_DT_210907: DVD not found in the store: ");
		}
	}
	
	public void displayItems() {
		System.out.println("\n***********************STORE***********************");
		for (media m: itemsInStore) {
			System.out.println(m.toString());
		}
		System.out.println("***************************************************");
	}
	public media fetchMedia(String title) {
		for (media m : itemsInStore) {
			if (m.isMatch(title))
				return m;
		}
		return null;
	}
}