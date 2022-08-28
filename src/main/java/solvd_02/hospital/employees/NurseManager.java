package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IManageEmployees;

public class NurseManager extends Nurse implements IManageEmployees, IExaminePatient {
    private static Logger LOGGER = LogManager.getLogger(NurseManager.class);
    // make the list of operational nurses

    private int managedNurses;

    public NurseManager(String name, int age, int yearsWorked, double salaryHourly, String departmentName,
                        int managedNurses, Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
        this.managedNurses = managedNurses;
    }

    public int getManagedNurses() {
        return managedNurses;
    }

    public void setManagedNurses(int managedNurses) {
        this.managedNurses = managedNurses;
    }

    @Override
    public void work() {
        LOGGER.info("Nurse Manage is working");
    }


    public void askOperationalNurseToGivePills(OperationalNurse operationalNurse, Patient patient) {
        LOGGER.info(operationalNurse.getName() + "needs to give pills to,  "
                + patient.getName());
    }


    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info(patient.getName() + " is being examined by Nurse Manager ");
    }


    @Override
    public void fireEmployee(Employee employee) {
        LOGGER.info("Operational Nurse " + employee.getName()
                + " with jobId  " + " is fired by Nurse Manager ");
    }
}
