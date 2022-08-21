package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceAccounting extends Service{


    public ServiceAccounting(String name, int age, int yearsWorked, double salaryHourly,
                             String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }



    @Override
    public void work() {
        System.out.println("ServiceAccounting works");
    }


    public static double calculateSalary(double hourlyRate, double hoursWorked) throws InvalidSalaryException {
        if(hourlyRate <= 0){
            throw new InvalidSalaryException("hourly rate can't be lower than 0");
        }
        else{
            double totalSalary =  hourlyRate * hoursWorked;
            System.out.println(totalSalary);
            return totalSalary;

        }
        //to implement
    }
}
