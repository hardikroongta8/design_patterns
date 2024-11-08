package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books;

    public BookShop() {
        books = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBookId(i + 1);
            b.setBookName("Book " + b.getBookId());
            getBooks().add(b);
        }
    }

    @Override
    protected BookShop clone() {
        BookShop bs = new BookShop();
        for (Book b : this.getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
