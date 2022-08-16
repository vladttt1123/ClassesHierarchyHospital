package solvd_02.hospital.employees;

import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IManageEmployees;

public class DoctorHead extends Doctor implements IManageEmployees, IExaminePatient {


    public DoctorHead(String name, int age, int jobId, int yearsWorked, double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
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
                + " with jobId  "+  employee.getJobId() + " is fired by Head Doctor ");
    }
}
