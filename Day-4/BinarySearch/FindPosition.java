public class FindPosition {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int target=7;
        int result=binarySearch(arr,target);
        if(result!=-1){
            System.out.println(target +" found at : "+result);
        }
        else{
            System.out.println("not found");
        }
    }

    private static int binarySearch(int[] arr, int item) {
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]<item){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
}
