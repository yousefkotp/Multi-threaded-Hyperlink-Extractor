import java.io.IOException;

public class Depth {
    public static void depthLogic() throws IOException {
        if(GlobalVariables.no_depth>0){
            Extractor.extractLinks(GlobalVariables.url);
            Threads.threadsLogic();
            GlobalVariables.links.clear();
            for(int i=0;i<GlobalVariables.no_depth;i++){
                for(int j=0;j<GlobalVariables.validLinks.size();j++)
                    Extractor.extractLinks(GlobalVariables.validLinks.get(j));

                Threads.threadsLogic();
                GlobalVariables.links.clear();
            }
        }

        else if(GlobalVariables.no_depth==0){
            Extractor.extractLinks(GlobalVariables.url);
            Threads.threadsLogic();
        }
    }
}
