import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoList {
    public static void main(String[] args){
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,1,2,1,2,3,3,4));
        ArrayList<Integer> arrayList2= new ArrayList<>(Arrays.asList(2,1,2,3,3,4));
        System.out.println("Intersecting number in two arrays : ");
        System.out.println(IntersectNumbers(arrayList,arrayList2));

    }

    private static List<Integer> IntersectNumbers(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<arrayList.size();++i){
            for(int j=0;j<arrayList2.size();++j){
                if(arrayList.get(i).equals(arrayList2.get(j))){
                    array.add(arrayList.get(i));
                    int a=arrayList2.remove(j);
                }
            }
        }return array;
    }
}
