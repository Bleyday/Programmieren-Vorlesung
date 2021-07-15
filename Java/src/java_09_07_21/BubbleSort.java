package java_09_07_21;

public class BubbleSort {
    public static void main(String[] args) {
        int[] zahlen = {11, 7, 90, 16, 18, 49, 1};
        int[] sortiert = sort(zahlen);

        for (int i = 0; i < sortiert.length; i++) {
            System.out.println(sortiert[i]);
        }

    }

    public static int[] sort(int[] unsorted_list) {
        int hilf = 0;

        for (int i = 0; i < unsorted_list.length - 1; i++) {
            if (unsorted_list[i] > unsorted_list[i + 1]) {
                hilf = unsorted_list[i];
                unsorted_list[i] = unsorted_list[i + 1];
                unsorted_list[i + 1] = hilf;
                sort(unsorted_list);
            }
        }
        return unsorted_list;
    }
}
