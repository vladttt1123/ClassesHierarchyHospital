package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;
import solvd_02.hospital.rooms.Room;
import solvd_02.hospital.rooms.Ward;

public class ServiceCleaning extends Service{


    public ServiceCleaning(String name, int age, int yearsWorked, double salaryHourly,
                           String departmentName, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
    }


    @Override
    public void work() {
        System.out.println("ServiceCleaning works" );
    }

    public void clean(Room room){
        System.out.println("Cleaning Service cleans" + room);
    }


}
