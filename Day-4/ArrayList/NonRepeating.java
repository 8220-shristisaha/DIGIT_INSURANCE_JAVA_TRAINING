import java.util.ArrayList;
import java.util.Arrays;

public class NonRepeating {
    public static void main(String[] args){
        ArrayList<Integer> array= new ArrayList<>(Arrays.asList(1,2,3,2,2,1,3,4,1,2,5,4,6));

        for(int i=0;i<array.size();++i){
            int count=0;
            for(int j=i+1;j<array.size();++j){
                if(array.get(i).equals(array.get(j))){
                    array.remove(j);
                    j--;
                    count++;
                }
            }
            if(count==0){
                System.out.println(array.get(i));
                break;
            }
        }

    }
}
