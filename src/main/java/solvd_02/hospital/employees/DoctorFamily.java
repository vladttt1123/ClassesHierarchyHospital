package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;

import static solvd_02.hospital.enums.Diagnosis.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.interfaces.IExaminePatient;


public class DoctorFamily extends Doctor implements IExaminePatient {
    protected static Logger logger = LogManager.getLogger(DoctorFamily.class);

    public DoctorFamily(String name, int age, int jobId, int yearsWorked,
                        double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
    }


    @Override
    public void work() {
        System.out.println("Family doctor is working");
    }

    public void referToSurgeon(Patient patient, Diagnosis diagnosis, DoctorSurgeon surgeon){
        if(diagnosis == APPENDECTOMY){
            surgeon.operate(patient);
        }

    }


    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Family Doctor");
    }
}
