package EX_3_17;

import java.util.Scanner;
import java.time.LocalDate;

class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public double getHeightInInches() { return heightInInches; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }

    public double getWeightInPounds() { return weightInPounds; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    // Age calculation
    public int calculateAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthYear;

        if (birthMonth > today.getMonthValue() ||
           (birthMonth == today.getMonthValue() && birthDay > today.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    // Max heart rate = 220 - age
    public int getMaxHeartRate() {
        return 220 - calculateAge();
    }

    // Target heart rate = 50% to 85% of max
    public String getTargetHeartRateRange() {
        int max = getMaxHeartRate();
        int minTarget = (int)(max * 0.5);
        int maxTarget = (int)(max * 0.85);
        return minTarget + " - " + maxTarget + " bpm";
    }

    // BMI calculation
    public double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }
}

public class Answers_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter birth month (1–12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1–31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (e.g. 1990): ");
        int year = input.nextInt();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Create object
        HealthProfile person = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);

        // Display profile
        System.out.println("\n--- Health Profile ---");
        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Gender: %s%n", person.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Height: %.1f inches%n", person.getHeightInInches());
        System.out.printf("Weight: %.1f pounds%n", person.getWeightInPounds());

        // Health data
        int age = person.calculateAge();
        double bmi = person.calculateBMI();
        int maxHR = person.getMaxHeartRate();
        String targetRange = person.getTargetHeartRateRange();

        System.out.printf("Age: %d years%n", age);
        System.out.printf("BMI: %.1f%n", bmi);
        System.out.printf("Max Heart Rate: %d bpm%n", maxHR);
        System.out.printf("Target Heart Rate Range: %s%n", targetRange);

        // BMI chart
        System.out.println("\n--- BMI Categories ---");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      18.5 – 24.9");
        System.out.println("Overweight:  25 – 29.9");
        System.out.println("Obese:       30 or greater");

        input.close();
    }
}