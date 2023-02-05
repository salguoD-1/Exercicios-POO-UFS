package application;

import util.HourConverter;

public class Hour {
    public static void main(String[] args) {
        HourConverter hourConverter = new HourConverter();
        // Setamos as horas e minutos
        hourConverter.setHour(3);
        hourConverter.setMinutes(34);
        // Exibe o resultado
        System.out.println(hourConverter);
    }
}
