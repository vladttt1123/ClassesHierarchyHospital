package solvd_02.hospital.employees;

import solvd_02.hospital.interfaces.IManageEmployees;

public class DoctorHead extends Doctor implements IManageEmployees {


    public DoctorHead(String name, int age, int jobId, int yearsWorked, double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
    }

    @Override
    public void examinePatient() {

    }

    @Override
    public void work() {

    }





    public void hire(){
        System.out.println("Head Doctor hires new employee");
    }
    public void fire(){
        System.out.println("Head Doctor fires an employee");
    }


    //method implemted from interface
    @Override
    public void manageEmployee() {

    }
}
