package nested.test.ex1;
public class Library {
    private Book[] books;
    private int bookCount;
    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }
    //영한샘은 정상로직과 예외로직지 안섞여 잇는걸 선호 - 검증로직이 더 많을때는 훨씬 깔끔한 스타일이 됨
    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " +
                    books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}