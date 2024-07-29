import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a number K");
        int k=scanner.nextInt();

        System.out.println("Rotated arrays: ");
        swapping(arrayList,0,arrayList.size()-k);
        swapping(arrayList,arrayList.size()-k,arrayList.size());
        swapping(arrayList,0,arrayList.size());
        System.out.println(arrayList);

    }

    private static void swapping(ArrayList<Integer> arrayList, int start, int end) {
        for(int i=0;i<(end-start)/2;++i){
            int temp= arrayList.get(start+i);
            arrayList.set(start+i,arrayList.get(end-i-1));
            arrayList.set(end-i-1,temp);
        }
    }

}
