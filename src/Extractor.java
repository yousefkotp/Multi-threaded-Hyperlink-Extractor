import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class Extractor {


    public static void extractLinks(String link) throws IOException {
       Document doc = Jsoup.connect(link).get();
        URL url = new URL(link);
        String baseURL = url.getProtocol()+"://"+url.getHost();

        Elements elements = doc.select("a[href]");
        for (Element element : elements) {
            String x = element.attr("href");
            if(x.startsWith("http"))
                GlobalVariables.links.add(x);
            else {
                x = baseURL + x;
                GlobalVariables.links.add(x);
            }

        }

    }


}
