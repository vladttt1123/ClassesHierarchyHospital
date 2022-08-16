package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;
import solvd_02.hospital.interfaces.IExaminePatient;

public class OperationalNurse extends Nurse implements IExaminePatient {

    //make the lsit of patients

    private int numberOfPatients;

    public OperationalNurse(String name, int age, int jobId, int yearsWorked, double salaryHourly, String departmentName,
                            int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, departmentName);
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
        return "OperationalNurse{" +
                "numberOfPatients=" + numberOfPatients +
                '}';
    }


    @Override
    public void work() {
        System.out.println("Operational Nurse is working ");
    }


    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient "+ patient.getName() + " is being examined by Operational Nurse ");
    }
}
