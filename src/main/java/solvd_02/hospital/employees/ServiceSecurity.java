package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;

public class ServiceSecurity extends Service{


    public ServiceSecurity(String name, int age, int yearsWorked, double salaryHourly,
                           String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }

    @Override
    public void work() {
        System.out.println("ServiceSecurity works");
    }

    public void protect(){
        //to implement
    }

    @Override
    public String toString() {
        return "ServiceSecurity {" + "name= " + getName() + ", yearsOfExperience " + getYearsWorked() +
                ", department name " + getDepartmentName() + "}";
    }
}
