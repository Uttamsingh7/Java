package arrayAndArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {343,64,89,9433, 89, 345};
        System.out.println(max(arr));

        System.out.println(maxInRange(arr, 0,2));

    }

    // imagine that array is not empty
    static int max(int[] arr){

        //work with edge cases

        if(arr== null){
            return -1;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max =arr[i];
        }
        return max;
    }

    // maximum value in range

    static int maxInRange(int[] arr, int firstIndex, int secondIndex){

        if(secondIndex<firstIndex){
            return -1;

        }

        if(arr == null){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }

        int max = arr[0];
        for (int i = firstIndex; i < secondIndex; i++) {
            if(max<arr[i])
                max =arr[i];
        }
        return max;
    }



}
