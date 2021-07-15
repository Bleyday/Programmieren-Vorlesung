package java_09_07_21;

public class BinarySearch {
    public static void main(String[] args){
        int [] menge = {3, 21, 43, 54, 64, 88, 421,6253};

        int position = search(menge, 64);
        System.out.println("Die gesuchte Nummer ist an der Position " + position);

    }
    public static int search(int [] list,  int numbr){
        int u = 0;
        int o = list.length;

        while (u <= o){
             int middle = (u+o) / 2;

             if (list[middle] == numbr){
                 return middle+1;
             }
             else if (numbr < list[middle]){
                 o = middle -1;
             }
             else{
                 u = middle +1;
             }
        }

        return -1;
    }
}