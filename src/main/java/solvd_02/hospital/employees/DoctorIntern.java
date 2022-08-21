package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorIntern extends Doctor implements IExaminePatient {
    private String medicalSchoolName;

    public DoctorIntern(String name, int age, int yearsWorked, double salaryHourly, int numberOfPatients,
                        String medicalSchoolName, Specialty specialty)
                              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
        this.medicalSchoolName = medicalSchoolName;
    }


    public String getMedicalSchoolName() {
        return medicalSchoolName;
    }

    public void setMedicalSchoolName(String medicalSchoolName) {
        this.medicalSchoolName = medicalSchoolName;
    }

    @Override
    public void work() {
        System.out.println("Doctor Intern works");
    }

    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Intern ");
    }

}
