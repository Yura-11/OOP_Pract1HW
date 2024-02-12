import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimadle;
import personal.Doctor;
import personal.Nurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {

    public List<Animal> patients = new ArrayList<>();




    /**
     * Добавляет пациентов списком
     */
    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    /**
     * Возвращает список пациентов
     */
    public List<Animal> getPatients() {
        return patients;
    }

    /**
     * Возвращает бегающих животных
     */
    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    /**
     * Возвращает летающих животных (через stream api)
     */
    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable)
                result.add((Flyable) animal);
        }
        return result;
    }


    /**
     * Возвращает плавающих животных
     */
    public List<Swimadle> getSwimadles() {
        List<Swimadle> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Swimadle)
                result.add((Swimadle) animal);
        }
        return result;
    }

    /**
     * Методы для персонала
     */
    public List<Doctor> doctors;
    public List<Nurse> nurses;

    public VeterinaryClinic() {
        this.doctors = new ArrayList<>();
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);

    }

    public void addNurse(Nurse nurse) {
        doctors.add(nurse);

    }



}










