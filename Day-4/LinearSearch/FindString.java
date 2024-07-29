public class FindString {
    public static void main(String args[]){
        String []arr={"cat","dog","hat"};
        String find="dog";

        for(String a:arr){
            if(a.equals(find)){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
