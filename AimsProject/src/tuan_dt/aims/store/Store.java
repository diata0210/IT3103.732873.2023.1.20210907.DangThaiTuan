package AimsProject.src.tuan_dt.aims.store;

import AimsProject.src.tuan_dt.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[];
    private static final int MAX_ITEMS = 100; 
    
    public Store() {
        // Khởi tạo 1 mảng chứa 100 phần tử item trong store
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    }
    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            // nếu phần tử đó bằng null thì thì add thêm đĩa vào cửa hàng
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("Tuan_DT_210907: Added DVD to the store: " + dvd.getTitle());
                return;
            }
        }
        // nếu duyệt hết phần tử mà không kết thúc thì sẽ không thêm được DVD
        System.out.println("Tuan_DT_210907: Store is full. Cannot add DVD: " + dvd.getTitle());
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (itemsInStore[i] == dvd) {
                itemsInStore[i] = null;
                System.out.println("Tuan_DT_210907: Removed DVD from the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("Tuan_DT_210907: DVD not found in the store: " + dvd.getTitle());
    }

    public void displayItemsInStore() {
        System.out.println("Tuan_DT_210907: Items in the store:");
        for (DigitalVideoDisc dvd : itemsInStore) {
            if (dvd != null) {
                System.out.println("Tuan_DT_210907: - " + dvd.getTitle());
            }
        }
    }
}