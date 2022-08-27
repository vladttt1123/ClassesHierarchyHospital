package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Drugs;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class OperationalNurse extends Nurse implements IExaminePatient {
    private static Logger logger = LogManager.getLogger(NurseManager.class);

    //make the lsit of patients

    private int numberOfPatients;

    public OperationalNurse(String name, int age, int yearsWorked, double salaryHourly, String departmentName,
                            int numberOfPatients,Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, departmentName, specialty);
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }



    @Override
    public String toString() {
        return "OperationalNurse {" + "name= " + getName() +
                " age " + getAge() +
                "salaryHourly " + getSalaryHourly() +
                ", department " + getDepartmentName() +
                " " +  ",numberOfPatients=" + numberOfPatients +
                '}';
    }


    @Override
    public void work() {
        logger.info("Operational Nurse is working ");
    }


    @Override
    public void examinePatient(Patient patient) {
        logger.info("Patient "+ patient.getName() + " is being examined by Operational Nurse ");
    }




}
