public class Chick {
    private String name = "Alex";

    public Chick() {
        name = "Yuri";
    }

    // This will run first
    { name = "Bob"; }

    public static void main(String[] args) {
        Chick c = new Chick();
        System.out.println(c.name);
    }
}
