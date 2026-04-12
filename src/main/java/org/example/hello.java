public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Case 2: Use String.join()
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}