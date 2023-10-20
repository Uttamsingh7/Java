package Methods;
import java.util.Arrays;
public class varArgs {      // variable length arguments, methods when take variable no. of arguments
                            //when we do not know how many inputs we are giving
    public static void main(String[] args) {
        fun(2,4 ,45,6,6,7);     // it will internally store in an array
        fun();                      // can be called zero or more than zero arguments.
        multipleTypes(2, 3, "Mthods", "atulya", "bhaskar", "jhkjj", "hjjkh");
    }
    static void fun (int ...v){         // length is not constant it varies towards the no. of inputs
                                        // v is implicitly declared as array of integer
        System.out.println(Arrays.toString(v));
    }

    static void multipleTypes( int a, int b, String ...v){      // format/order of types should be same at time of calling the method
        System.out.println(Arrays.toString(v));                 // variable length arguments always comes in the end not in between.
    }
}
