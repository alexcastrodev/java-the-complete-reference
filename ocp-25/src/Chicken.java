public class Chicken {
    public Chicken() {
        { System.out.println("[Constructor] " + name); }
    }

    // int numero1 = 1, numero2, numero3, String numero4; DOES NOT COMPILE
    int numero1 = 1, numero2, numero3;
    private String name = "Alex";

    // This will run first
    { System.out.println("[Instance initializer] "+ name); }

    public static void main(String[] args) {
        Chicken c = new Chicken();

        double annoyingButLegal = 1_00_0.0_0;
        double ugly = 1_2;
    }
}
