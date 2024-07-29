import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoList {
    public static void main(String[] args){
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(4,5,6,7,8));
        System.out.println("Union of two arrays: ");
        System.out.println(unionOfLists(arrayList1, arrayList2));
    }

    private static List<Integer> unionOfLists(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {

        for (Integer num : arrayList2) {
            if (!arrayList1.contains(num)) {
                arrayList1.add(num);
            }
        }
        return arrayList1;
    }

}
