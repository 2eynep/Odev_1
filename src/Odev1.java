public class Odev1 {
    public static void main(String[] args) {
        Msg ms = new Msg();
        Runtime.getRuntime().addShutdownHook(ms);
        while (true) {
            try {
                System.out.println("I'm busy...");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("System interrupted");
            }
        }
    }
}
