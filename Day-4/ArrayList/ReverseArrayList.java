import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("Reversed arrays: ");
        System.out.println(reversed(arrayList1));
    }

    private static ArrayList<Integer> reversed(ArrayList<Integer> arrayList1) {
        for(int i=0;i<arrayList1.size()/2;++i){
            int temp=arrayList1.get(i);
            arrayList1.set(i, arrayList1.get(arrayList1.size() - i - 1));
            arrayList1.set(arrayList1.size()-i-1,temp);

        }
        return arrayList1;
    }
}
