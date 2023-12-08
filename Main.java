public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        One one = new One();
        Two two = new Two();
        Three three = new Three();
        Four four = new Four();

        dispatcher.dispatchMethod(one);
        dispatcher.dispatchMethod(two);
        dispatcher.dispatchMethod(three);
        dispatcher.dispatchMethod(four);
    }
}