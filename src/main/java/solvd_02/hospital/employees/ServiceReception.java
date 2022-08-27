package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class ServiceReception extends Service{
    private static Logger logger = LogManager.getLogger(ServiceReception.class);


    public ServiceReception(String name, int age, int yearsWorked, double salaryHourly,
                            String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }

    @Override
    public void work() {
        logger.info("ServiceReception works");
    }

    public void greetPatient(Patient patient){
        logger.info("Nice to meet you " + patient.getName() + ". "
                + "Please wait for your doctor");
    }

}
