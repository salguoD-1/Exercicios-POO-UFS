package application;

import entities.Patient;

public class Clinic {
    public static void main(String[] args) {
        Patient patient = new Patient();
        // Setamos os dados do paciente
        patient.setName("Douglas");
        patient.setAge(23);
        patient.setSex('M');
        patient.setWeight(68.5);
        patient.setHeight(1.71);
        // Exibe o resultado
        System.out.println(patient);
    }
}
