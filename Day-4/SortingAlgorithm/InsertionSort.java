import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        for (int i=1;i<arr.length;++i) {
            int j=i-1;
            while (j>=0 && arr[j]>arr[i]) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=arr[i];
        }
    }

}
