import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import javax.swing.text.Document;
import java.io.IOException;

public class Wikiscrapper {
    public static void main(String args[]) throws IOException {


     String url = "https://en.wikipedia.org/wiki/List_of_The_Flash_characters";
        org.jsoup.nodes.Document wiki = Jsoup.connect(url).get();
        System.out.println(wiki.title());
        for(Element row: wiki.select("div.toc").select("li.toclevel-1.tocsection-2").select("ul").select("li").select("span.toctext")){
            System.out.println(row.text());
        }
    }
}
