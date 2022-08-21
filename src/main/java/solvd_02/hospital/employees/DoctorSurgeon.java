package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorSurgeon extends Doctor implements IExaminePatient {
    private int operationsDone;

    public DoctorSurgeon(String name, int age, int yearsWorked, double salaryHourly, int numberOfPatients,
                         int operationsDone,Specialty specialty)   {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
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



    public void operate(Patient patient) {
        System.out.println("Performing operation on "+  patient.getName());
    }

    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Surgeon ");
    }
}
