package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.rooms.Room;

public class ServiceCleaning extends Service {
    private static Logger LOGGER = LogManager.getLogger(ServiceCleaning.class);


    public ServiceCleaning(String name, int age, int yearsWorked, double salaryHourly,
                           String departmentName, Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }


    @Override
    public void work() {
        LOGGER.info("ServiceCleaning works");
    }

    public void clean(Room room) {
        LOGGER.info("Cleaning Service cleans" + room);
    }


}
