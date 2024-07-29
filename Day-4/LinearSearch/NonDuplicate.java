public class NonDuplicate {
    public static void main(String args[]){
        String a="abcdabcde";
        nonduplicate(a);
    }

    private static void nonduplicate(String a) {
        for(int i=0;i<a.length();++i){
            int count=0;
            for(int j=0;j<a.length();++j){
                if(i!=j && a.charAt(i)==a.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(a.charAt(i));
                return;
            }
        }
        System.out.println("No NON-DUPLICATE");
    }
}
