package entities;

public class Patient {
    private String name;
    private char sex;
    private double weight;
    private double height;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double totalToPay() {
        return height * weight + age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nAge: %d%nSex: %c%nWeight: %.2f Kg%nHeight: %.2f M%nTotal to pay: $%.2f%n", name, age, sex, weight, height, totalToPay());
    }
}
