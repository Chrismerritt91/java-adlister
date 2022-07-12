import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Author jackCarr = new Author(1,"Jack","Carr");
        Author tomClancy = new Author(2, "Tom", "Clancy");

        Quotes hemingway = new Quotes(1,"content", jackCarr);
        Quotes twain = new Quotes(2, "content 2", tomClancy);

        Albums theWall = new Albums();
        Albums killerQueen = new Albums();

        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(hemingway);
        quotes.add(twain);

        for (Quotes quote: quotes) {
            System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name() + " " + quote.getContent());
        }

    }
}
