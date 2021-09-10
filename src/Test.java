import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Test {
    public static boolean  isValid2(String url) {
        try {
            Document tempDoc=null;
            tempDoc = (Document) Jsoup.connect(url).get();
            new URL(url).toURI();
            return true;
        }

        catch (Exception ex) {
            return false;
        }
    }
    public static void main(String[] args) throws IOException {

            String url ="https://github.com/";
            if(isValid2(url))
                System.out.println("true");
            else
                System.out.println("False");
            //new URL(url).toURI();


        new GUI_Input();

    }
}
