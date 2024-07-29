public class LinearSearch {
    public static void main(String args[]){
        int []arr={1,2,7,12,6,3};
        int find=12;
        int index=linearSearch(arr,find);
        System.out.println(index);
    }

    public static int linearSearch(int []arr,int find){
        for(int i=0;i<arr.length;++i){
            if(arr[i]==find){
                return i;
            }
        }
        return -1;
    }
}
