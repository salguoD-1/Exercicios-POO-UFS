package util;

public class SwimmerCategories {
    private int swimmerAge;

    public int getSwimmerAge() {
        return swimmerAge;
    }

    public void setSwimmerAge(int swimmerAge) {
        this.swimmerAge = swimmerAge;
    }

    public String displayCategories() {
        if (swimmerAge >= 0 && swimmerAge <= 10) {
            return "Children's";
        } else if (swimmerAge > 10 && swimmerAge <= 15) {
            return "Young";
        } else if (swimmerAge > 15 && swimmerAge <= 30) {
            return "Teenager";
        } else if (swimmerAge > 30 && swimmerAge <= 45) {
            return "Adult";
        } else if (swimmerAge > 45) {
            return "Senior";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("Swimmer age: %d%nCurrent category: %s%n", swimmerAge, displayCategories());
    }
}
