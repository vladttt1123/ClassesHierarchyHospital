package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IManageEmployees;

public class DoctorHead extends Doctor implements IManageEmployees, IExaminePatient {


    public DoctorHead(String name, int age, int yearsWorked, double salaryHourly, int numberOfPatients,
                       Specialty specialty)
              {
        super(name, age, yearsWorked, salaryHourly, numberOfPatients, specialty);
    }

    @Override
    public void work() {

    }


    //method implemted from interface


    @Override
    public void examinePatient(Patient patient) {
        System.out.println("Patient"  + patient.getName() + " is being examined by Head Doctor");
    }



    @Override
    public void fireEmployee(Employee employee) {
        System.out.println("Doctor " + employee.getName()
                + " is fired by Head Doctor ");
    }
}
