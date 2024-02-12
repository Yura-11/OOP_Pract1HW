package personal;

import clients.Animal;

public class Nurse extends Doctor {
    public Nurse(String name, String specialization, int experience) {
        super(name, specialization, experience);
    }
    /**
     Помогаем врачу с пациентом
     */
    public void assistDoctor(Doctor doctor, Animal patient) {
        System.out.println("Медсестра " + name + " помогала " + doctor.name + " с " + patient.getName());
    }

    /**
     Лечение пациента
     */
    public void administerMedication(Animal patient, String medication) {
        System.out.println("Медсестра " + name + " обрабатывала " + medication + " животное " + patient.getName());
    }


    public void monitorPatient(Animal patient) {
        System.out.println("Медсестра " + name + " наблюдала за животным " + patient.getName());
    }
}