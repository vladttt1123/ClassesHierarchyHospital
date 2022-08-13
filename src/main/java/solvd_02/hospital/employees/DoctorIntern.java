package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class DoctorIntern extends Doctor{
    private String medicalSchoolName;

    public DoctorIntern(String name, int age, int jobId, int yearsWorked, double salaryHourly, int numberOfPatients,
                        String medicalSchoolName)
                              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
        this.medicalSchoolName = medicalSchoolName;
    }


    public String getMedicalSchoolName() {
        return medicalSchoolName;
    }

    public void setMedicalSchoolName(String medicalSchoolName) {
        this.medicalSchoolName = medicalSchoolName;
    }

    @Override
    public void examinePatient() {

    }
    @Override
    public void work() {

    }

}
