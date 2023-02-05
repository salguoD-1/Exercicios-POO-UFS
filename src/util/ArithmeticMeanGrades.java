package util;

public class ArithmeticMeanGrades {
    private double grade1;
    private double grade2;
    private double grade3;

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double arithmeticAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public String studentStatus() {
        if (arithmeticAverage() >= 7.0 && arithmeticAverage() <= 10) {
            return "Passed";
        } else if (arithmeticAverage() >= 3.0 && arithmeticAverage() < 7.0) {
            return "Final exam";
        } else if (arithmeticAverage() > 0.0 && arithmeticAverage() < 3.0) {
            return "Failed";
        }

        return null;
    }

    @Override
    public String toString() {
        return String.format("Arithmetic mean is: %.1f%nCurrent status: %s%n", arithmeticAverage(), studentStatus());
    }
}
