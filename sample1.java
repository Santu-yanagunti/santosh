public class EvenNumbers {

    public static void main(String[] args) {
        // Define the upper limit
        int upperLimit = 50; // You can change this value as needed

        System.out.println("Even numbers up to " + upperLimit + ":");

        // Iterate through numbers up to the upper limit
        for (int i = 2; i <= upperLimit; i += 2) {
            System.out.print(i + " ");
        }
    }
}

