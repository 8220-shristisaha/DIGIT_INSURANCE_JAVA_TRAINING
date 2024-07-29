import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scanner.nextInt();
        if(n==0){
            System.out.println("Square Root of "+n+" :  0");
        }
        else if(n==1){
            System.out.println("Square Root of "+n+" : 1");
        }
        else{
            System.out.println("Square Root of "+n+" :" +binarySearch(n));
        }
    }
    public static  int binarySearch(int n){
        int low =0, high = n/2;
        int ans=0;
        while(low <= high){
            int mid= low +(high - low)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                ans=mid;
                low =mid+1;
            }
            else {
                high =mid-1;
            }
        }
        return ans;
    }
}

