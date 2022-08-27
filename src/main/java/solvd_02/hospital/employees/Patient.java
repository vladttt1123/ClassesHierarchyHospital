package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.exceptions.InvalidPatientIdException;

import java.util.List;

public class Patient extends Person {
    protected static Logger logger = LogManager.getLogger(Patient.class);
    //class Data get time form the start of illness

    private int treatmentLength;
    private String diagnosis;     // to make via enum
    private boolean isTreatedInHospital;
    private int patientId;

    public Patient(String name, int age, int treatmentLengthDays, String diagnosis, boolean isTreatedInHospital,
                   int patientId) {
        super(name, age);
        this.treatmentLength = treatmentLengthDays;
        this.diagnosis = diagnosis;
        this.isTreatedInHospital = isTreatedInHospital;
        this.setPatientId(patientId);
    }

    public int getTreatmentLength() {
        return treatmentLength;
    }

    public void setTreatmentLength(int treatmentLength) {
        this.treatmentLength = treatmentLength;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isTreatedInHospital() {
        return isTreatedInHospital;
    }

    public void setTreatedInHospital(boolean treatedInHospital) {
        isTreatedInHospital = treatedInHospital;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if (patientId < 0) {
            try {
                throw new InvalidPatientIdException("Patiend Id must be greate than 0");
            } catch (InvalidPatientIdException e) {
                logger.error("invalid Patient ID was entered");
                e.printStackTrace();

            }
            this.patientId = patientId;
        }


    }

    @Override
    public String toString() {
        return "Patient{" +
                "name= " + getName() + " "+
                "treatmentLength=" + treatmentLength + " days " +
                ", diagnosis='" + diagnosis + '\'' +
                ", isTreatedInHospital=" + isTreatedInHospital +
                ", patientId=" + patientId +
                '}';
    }


    public static List<Patient> getListPatients() {
        return List.of(

                new Patient("Carl Peterson", 25, 10, "Headache",
                        false, 456),
                new Patient("Wendy Bernson", 41, 20, "Appendectomy",
                        true, 673)
        );

    }
    //method that will output list of employees
    public static void printPatients(List<Patient> patients){
        patients.forEach(System.out::println);
    }



//    public static void getListOfPatients(List<Patient> list){
//        for (Patient patient: list) {
//            System.out.println(patient);
//        }





}
