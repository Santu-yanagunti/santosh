public class PrimeNumbers {

    public static void main(String[] args) {
        // Define the upper limit
        int upperLimit =10; // You can change this value as needed

        System.out.println("Prime numbers up to " + upperLimit + ":");

        // Iterate through numbers up to the upper limit
        for (int i = 2; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

