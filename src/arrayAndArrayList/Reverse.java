package arrayAndArrayList;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = { 2,56, 7,78,9, 78,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <end){
//            swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){

        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
    }
}