package java_16_07_21_threads;

public class zaehler implements Runnable {
    private String name;
    private int intervall;

    public zaehler(String name, int intervall){
        this.name = name;
        this.intervall = intervall;
    }
    @Override
    public void run () {
        for (int i = 0; i<100;i++){
            System.out.println(name + " ist bei " +i);
            try{
                Thread.sleep(intervall);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
