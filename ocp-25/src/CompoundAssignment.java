public class CompoundAssignment {
    public static void main(String[] args) {
        long goat = 10;
        int sheep = 5;
//        sheep = sheep * goat; // CompoundAssignment.java:5: error: incompatible types: possible lossy conversion from long to int
        // WTF Java ?
        sheep *= goat;
        System.out.println(sheep);

        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf);
        System.out.println(coyote);
    }
}
