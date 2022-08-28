package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorNeurologist extends Doctor implements IExaminePatient {
    private static Logger LOGGER = LogManager.getLogger(DoctorNeurologist.class);

    public DoctorNeurologist(String name, int age, int yearsWorked, double salaryHourly,
                             int numberOfPatients, Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
    }

    @Override
    public void work() {
        LOGGER.info("DoctorNeurologist works");
    }


    public void performMRI(Patient patient, Diagnosis diagnosis) {
        if (diagnosis == Diagnosis.STROKE) {
            LOGGER.info("Performing MRI on" + patient.getName());
        } else {
            LOGGER.info(patient.getName() + " does not need MRI");
        }

    }

    @Override
    public void examinePatient(Patient patient) {
        LOGGER.info("Patient" + patient.getName() + " is being examined by Neurologist");
    }
}
