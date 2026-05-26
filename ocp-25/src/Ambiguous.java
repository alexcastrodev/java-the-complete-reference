import java.util.Date;
//import java.sql.Date;
//➜  src git:(master) ✗ javac Ambiguous.java
//        Ambiguous.java:2: error: a type with the same simple name is already defined by the single-type-import of Date
//import java.sql.Date;
//^
//        1 error

public class Ambiguous {
    static void main(String[] args) {
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        System.out.println(sqlDate);
    }
}
