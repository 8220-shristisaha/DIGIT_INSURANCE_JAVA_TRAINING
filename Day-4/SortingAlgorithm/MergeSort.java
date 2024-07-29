import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        System.out.println(" After sorting : ");
        Arrays.toString(arr);

    }
    public static void mergesort(int arr[],int low,int high){
        if(low<high) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int left[]= new int[n1];
        int right[]= new int[n2];
        for(int i=0;i<n1;++i){
            left[i]=arr[i+low];
        }
        for(int j=0;j<n2;++j){
            right[j]=arr[j+mid+1];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;k++;
        }
    }
}
