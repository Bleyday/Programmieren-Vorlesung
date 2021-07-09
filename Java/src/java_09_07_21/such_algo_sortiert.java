package java_09_07_21;

public class such_algo_sortiert {
    public static void main(String[] agrs){
        int [] menge = {3, 21, 43, 54, 64, 88, 421, 6253};
        int result = searchSort(menge, 64);
        System.out.println(result);

    }
    public static int searchSort(int [] menge, int kandidat){
        for(int i=0; i < menge.length; i++){
            if (menge[i] == kandidat){
                return i+1;
            }
            if (menge[i] > kandidat){
                return -1;
            }
        }
        return -1;
    }
}