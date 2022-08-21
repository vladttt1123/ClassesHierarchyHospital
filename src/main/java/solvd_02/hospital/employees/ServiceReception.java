package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceReception extends Service{


    public ServiceReception(String name, int age, int yearsWorked, double salaryHourly,
                            String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }

    @Override
    public void work() {
        System.out.println("ServiceReception works");
    }

    public void greetPeople(){
        //to implement
    }

}
