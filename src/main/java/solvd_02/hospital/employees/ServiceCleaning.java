package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;
import solvd_02.hospital.rooms.Room;
import solvd_02.hospital.rooms.Ward;

public class ServiceCleaning extends Service{
    private static Logger logger = LogManager.getLogger(ServiceCleaning.class);


    public ServiceCleaning(String name, int age, int yearsWorked, double salaryHourly,
                           String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }


    @Override
    public void work() {
        logger.info("ServiceCleaning works" );
    }

    public void clean(Room room){
        logger.info("Cleaning Service cleans" + room);
    }


}
