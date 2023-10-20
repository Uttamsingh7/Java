package Methods;
import java.util.Scanner;
public class armStrongNumber {
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
//        int num= input.nextInt();
//        System.out.println(isArmstrong(num));

            for (int i = 100; i <1000 ; i++) {  // printf all 3 digit armstrong numbers
                if(isArmstrong(i))
                    System.out.println(i);

            }

        }

//    static boolean isArmstrong(int n){      // check whether it is prime or not
//        int original= n;
//        int sum=0;
//        while(n>0){
//            int rem= n%10;
//            sum += rem*rem*rem;
//            n/=10;
//        }
//        return (original == sum);
//    }

        static boolean isArmstrong(int n){      // check whether it is prime or not
            int original= n;
            int sum=0;
            while(n>0){
                int rem= n%10;
                sum += rem*rem*rem;
                n/=10;
            }
            return(original==sum);

        }
}
