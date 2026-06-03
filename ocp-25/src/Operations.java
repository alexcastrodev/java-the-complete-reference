public class Operations {
    void main() {
        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y;
        // Print Class of z
        IO.println(((Object) z).getClass().getSimpleName());
    }
}
