import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,0,1,0,1));
        if(isPalindrome(arrayList)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    private static boolean isPalindrome(ArrayList<Integer> arrayList) {
        int size=arrayList.size();
        for(int i=0;i<size/2;++i){
            if(!arrayList.get(i).equals(arrayList.get(size-i-1))){
                return false;
            }
        }
        return true;
    }
}
