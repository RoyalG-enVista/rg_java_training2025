package day2.q2;

public class Ans2Q2 {
    public static void main(String[] args) {
        BookStore bookStore=new BookStore("rich dad poor dad", 10);
        bookStore.sell("basic physics", 2);
        bookStore.display();
    }
}
