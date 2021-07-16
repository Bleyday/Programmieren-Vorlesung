package java_16_07_21_threads;

public class stoppablethread extends Thread {
    int i = 0;
    @Override
    public void run(){
        while (! isInterrupted()){
            System.out.println(i ++);
            try{
                sleep(400);
            } catch (InterruptedException e){
                e.printStackTrace();
                interrupt();
            }

        }
    }
}
