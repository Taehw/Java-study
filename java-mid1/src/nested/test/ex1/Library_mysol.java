package nested.test.ex1;

public class Library_mysol {

    private int maxNum;
    private static int booknumber = 0;
    private Book[] books = new Book[maxNum]; //생성자에서 초기화되기전에 사용되기 때문에 books 배열의 크기는 항상 0

    public Library_mysol(int maxNum) {
        this.maxNum = maxNum;
    }

    public void showBooks() {

        for (Book book : books) {
            System.out.println("도서 제목: " + book.title+", 저자: " + book.author);
        }
    }

    class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {

        Book book = new Book(title, author);

        if (booknumber < 4) {

            books[0] = book;
            booknumber++;

        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
}
