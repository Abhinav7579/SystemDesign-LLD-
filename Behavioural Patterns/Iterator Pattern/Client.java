import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        BookCollection bookcollection=new BookCollection();
        bookcollection.addBook(new Book("c++"));
        bookcollection.addBook(new Book("java"));
        Iterator<Book> iterator=bookcollection.iterator();
        while(iterator.hasNext()){
            Book book=iterator.next();
            System.out.println(book);
        }
    }
}
