package extend1.ex;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범 1", 15000, "seo");
        movie movie1 = new movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie1.print();

        int sum = book.getPrice() + album.getPrice() + movie1.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
