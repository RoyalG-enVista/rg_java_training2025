package day2.q2;

public class BookStore {
    private final int SIZE;
    private String bookStoreName;
    private Book[] books;

    public BookStore(String bookStoreName, int size){
        SIZE=size;
        this.bookStoreName=bookStoreName;
        this.books= new Book[];
        init();
    }
    private void init() {
        books[0]=new Book("A Time to Kill", "by John Grisham", "45545A12", 10);
        books[1]=new Book("Absalom, Absalom!", "by William Faulkner", "98595A12", 20);
        books[2]=new Book("The House of Mirth", "by Edith Wharton", "77545A12", 8);
        books[3]=new Book("East of Eden", "by John Steinbeck", "foo", "98545A12", 20);
        books[4]=new Book("The Sun Also Rises", "by Ernest Hemingway", "bar", "90545A12", 10);
    }

}
