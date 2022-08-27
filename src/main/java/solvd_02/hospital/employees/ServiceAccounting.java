package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceAccounting extends Service{
    private static Logger logger = LogManager.getLogger(ServiceAccounting.class);


    public ServiceAccounting(String name, int age, int yearsWorked, double salaryHourly,
                             String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }



    @Override
    public void work() {
        logger.info("ServiceAccounting is  working");
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

    }
}
