package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorSurgeon extends Doctor implements IExaminePatient {
    private static Logger logger = LogManager.getLogger(DoctorSurgeon.class);
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
        logger.info("DoctorSurgeon is working");
    }



    public void operate(Patient patient, Diagnosis diagnosis) {
        if(diagnosis == Diagnosis.APPENDECTOMY){
            logger.info("Performing operation on "+  patient.getName());
        }
        else{
            logger.info("There's no need to perform operation  for patient " + patient.getName());
        }
    }

    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Surgeon ");
    }
}
