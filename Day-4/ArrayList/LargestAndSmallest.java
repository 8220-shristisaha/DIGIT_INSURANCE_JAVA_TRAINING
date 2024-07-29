import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,8,1,6,2,7,3,5));

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(Integer num:arrayList){
            if(num<smallest){
                smallest=num;
            }
            if(num>largest){
                largest=num;
            }
        }

        System.out.println("smallest : "+smallest);
        System.out.println("largest : "+largest);

    }
}
