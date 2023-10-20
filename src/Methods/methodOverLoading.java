package Methods;

public class methodOverLoading {

//    if two or more function(s) have same name and same return type but different type of or different number of arguments
    public static void main(String[] args) {
        fun(2,3);
        fun(2,3,5);
        fun("Methods");

        // it decides at the compile time which method to called according to the passed arguments
    }

    static void fun(int a, int b){
        System.out.println(a+b);
    }

    static void fun(int a, int b, int c){
        System.out.println(a+b+c);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
