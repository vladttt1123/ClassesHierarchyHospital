package solvd_02.hospital.employees;

import solvd_02.hospital.interfaces.IExaminePatient;
import solvd_02.hospital.interfaces.IManageEmployees;

public class NurseManager extends Nurse implements IManageEmployees, IExaminePatient {
    // make the list of operational nurses

    private int managedNurses;

    public NurseManager(String name, int age, int jobId, int yearsWorked, double salaryHourly, String departmentName,
                        int managedNurses)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, departmentName);
        this.managedNurses = managedNurses;
    }

    public int getManagedNurses() {
        return managedNurses;
    }

    public void setManagedNurses(int managedNurses) {
        this.managedNurses = managedNurses;
    }

    @Override
    public void work() {
        System.out.println("Nurse Manage is working");
    }




    public void askOperationalNurseToGivePills(OperationalNurse operationalNurse,Patient patient){
        System.out.println(operationalNurse.getName() + "needs to give pills to,  "
              + patient.getName());
    }




    @Override
    public void examinePatient(Patient patient) {
        System.out.println(patient.getName() + " is being examined by Nurse Manager ");
    }



    @Override
    public void fireEmployee(Employee employee) {
        System.out.println("Operational Nurse " + employee.getName()
                + " with jobId  "+  employee.getJobId() + " is fired by Nurse Manager ");
    }
}
