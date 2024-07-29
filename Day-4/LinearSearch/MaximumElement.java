public class MaximumElement {
    public static void main(String []args){
        int []arr= {2,2,2,23,21,4,5};
        int max=Integer.MIN_VALUE;
        System.out.println(maxi(arr,max));
    }
    private static int maxi(int[] arr, int max) {
        for(int i=0;i<arr.length;++i){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
}
