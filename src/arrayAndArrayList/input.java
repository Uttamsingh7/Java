package arrayAndArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {


//        Array if primitives


        Scanner input = new Scanner(System.in);
        int[] arr= new int[5];

//        arr[0]= 34;
//        arr[1]= 43;
//        arr[2]= 89;
//        arr[3]= 8;
//        arr[4]= 78;

        // internally stored this way
//        {34, 43, 89, 8, 78};
        System.out.println(arr[4]);

//    *  input using for loop

//        for (int i=0; i<arr.length; i++){
//            arr[i]= input.nextInt();
//        }


//        * output


//     i.   for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//     ii.  inhanced for loop
//        for (int num : arr) {       // here num represents elements of the array
//            System.out.print(num + " ");
//        }

//      iii. toString class

//        System.out.println(Arrays.toString(arr));       // to String method returns string representation of an object
        // to.String method also using for loop internally


        // Array of objects

        System.out.println("Enter 4 inputs");
        String[] str = new String[4];
        for (int i= 0; i<str.length; i++){
            str[i]= input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
