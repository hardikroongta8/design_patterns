package prototype_pattern;

public class PrototypePatternDemo {
    public static void showDemo() {
        BookShop bs1 = new BookShop();
        bs1.setShopName("Barnes & Noble");
        bs1.loadBooks();

        BookShop bs2 = bs1.clone();
        bs2.setShopName("Novelty");

        bs1.getBooks().remove(1);

        System.out.println(bs1);
        System.out.println(bs2);
    }
}
