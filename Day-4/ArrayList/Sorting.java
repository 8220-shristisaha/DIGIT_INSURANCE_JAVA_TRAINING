import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,8,1,6,2,7,3,5));

        for(int i=0;i<arrayList.size();++i){
            for(int j=i+1;j<arrayList.size();++j){
                if(arrayList.get(i)>arrayList.get(j)){
                    int temp=arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);
                }
            }
        }
        System.out.println(arrayList);

    }
}
