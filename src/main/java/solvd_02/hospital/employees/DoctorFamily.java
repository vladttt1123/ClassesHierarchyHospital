package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;

import static solvd_02.hospital.enums.Diagnosis.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.interfaces.IExaminePatient;


public class DoctorFamily extends Doctor implements IExaminePatient {
    private static Logger logger = LogManager.getLogger(DoctorFamily.class);

    public DoctorFamily(String name, int age, int jobId, int yearsWorked,
                        double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
    }


    @Override
    public void work() {
        logger.info("Family doctor is working");
    }

    public void referToSurgeon(Patient patient, Diagnosis diagnosis, DoctorSurgeon surgeon){
        logger.info("The name of the patient being referred is " + patient.getName());
        if(diagnosis == APPENDECTOMY){
            logger.info("The Diagnosis is Appendectomy ");
            surgeon.operate(patient);
            logger.info("The patient will be operated by " + surgeon.getName());
        }

    }


    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Family Doctor");
    }

    @Override
    public String toString() {
        return "DoctorFamily{"+ "name= " + getName() + ", age= " + getAge() + ", " +
                "number of patients " + getNumberOfPatients() + " }";
    }
}
