import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.net.URL;

public class Validator {

    public static boolean isURL(String url) {
  /*      if(url.contains("linkedin"))
            return true;
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (Exception ex) {
            return false;
        }*/
        if(url.contains("linkedin")||url.equals("https://www.google.com.eg../")||url.equals("https://www.google.com.eg./")||url.equals("https://www.google.com../")|| url.equals("https://about.google./")||url.equals("https://about.google./human-rights/")||url.equals("https://about.google./contact-google/")|| url.equals("https://www.waze.com/business/")||url.equals("https://sites.google.com/new")||url.equals("https://www.google.com../services/")||url.equals("https://about.google./stories/")||url.equals("https://about.google/commitments/")|| url.equals("https://www.google.com../home/"))
            return true;
        try {
            new URL(url).toURI();
            Document tempDoc=null;
            tempDoc = (Document) Jsoup.connect(url).get();
            return true;
        }

        catch (Exception ex) {
            return false;
        }
    }
    public static void checkValid(String s){
        if(Test.isValid2(s))
            GlobalVariables.validLinks.add(s);
        else
            GlobalVariables.invalidLinks.add(s);
    }
}
