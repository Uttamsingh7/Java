package arrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class multiDArrayList {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());   //  3 lists has been added in the ArrayList

        }

//        add elements

        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt()); // get the first list at the index i of ArrayList and add elements to each list

            }

        }
        System.out.println(list);
    }
}
