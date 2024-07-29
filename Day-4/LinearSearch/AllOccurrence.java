public class AllOccurrence {
    public static void main(String []args){
        int []arr= {2,2,2,23,21,4,5};
        int specificInt=2;
        specific(arr,specificInt);
    }

    private static void specific(int[] arr, int specificInt) {
        for(int i=0;i<arr.length;++i){
            if(arr[i]==specificInt){
                System.out.print(i+" ");
            }
        }
    }
}
