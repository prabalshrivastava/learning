package learning.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;
    private List<Book> books = new ArrayList<Book>();

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

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book(i, "bookName" + i);
            books.add(b);
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop b = new BookShop();
        for (Book book : this.getBooks()) {
            b.getBooks().add(book);
        }
        return b;
    }

    //case 2
    //	@Override
    //	protected Object clone() throws CloneNotSupportedException {
    //		return super.clone();
    //	}

    //case 3

}
