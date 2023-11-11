package lab_02;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Tuan.DT21907: Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Tuan.DT21907:  Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Tuan.DT21907: Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Tuan.DT21907: Cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmp);
    }
}