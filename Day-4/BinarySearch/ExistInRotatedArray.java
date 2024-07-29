public class ExistInRotatedArray {
    public static void main(String[] args) {
        int [] arr={5,6,7,1,2,3,4};
        int n=arr.length;
        int target=3;
        int pivot = getPivot(arr);
        int ans=0;
        if(target>=arr[0] && target>=arr[pivot]){
            ans= binarySearch(arr,0,pivot,target);
        }
        else{
            ans= binarySearch(arr,pivot,n-1,target);
        }
        System.out.println("The element is at index "+ans);
    }
    public static  int getPivot(int []arr){
        int low =0;
        int high = arr.length-1;
        while(low < high){
            int mid= low +(high - low)/2;
            if(arr[mid]>arr[0]){
                low =mid+1;
            }
            else{
                high =mid;
            }

        }
        return low;
    }

    public static  int binarySearch(int[] arr, int low, int high,int target){
        while(low <= high){
        int mid= low +(high - low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low =mid+1;
            }
            else{
                high =mid-1;
            }

        }
        return low;
    }
}
