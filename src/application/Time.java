package application;

import util.HourConverter;

public class Time {
    public static void main(String[] args) {
        HourConverter hourConverter1 = new HourConverter();
        HourConverter hourConverter2 = new HourConverter();

        // Setamos hora, minutos e segundos
        hourConverter1.setHour(3);
        hourConverter1.setMinutes(36);
        hourConverter1.setSeconds(42);

        // Setamos hora, minutos e segundos
        hourConverter2.setHour(2.5);
        hourConverter2.setMinutes(14);
        hourConverter2.setSeconds(54);

        // Armazenamos o total de segundos de cada objeto
        double time1 = hourConverter1.returnTotalOfSeconds();
        double time2 = hourConverter2.returnTotalOfSeconds();

        // Exibe a diferença em segundos de cada tempo
        System.out.printf("Difference between time one and time two is: %.2f seconds%n", HourConverter.returnDifferenceBetweenTime(time1, time2));
    }
}
