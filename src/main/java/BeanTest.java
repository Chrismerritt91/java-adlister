import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Authors jackCarr = new Authors();
        Authors tomClancy = new Authors();

        Quotes hemingway = new Quotes(3,"content", "Ernest");
        Quotes twain = new Quotes(4, "content 2", "Mark");

        Albums theWall = new Albums();
        Albums killerQueen = new Albums();

        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(hemingway);
        quotes.add(twain);

        for (Quotes quote: quotes) {
            System.out.println(quote.getAuthor() + " " + quote.getContent());
        }

    }
}
