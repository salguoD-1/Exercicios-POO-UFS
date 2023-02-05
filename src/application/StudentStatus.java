package application;

import util.ArithmeticMeanGrades;

public class StudentStatus {
    public static void main(String[] args) {
        ArithmeticMeanGrades arithmeticMeanGrades = new ArithmeticMeanGrades();
        // Setamos as notas
        arithmeticMeanGrades.setGrade1(8.5);
        arithmeticMeanGrades.setGrade2(5.6);
        arithmeticMeanGrades.setGrade3(9.2);
        // Exibe o resultado
        System.out.println(arithmeticMeanGrades);
    }
}
