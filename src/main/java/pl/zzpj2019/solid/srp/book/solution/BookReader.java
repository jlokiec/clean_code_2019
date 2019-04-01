package pl.zzpj2019.solid.srp.book.solution;

public class BookReader implements Readable {
    private Book book;
    private int currentPage = 0;

    public BookReader(Book book) {
        this.book = book;
    }

    @Override
    public String getCurrentPageContents() {
        return book.getPages().getOrDefault(currentPage, "There is no such page in this book.");
    }

    @Override
    public void turnPage() {
        currentPage++;
    }
}
