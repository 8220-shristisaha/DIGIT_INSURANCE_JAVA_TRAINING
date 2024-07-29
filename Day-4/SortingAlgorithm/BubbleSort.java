import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]= {5,1,6,2,7,3,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[]){
        boolean flag;
        for(int i=0;i<arr.length-1;++i){
            flag=false;
            for(int j=0;j<arr.length-i-1;++j){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)break;
        }
    }
}
