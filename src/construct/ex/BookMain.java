package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("나무","베르나르베르베르");
        book2.displayInfo();

        Book book3 = new Book("불변의 법칙","모건 하우절", 998);
        book3.displayInfo();
    }
}
