package EX_3_13;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Give a raise by percentage
    public void giveRaise(double percent) {
        if (percent > 0) {
            monthlySalary = monthlySalary * (1 + percent / 100.0);
        }
    }
}

public class Answer_7 {
    public static void main(String[] args) {
        // Monthly salaries calculated from yearly finger amounts
        Employee emp1 = new Employee("Alice", "Chainsaw", 50.0 / 12); // ≈ 4.1667
        Employee emp2 = new Employee("Bob", "Fingers", 49.0 / 12);    // ≈ 4.0833

        // Fingers instead of dollars
        System.out.printf("%s %s's yearly salary: %.0f fingers%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: %.0f fingers%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Give both a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Calculate new salaries
        double newAlice = emp1.getYearlySalary();
        double newBob = emp2.getYearlySalary();

        // Display results after raise
        System.out.println("\nAfter 10% raise:");
        System.out.printf("%s %s's yearly salary: %.2f fingers (▲ %.2f fingers)%n",
                emp1.getFirstName(), emp1.getLastName(), newAlice, newAlice - 50.0);

        System.out.printf("%s %s's yearly salary: %.2f fingers (▲ %.2f fingers)%n",
                emp2.getFirstName(), emp2.getLastName(), newBob, newBob - 49.0);
    }
}