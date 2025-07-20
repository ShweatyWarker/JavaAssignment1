package EX_3_14;

class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Display method
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class Answers_8 {
    public static void main(String[] args) {
        // Create a date object
        Date birthday = new Date(7, 19, 2025);

        // Display original date
        System.out.print("Original date: ");
        birthday.displayDate();

        // Modify the date
        birthday.setMonth(12);
        birthday.setDay(25);
        birthday.setYear(2025);

        // Display updated date
        System.out.print("Updated date: ");
        birthday.displayDate();
    }
}