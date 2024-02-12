package personal;

import clients.Animal;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public String name;
    public String specialization;
    public int experience;
    private List<Animal> patients;

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.patients = new ArrayList<>();
    }


    public void diagnosePatient(Animal patient) {
        System.out.println("Доктор" + name + " поставил диагноз животному '" + patient.getName() + "' " + patient.getIllness());
    }


    public void prescribeMedication(Animal patient, String medication) {
        System.out.println("Доктор " + name + " назначает "+ patient + medication);
    }


    public void admitPatient(Animal patient) {
        System.out.println("Доктор " + name + " вылечил " + patient.getName());
        patients.add(patient);
    }
}
