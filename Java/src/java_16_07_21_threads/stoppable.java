package java_16_07_21_threads;

public class stoppable {
    public static void main (String[] args) throws  InterruptedException{
        stoppablethread t = new stoppablethread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
