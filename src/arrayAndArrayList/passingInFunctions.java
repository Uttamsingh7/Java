package arrayAndArrayList;

import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
        int[] arr = {12, 45 ,7,89, 90};

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {

        arr[3] = 5000;
    }

}