import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = { 5,2,4,6,1 };

        System.out.println(Arrays.toString(new Array(data).sort()));
    }
}

class Array {
    int[] elements;

    Array(int[] elements) {
        this.elements = elements;
    }

    public int[] sort() {
        for (int i = 1; i < this.elements.length; i++) {
            int key = this.elements[i];
            int j = i - 1;

            while (j >= 0 && this.elements[j] > key) {
                this.elements[j+1] = this.elements[j];
                j = j - 1;
            }

            this.elements[j+1] = key;
        }

        return this.elements;
    }
}