import java.awt.print.PrinterGraphics;
import java.util.*;

public class ClassSpecificSetBehavior {
    public static void main(String args[]){
       List<Integer> list = new ArrayList<>(Arrays.asList(5,3,5,1,2));
        HashSet<Integer>hashSet = new HashSet<>(list);
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(list);
        TreeSet<Integer>treeSet = new TreeSet<>(list);

        System.out.println("Hash Set : "+hashSet);
        System.out.println("Linked Hash Set : "+linkedHashSet);
        System.out.println("Tree Set : "+treeSet);


    }



}
