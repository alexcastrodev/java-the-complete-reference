public class PrimitiveAndReferences {
    // =========
    // Primitive
    // =========    // Should be assign 0 (zero)
    int a1, a2;
    float f1;
    double f2;
    // should be false
    boolean b1, b2;
    char c1;

    // =========
    // Reference
    // =========
    // Should be null
    String test;

    void main() {
        var out = new PrimitiveAndReferences();
        IO.println(out.c1);
        IO.println(out.f1);
        IO.println(out.f2);
        IO.println(out.a1);
        IO.println(out.a2);
        IO.println(out.b1);
        IO.println(out.b2);
        IO.println(out.test);
    }
}
