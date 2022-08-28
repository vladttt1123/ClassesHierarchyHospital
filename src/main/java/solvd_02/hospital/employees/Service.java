package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;

public abstract class Service extends Employee {
    private static Logger LOGGER = LogManager.getLogger(Service.class);

    private String departmentName; // to make via enum

    public Service(String name, int age, int yearsWorked, double salaryHourly, String departmentName,
                   Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, specialty);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
