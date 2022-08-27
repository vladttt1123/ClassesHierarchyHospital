package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorNeurologist extends Doctor implements IExaminePatient {
    private static Logger logger = LogManager.getLogger(DoctorNeurologist.class);

    public DoctorNeurologist(String name, int age, int yearsWorked, double salaryHourly,
                             int numberOfPatients, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
    }

    @Override
    public void work() {
        logger.info("DoctorNeurologist works");
    }


    public void performMRI(Patient patient, Diagnosis diagnosis){
        if (diagnosis == Diagnosis.STROKE){
            logger.info("Performing MRI on" + patient.getName());
        }
        else{
            logger.info(patient.getName() + " does not need MRI");
        }

    }

    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Neurologist");
    }
}
