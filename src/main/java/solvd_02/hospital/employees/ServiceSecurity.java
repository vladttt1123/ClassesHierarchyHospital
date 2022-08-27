package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;

public class ServiceSecurity extends Service{
    private static Logger logger = LogManager.getLogger(ServiceSecurity.class);


    public ServiceSecurity(String name, int age, int yearsWorked, double salaryHourly,
                           String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }

    @Override
    public void work() {
        logger.info("ServiceSecurity is working");
    }



    @Override
    public String toString() {
        return "ServiceSecurity {" + "name= " + getName() + ", yearsOfExperience " + getYearsWorked() +
                ", department name " + getDepartmentName() + "}";
    }
}
