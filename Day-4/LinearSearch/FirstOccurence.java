public class FirstOccurence {
    public static void main(String []args){
        int []arr={1,2,1,2,3,4,5,3};
        int num=5;
        System.out.println(occurence(arr,num));

    }

    private static int occurence(int[] arr, int num) {
        for(int i=0;i<arr.length;++i){
            if(arr[i]==num){
                return i;
            }
        }return -1;
    }
}
