package arrayAndArrayList;

import java.util.Arrays;

public class colNotFixed {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3,4,5,6},
                {3, 5, 8},
                {2,4,5,6,}
        };

        // output

//      for (int row=0; row< arr.length; row++) {
//          for (int col = 0; col < arr[row].length; col++) {
//              System.out.print(arr[row][col] +" ");
//          }
//          System.out.println();
//      }

//      Arrays.toString method

//        for(int row =0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // inhanced for loop

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}