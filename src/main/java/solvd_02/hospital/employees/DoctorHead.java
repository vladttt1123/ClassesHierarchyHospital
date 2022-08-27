package solvd_02.hospital.employees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IManageEmployees;

public class DoctorHead extends Doctor implements IManageEmployees, IExaminePatient {
    private static Logger logger = LogManager.getLogger(DoctorHead.class);


    public DoctorHead(String name, int age, int yearsWorked, double salaryHourly, int numberOfPatients,
                       Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
    }

    @Override
    public void work() {
        logger.info("Head Doctor is working");
    }




    @Override
    public void examinePatient(Patient patient) {
        logger.info("Patient"  + patient.getName() + " is being examined by Head Doctor");
    }



    @Override
    public void fireEmployee(Employee employee) {
        logger.info("Doctor " + employee.getName()
                + " is fired by Head Doctor ");
    }
}
