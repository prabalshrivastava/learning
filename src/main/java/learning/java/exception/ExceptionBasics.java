package learning.java.exception;

public class ExceptionBasics {
    public static void main(String[] args) {
//        case 1
//        throwNullPointer();

//        case 2
//        try {
//            throwNullPointer();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//        System.out.println("after exception");


//        case 3
//        try {
//            throwNullPointer();
//        } catch (NullPointerException e) {
//            throw e;
//        }
//        System.out.println("after exception");
//    }


//        case 4
//        try {
//            throwNullPointer();
//        } catch (NullPointerException e) {
//            throw e;
//        } finally {
//            System.out.println("inside finally");
//        }
//        System.out.println("after exception");
//    }

//        case 5
//        try {
//            throwNullPointer();
//        } catch (NullPointerException e) {
//            System.exit(1);
//        } finally {
//            System.out.println("inside finally");
//        }
//        System.out.println("after exception");
    }

    private static void throwNullPointer() {
        String s = null;
        s.toString();
    }
}
