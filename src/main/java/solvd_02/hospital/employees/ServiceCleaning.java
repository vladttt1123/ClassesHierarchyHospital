package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceCleaning extends Service{


    public ServiceCleaning(String name, int age, int jobId, int yearsWorked, double salaryHourly, String departmentName)
              {
        super(name, age,  jobId, yearsWorked, salaryHourly, departmentName);
    }


    @Override
    public void work() {
        System.out.println("ServiceCleaning works");
    }

    public void clean(){
        //to implement
    }
}
