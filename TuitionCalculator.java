public class TuitionCalculator {
    public static void main(String[] args) {
        // Initial tuition and annual increase rate
        double initialTuition = 10000.0;
        double annualIncreaseRate = 0.05;

        // Calculate tuition in ten years
        double tuitionInTenYears = initialTuition;
        for (int i = 1; i <= 10; i++) {
            tuitionInTenYears += tuitionInTenYears * annualIncreaseRate;
        }

        // Calculate total cost of four years' worth of tuition after the tenth year
        double totalCost = 0.0;
        for (int i = 0; i < 4; i++) {
            totalCost += tuitionInTenYears;
            tuitionInTenYears += tuitionInTenYears * annualIncreaseRate;
        }

        // Display the results
        System.out.printf("Tuition in ten years: $%.2f%n", tuitionInTenYears);
        System.out.printf("Total cost of four years' worth of tuition after ten years: $%.2f%n", totalCost);
    }
}
