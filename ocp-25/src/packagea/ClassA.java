package packagea;

public class ClassA {
    public static void main(String[] args) {
        System.out.println("ClassA.main()");
    }

    // Instance initializer
    // become this after compile:
    //    public ClassA() {
    //        System.out.println("teste");
    //    }
    { System.out.println("teste"); }
}
