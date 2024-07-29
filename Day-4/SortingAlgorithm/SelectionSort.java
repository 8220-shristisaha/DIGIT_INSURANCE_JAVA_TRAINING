import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={64,25,12,22,11};
        int size=arr.length;
        for(int i=0;i<size;++i){
            int min=arr[i];
            int pos=0;
            for(int j=i+1;j<size;++j){
                if(min>arr[j]){
                    min=arr[j];
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[pos]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
