package util;

public class HourConverter {
    private double hour;
    private double minutes;
    private double seconds;

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public double hourToMinutes() {
        return hour * 60;
    }

    public double totalOfMinutes() {
        return minutes + (hour * 60);
    }

    public double totalOfSeconds() {
        return (minutes + (hour * 60)) * 60;
    }

    // Exibe o total de segundos(com atributo seconds incluso)
    public double returnTotalOfSeconds() {
        return (minutes + (hour * 60)) * 60 + seconds;
    }

    // Retorna a diferença entre dois tempos
    public static double returnDifferenceBetweenTime(double time1, double time2) {
        return time1 - time2;
    }

    @Override
    public String toString() {
        return String.format("Hour to minutes: %.2f minutes%nTotal of minutes: %.2f minutes%nTotal of seconds: %.2f seconds%n", hourToMinutes(), totalOfMinutes(), totalOfSeconds());
    }
}
