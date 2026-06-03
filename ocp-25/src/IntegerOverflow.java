public class IntegerOverflow {
    public static void main(String[] args) {
        short teUm = (short)1921222;
//        long teDois = (long)1123923213213124123; // Não compila por que ele vai avaliar right to left

        short mouse = 10;
        short hamster = 3;
        short a = (short)(mouse * hamster);
        System.out.println(a);

//        short b = (short)mouse * hamster; // IntegerOverflow.java:11: error: incompatible types: possible lossy conversion from int to short

//        short c = 1 + (short)(mouse * hamster); // IntegerOverflow.java:13: error: incompatible types: possible lossy conversion from int to short

        short d = 10 * 3;
//        short e = 10 * hamster; // IntegerOverflow.java:16: error: incompatible types: possible lossy conversion from int to short
    }
}
