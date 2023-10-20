package Methods;

public class Shadowing {

    static int a =40; // this will be available to all block inside shadowing scope.
    public static void main(String[] args) {
        System.out.println(a);   // print 40  access immediate next to it that is a=40.
        int a;                   // local scope.
//      System.out.println(a);  // error a is not initialised. scope will begin when variable is initialised.
        a=50;
        System.out.println(a);  // print 90   access immediate next to it that is a =90.
        fun();                  //  a=90 is only available to this local block only so fun
                                // will refer to higher level scope. a= 40.

    }

    static void fun(){
        System.out.println(a);
    }
}
