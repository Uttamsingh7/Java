package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);


//        int a =10;
//        int b=20;
//
//        int temp= a;
//        a=b;
//        b=temp;
//        System.out.println(a + " " + b);
//        same thing in function

        int first = in.nextInt();
        int second= in.nextInt();
        swap(first, second);

        System.out.println(first + " " + second);

    }
    static void swap(int a, int b){
        int temp= a;
        a=b;
        b=temp;

//      this will swap the value for the local variable to this
//      function a and b the changes will not reflected in main
//      function's variables.'

//      it passed by value not reference; so it's only change the value of current
//        object pointing to that. it's not change the value of the previous object

//        in java there is no such thing as pass by reference.
    }


//    primitive: int, short, char, byte, float --> just pass by value.
//    non-primitive: objects, string e.tc. --> passing by reference.
}
