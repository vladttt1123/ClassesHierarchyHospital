package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public abstract class Nurse extends  Employee{
    private String departmentName;

    public Nurse(String name, int age, int jobId, int yearsWorked, double salaryHourly, String departmentName)
              {
        super(name, age, jobId, yearsWorked, salaryHourly);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public void givePillsToThePatient(Patient patient) {

    }


}
