package AimsProject.src.tuan_dt.test;

import AimsProject.src.tuan_dt.aims.disc.DigitalVideoDisc;
import AimsProject.src.tuan_dt.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 25.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        store.displayItemsInStore();

        store.removeDVD(dvd2);

        store.displayItemsInStore();
    }
}
