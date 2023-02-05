package util;

public class DisplayMonth {
    private String month;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int returnMonth() {
        // Variável auxiliar
        String aux = month.toLowerCase();

        switch (aux) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
            default:
                return -1;
        }
    }

    @Override
    public String toString() {
        // NOTA: month.substring(0, 1).toUpperCase() + month.substring(1) transforma a primeira letra em maiúsculo
        return String.format("%s is month: %d%n", month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase(), returnMonth());
    }
}
