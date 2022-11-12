public class Odev1 {
    public static void main(String[] args) {
        while (true) {
            try {
                Msg ms = new Msg();
                Runtime.getRuntime().addShutdownHook(ms);
                System.out.println("I'm busy...");
                Thread.sleep(500);
                Runtime.getRuntime().removeShutdownHook(ms);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}