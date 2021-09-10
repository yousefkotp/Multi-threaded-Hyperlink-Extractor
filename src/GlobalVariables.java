import java.util.ArrayList;

public class GlobalVariables {
    public static String url;
    public static int no_depth;
    public static int no_threads;
    public static int current_depth=0;
    public static ArrayList<String> links = new ArrayList<String>();
    public static ArrayList<String> validLinks = new ArrayList<String>();
    public static ArrayList<String> invalidLinks = new ArrayList<String>();
    public static int counter =0;


}   /*How to use Arraylist:
Constructor
        ArrayList<String> arrayList=new ArrayList<>();
        Adding elements
        arrayList.add(String string);
        arrayList.remove(i) where i is the index number
        arrayList.get(i);
        arrayList.set(i,String string);
    */