package arrayAndArrayList;


import java.util.ArrayList;
import java.util.Scanner;

    public class ArrayListExample {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
//        Syntax
            ArrayList<Integer> list = new ArrayList<Integer>(10);
//        ArrayList <Integer> List = new ArrayList();   // correct but good practice


//        list.add(23);
//        list.add(89);
//        list.add(78);
//        list.add(23);
//        list.add(890);
//        list.add(67);
//        // we can add as many as we want to add elements in arraylists
//        list.add(23);
//        list.add(89);
//        list.add(78);
//        list.add(89);
//        list.add(78);
//
//
//        System.out.println(list);       // it's internally called toString as well
//
////        list. // we can apply all the function that are in list method
//
////        list.toArray() // create it an array
//
////        list.contains() // check if the list contains the element or not
//        System.out.println(list.contains(89));
//
//        list.set(0, 700);       // list.set update the value on specified index
//        System.out.println(list);
//
//        list.remove(2); // remove the index number
//        System.out.println(list);

            // list.get()  get item from the index

            // input

            for (int i=0; i<6; i++){
                list.add(input.nextInt());
            }

            for(int i=0; i<6; i++){
                System.out.print(list.get(i) + " ");  // pass index here, list[index] will not work here

            }

//        * internal working of arrayList
//                i. Actually size is fixed internally
//                ii. If array list fills by some amount
//                iii. It will create a new arrayList may be double the size
//                iv. Old elements are coppied in new list
//                v. Old arrayList is deleted

        }
    }
