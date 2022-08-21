package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;

public class DoctorNeurologist extends Doctor implements IExaminePatient {

    public DoctorNeurologist(String name, int age, int yearsWorked, double salaryHourly,
                             int numberOfPatients, Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
    }

    @Override
    public void work() {
        System.out.println("DoctorNeurologist works");
    }


    public void performMRI(Patient patient){
        System.out.println("Performing MRI on" + patient.getName());
    }

    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Neurologist");
    }
}
