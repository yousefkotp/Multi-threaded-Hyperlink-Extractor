import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Threads extends Thread{
    public String link;

    public Threads(String link) {
        this.link = link;
    }
    public static void threadsLogic() throws IOException {
        if(GlobalVariables.no_threads==1){
            for(int i=0;i<GlobalVariables.links.size();i++)
                Validator.checkValid(GlobalVariables.links.get(i));
        }
        else{
            ArrayList<Threads> multiThreads = new ArrayList<>();
            ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(GlobalVariables.no_threads);
            for(int i=0;i<GlobalVariables.links.size();i++)
                multiThreads.add(new Threads(GlobalVariables.links.get(i)));
            for(int i=0;i<GlobalVariables.links.size();i++)
                executorService.execute(multiThreads.get(i));

            while(executorService.getActiveCount()>0){

            }

            executorService.shutdown();
        }



        }

    @Override
    public void run() {
        Validator.checkValid(link);
    }
}
