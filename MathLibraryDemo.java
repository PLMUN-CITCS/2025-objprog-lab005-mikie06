public class MathLibraryDemo {
    public static void main(String[] args) {
        // Calculate Power
        double base = 2; // Base number
        int exponent = 3; // Exponent
        double powerResult = Math.pow(base, exponent); // Calculate power
        System.out.println("Power: " + powerResult); // Output power result

        // Calculate Square Root
        double numberForSqrt = 16; // Number to find the square root of
        double sqrtResult = Math.sqrt(numberForSqrt); // Calculate square root
        System.out.println("Square Root: " + sqrtResult); // Output square root result

        // Round a Decimal Number
        double decimalNumber = 5.67; // Decimal number to round
        long roundedNumber = Math.round(decimalNumber); // Round the decimal number
        System.out.println("Rounded Number: " + roundedNumber); // Output rounded number

        // Generate a Random Number
        double randomNumber = Math.random(); // Generate a random number
        System.out.println("Random Number: " + randomNumber); // Output random number
    }
}
