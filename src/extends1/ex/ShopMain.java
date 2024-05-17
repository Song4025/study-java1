package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("java", 10000, "han", "12345");
        Album album = new Album("앨범", 15000, "seo");
        Movie movie = new Movie("영화1", 20000, "봉준호", "최우식");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrint() + album.getPrint() + movie.getPrint();
        System.out.println("상품 가격의 합: "+sum);
    }
}
