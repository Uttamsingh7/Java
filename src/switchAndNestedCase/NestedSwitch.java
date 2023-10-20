package switchAndNestedCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter empID");
//        System.out.println("Enter department");
        int empID= in.nextInt();
         String department = in.next();

//        switch (empID){
//            case 1:
//                System.out.println("uttam singh");
//                break;
//            case 2:
//                System.out.println("Atulya");
//                break;
//            case 3:
//                System.out.println("Ranjan");
//                break;
//            case 4:
//                System.out.println("Employee number 4");
//                switch ("IT"){
//                    case"IT" :
//                        System.out.println("IT department");
//                        break;
//                    case"management":
//                        System.out.println("management department");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter valid empID");
//        }
//    }

        // Enhanced switch.

        switch (empID) {
            case 1 -> System.out.println("uttam singh");
            case 2 -> System.out.println("Atulya");
            case 3 -> System.out.println("Ranjan");
            case 4 -> {
                System.out.println("Employee number 4");
                switch ("IT") {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                }
            }
            default -> System.out.println("Enter valid empID");
        }
    }
}
