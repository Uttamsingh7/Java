package arrayAndArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class multiDimension {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        syntax

//        int[][] arr = new int[3][]
//                adding row is mandatory but not cols (u can add but not necessary)

        int[][] arr2D= {
                {1, 2, 3},  // 0th index
                {4, 5, 6},  // 1st index
                {7, 8, 9}   //2nd index
        };

        // input

        int[][] arr =new int[3][3];

//        array.length will give the total no, of columns in array
        System.out.println("Total no. of rows in array");
        System.out.println(arr.length); // no. of rows


        for (int row= 0; row<arr.length; row++){

            // for each column in every row
            for (int col=0; col< arr[row].length; col++){
                arr[row][col] = input.nextInt();

            }
        }

        // output

//        for (int row= 0; row<arr.length; row++){
//              //for each column in every row
//            for (int col=0; col< arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        Array.toString method
        for (int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // inhanced for loop and

        for(int[] ints: arr) {      // what is the type of every elements in arr elements, it is array, so we specify datatype int[]
            System.out.print(Arrays.toString(ints));
            System.out.println();
        }
    }

}