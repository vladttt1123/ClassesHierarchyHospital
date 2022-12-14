package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Drugs;
import solvd_02.hospital.enums.Specialty;

public abstract class Nurse extends Employee {

    private String departmentName;

    public Nurse(String name, int age, int yearsWorked, double salaryHourly, String departmentName,
                 Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, specialty);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public void givePillsToThePatient(Patient patient, Diagnosis diagnosis, Drugs drugs) {

    }


}
