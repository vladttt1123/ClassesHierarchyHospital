package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class DoctorSurgeon extends Doctor{
    private int operationsDone;

    public DoctorSurgeon(String name, int age,  int jobId, int yearsWorked, double salaryHourly, int numberOfPatients,
                         int operationsDone)   {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
        this.operationsDone = operationsDone;
    }

    public int getOperationsDone() {
        return operationsDone;
    }

    public void setOperationsDone(int operationsDone) {
        this.operationsDone = operationsDone;
    }





    @Override
    public void work() {
        System.out.println("DoctorSurgeon is operating");
    }

    @Override
    public void examinePatient() {
        System.out.println("DoctorSurgeon examines patient");
    }

    public void operate() {
        System.out.println("Performing operation");
    }
}
