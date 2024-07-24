import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,1,2,3,4,1,2,3};

        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int i=0;i<arr.length;++i){
            if(frequency.containsKey(arr[i])){
                frequency.put(arr[i], frequency.get(arr[i])+1);
            }
            else{
                frequency.put(arr[i],1);
            }
        }
        System.out.println("The frequency of the elements are : ");
        for(Map.Entry<Integer,Integer> map:frequency.entrySet()){
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }


}
