package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;

public class ServiceReception extends Service {
    private static Logger LOGGER = LogManager.getLogger(ServiceReception.class);


    public ServiceReception(String name, int age, int yearsWorked, double salaryHourly,
                            String departmentName, Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }

    @Override
    public void work() {
        LOGGER.info("ServiceReception works");
    }

    public void greetPatient(Patient patient) {
        LOGGER.info("Nice to meet you " + patient.getName() + ". "
                + "Please wait for your doctor");
    }

}
