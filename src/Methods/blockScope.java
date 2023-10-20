package Methods;

public class blockScope {
    public static void main(String[] args) {
        int a= 10;   // these variable a and b are available to every block
        int b= 20;     // of the main function bcz.
        System.out.println(a);
        String name ="uttam";
        {
//            int a= 10;   // cannot initialised again, but you modify it.
            a=50;       // reassign the original value.
            System.out.println(a);// print value of immediate next to it.

            name ="anand";
            System.out.println(name);
            int c=30;
//            initialised values in this block specifically can only used inside this block
//            value that are initialised in this block will remain in this block.
        }

//        System.out.println(c); // cannot access outside of the block
        int c=89; // it can be done because it doesn't know the varible c inside the block.
        System.out.println(c);
        System.out.println(a); // also print the same a=50,
        System.out.println(name);


//        Anything that is initialised outside you can use and modify inside but not initialised again inside.
//        Anything that is initialised inside you can use only inside not outside.
    }


}
