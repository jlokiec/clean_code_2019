package pl.zzpj2019.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter implements Printable {
    @Override
    public void printAllPages(Book book) {
        String bookPages = "";
        for (Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            bookPages += (page.getKey() + " " + page.getValue());
        }
        System.out.println(bookPages);
    }

    @Override
    public void printPage(Book book, int pageNumber) {
        if (book.getPages().containsKey(pageNumber)) {
            String bookPage = book.getPages().get(pageNumber);
            System.out.println(bookPage);
        } else {
            System.out.println("There is no such page in this book.");
        }
    }
}
