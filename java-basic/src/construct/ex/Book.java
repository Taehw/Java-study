package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: "  + author+ ", 페이지: " + page);
    }

    //생성자를 이미 정의해버렸기 대문에 기본생성자도 또 따로 만들어주어야 한다.
    Book() {
        this(" ", " ", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
