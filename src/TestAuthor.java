import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Rojer Garnison", 'M', "nepoidu@yeah.com");
        System.out.println(a);
        a.setEmail("Rob.h.t");
        System.out.println(a);
        System.out.println(a.getEmail());
    }
}