public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from Java in Kubernetes!");
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}
