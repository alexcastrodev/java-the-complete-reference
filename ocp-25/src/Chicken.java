public class Chicken {
    public Chicken() {
        { System.out.println("[Constructor] " + name); }
    }

    private String name = "Alex";

    // This will run first
    { System.out.println("[Instance initializer] "+ name); }

    public static void main(String[] args) {
        Chicken c = new Chicken();
    }
}
