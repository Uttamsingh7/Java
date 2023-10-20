package Methods;
import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter number to check");
        int n= input.nextInt();

        boolean result =  isPrime(n);

        System.out.println(result);
    }

    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c=2;
        while(c*c <= n){    //check only square root of n
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c >n;
    }
}
