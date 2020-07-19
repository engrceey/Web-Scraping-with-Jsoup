import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class WebScrapper{
    public static void main(String[] args) {
        final String url = "https://www.african-markets.com/en/tools/performance";

        try{
            final Document document = Jsoup.connect(url).get();
            String table = "#at_133 tr";
            Elements docSelect = document.select(table);
            ArrayList<String> stockList = new ArrayList<>();
            for(Element e : docSelect) {
                stockList.add(e.text());
            }
            for(String str : stockList) {

                System.out.println("==========================================================================");
                System.out.println("* "+str);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
