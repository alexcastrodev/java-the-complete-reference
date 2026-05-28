public class MethodParameter {
    public void findAnswer(boolean check) {}

    public void checkAnswer() {
        // It tries to use a variable that is not initialized.
        // boolean value;
        // findAnswer(value);
    }
}
