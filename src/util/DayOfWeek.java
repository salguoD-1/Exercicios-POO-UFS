package util;

public class DayOfWeek {
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String returnDayOfWeek() {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "None";
        }
    }

    @Override
    public String toString() {
        return String.format("Day %d is: %s%n", day, returnDayOfWeek());
    }
}
