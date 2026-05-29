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

    public void eatMore (boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
                System.out.println("[eatMore roomInBelly] " + roomInBelly);
                System.out.println("[eatMore amountOfFood] " + amountOfFood);
            }
        }
        System.out.println(amountOfFood);
    }

    void main() {
        eatMore(true, 5);
    }
}
