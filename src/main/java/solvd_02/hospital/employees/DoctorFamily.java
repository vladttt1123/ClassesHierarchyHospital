package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;

import static solvd_02.hospital.enums.Diagnosis.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Drugs;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IPrescribeDrugs;


public class DoctorFamily extends Doctor implements IExaminePatient, IPrescribeDrugs {
    private static Logger logger = LogManager.getLogger(DoctorFamily.class);


    public DoctorFamily(String name, int age, int yearsWorked,
                        double salaryHourly, int numberOfPatients, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);

              }


    @Override
    public void work() {
        logger.info("Family doctor is working");
    }

    public void referToSurgeon(Patient patient, Diagnosis diagnosis, DoctorSurgeon surgeon){
        logger.info("The name of the patient being referred is " + patient.getName());
        if(diagnosis == APPENDECTOMY){
            logger.info("The Diagnosis is Appendectomy ");
            surgeon.operate(patient, APPENDECTOMY);
            logger.info("The patient will be operated by " + surgeon.getName());
        }
        else{
            logger.info("The current diagnosies doesn't require Surgeon interference");
        }

    }





    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Family Doctor");
    }

    @Override
    public String toString() {
        return "DoctorFamily{"+ "name= " + getName() + ", age= " + getAge() + ", " +
                "salaryHourly " + getSalaryHourly() +
                " number of patients= " + getNumberOfPatients() + " }";
    }

    @Override
    public Drugs prescribeDrugs(Diagnosis diagnosis) {
        if(diagnosis == HEADACHE){
            logger.info("Paracetamol is prescribed");
            return Drugs.PARACETAMOL;
        }
        else if(diagnosis == DIARHEA){
            logger.info("Loperamide is prescribed");
            return Drugs.LOPERAMIDE;
        }
        else if(diagnosis == ALLERGIE){
            logger.info("Loratadine is prescribed");
            return Drugs.LORATADINE;
        }
        else if (diagnosis == FLU){
            logger.info("Tamiflu is prescribed");
            return Drugs.TAMIFLU;
        }
        else{
            return Drugs.NODRUGS;
        }


    }

}
