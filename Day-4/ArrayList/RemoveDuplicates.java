import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,2,2,1,1,2));
        System.out.println("New arrays : ");
        System.out.println(duplicateArray(arrayList));

    }

    private static List<Integer> duplicateArray(ArrayList<Integer> arrayList) {
        for(int i=0;i<arrayList.size();++i){
            for(int j=i+1;j<arrayList.size();++j){
                if(arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                    j--;
                }
            }
        }
        return arrayList;
    }
}
