package Methods;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr= {1, 3, 4,56, 9};

        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums) {
        nums[0]= 29;           // if you change the object via this ref. variable,
                                // original or same object will be changed.
    }

}
