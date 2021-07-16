package java_16_07_21_threads;

public class programm {
    public static void main (String[] args){
        zaehler zaehler1 = new zaehler("Erster Zaehler", 100);
        zaehler zaehler2 = new zaehler("Zweiter Zaehler", 50);

        Thread thread1 = new Thread(zaehler1);
        Thread thread2 = new Thread(zaehler2);

        thread1.start();
        thread2.start();
    }
}
