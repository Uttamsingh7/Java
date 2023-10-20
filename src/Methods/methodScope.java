package Methods;

public class methodScope {
    public static void main(String[] args) {
        int a =10;
        int b=20;

//        System.out.println(abc);
//        System.out.println(marks);

//        changes are here only be valid in this scope
    }

    static void random (int marks){
//        System.out.println(a);  // we cannot use variable of some other function

        int abc= 100;

//        changes in this scope only valid in this scope.
    }


//    only access the variable initialized inside the function. cannot accessed outside
}
