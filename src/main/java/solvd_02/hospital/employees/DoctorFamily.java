package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Drugs;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IPrescribeDrugs;

import static solvd_02.hospital.enums.Diagnosis.APPENDECTOMY;


public class DoctorFamily extends Doctor implements IExaminePatient, IPrescribeDrugs {
    private static Logger LOGGER = LogManager.getLogger(DoctorFamily.class);


    public DoctorFamily(String name, int age, int yearsWorked,
                        double salaryHourly, int numberOfPatients, Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);

    }


    @Override
    public void work() {
        LOGGER.info("Family doctor is working");
    }

    public void referToSurgeon(Patient patient, Diagnosis diagnosis, DoctorSurgeon surgeon) {
        LOGGER.info("The name of the patient being referred is " + patient.getName());
        if (diagnosis == APPENDECTOMY) {
            LOGGER.info("The Diagnosis is Appendectomy ");
            surgeon.operate(patient, APPENDECTOMY);
            LOGGER.info("The patient will be operated by " + surgeon.getName());
        } else {
            LOGGER.info("The current diagnosies doesn't require Surgeon interference");
        }

    }


    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info("Patient" + patient.getName() + " is being examined by Family Doctor");
    }

    @Override
    public String toString() {
        return "DoctorFamily{" + "name= " + getName() + ", age= " + getAge() + ", " +
                "salaryHourly " + getSalaryHourly() +
                " number of patients= " + getNumberOfPatients() + " }";
    }

    @Override
    public Drugs prescribeDrugs(Diagnosis diagnosis) {
        switch (diagnosis) {
            case HEADACHE:
                LOGGER.info("Paracetamol is prescribed");
                return Drugs.PARACETAMOL;
            case DIARHEA:
                LOGGER.info("Loperamide is prescribed");
                return Drugs.LOPERAMIDE;
            case ALLERGIE:
                LOGGER.info("Loratadine is prescribed");
                return Drugs.LORATADINE;
            case FLU:
                LOGGER.info("Tamiflu is prescribed");
                return Drugs.TAMIFLU;
            default:
                LOGGER.info("No drugs are prescribed");
                return Drugs.NODRUGS;
        }
    }

}
