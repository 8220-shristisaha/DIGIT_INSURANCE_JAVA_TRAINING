import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args){

        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,1,2,1,2,3,3,4));
        System.out.println("Duplicate number in a arrays : ");
        System.out.println(duplicateArray(arrayList));


    }

    private static List<Integer> duplicateArray(ArrayList<Integer> arrayList) {
        List<Integer> duplicateList= new ArrayList<>();
        for(int i=0;i<arrayList.size();++i){
            for(int j=i+1;j<arrayList.size();++j){
                if(arrayList.get(i).equals(arrayList.get(j)) && !(duplicateList.contains(arrayList.get(i)))){
                    duplicateList.add(arrayList.get(i));
                }
            }
        }
       return duplicateList;
    }
}
