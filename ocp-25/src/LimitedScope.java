public class LimitedScope {
    public  void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println("[eatIfHungry] " + bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); // OUT OF SCOPE
    }
}
