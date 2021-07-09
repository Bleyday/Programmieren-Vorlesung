package java_09_07_21;

public class such_algo_unsortiert {
    public static void main(String[] agrs){
        int [] menge={54, 21, 421, 6253, 64, 88, 43,3};

        int result = search(menge, 64);
        System.out.println(result);

    }
    public static int search(int [] menge, int kandidat){
        for(int i=0; i < menge.length; i++){
            if (menge[i] == kandidat){
                return i+1;
            }
        }
        return -1;
    }
}
