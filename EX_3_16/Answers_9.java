package EX_3_16;

import java.util.Scanner;
import java.time.LocalDate;

class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay; }
    public int getBirthYear() { return birthYear; }

    // Calculate age
    public int calculateAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthYear;

        if (birthMonth > today.getMonthValue() ||
           (birthMonth == today.getMonthValue() && birthDay > today.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    // Maximum heart rate = 220 - age
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
}

public class Answers_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int birthDay = input.nextInt();

        System.out.print("Enter birth year (e.g., 1990): ");
        int birthYear = input.nextInt();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

        // Display results
        System.out.println("\n--- Heart Rate Information ---");
        System.out.printf("Name: %s %s\n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d\n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.println("Age: " + person.calculateAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRateRange());

        input.close();
    }
}