public class MileToKilometerConverter {
    public static void main(String[] args) {
        // Display the table header
        System.out.println("Miles           Kilometers");
        System.out.println("--------------------------");

        // Conversion factor from miles to kilometers
        double milesToKilometers = 1.609;

        // Loop to display the conversion table for miles 1 to 10
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * milesToKilometers;
            System.out.printf("%-5d           %-7.3f%n", miles, kilometers);
        }
    }
}
