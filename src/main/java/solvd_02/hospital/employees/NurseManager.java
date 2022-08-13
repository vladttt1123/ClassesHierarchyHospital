package solvd_02.hospital.employees;

import solvd_02.hospital.interfaces.IManageEmployees;

public class NurseManager extends Nurse implements IManageEmployees {
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
        //toImplement
    }

    @Override
    public void takeCareOfPatient() {
        //toImplement
    }

    //unique method for this class
    public void giveTasksToNurses(){
        //toImplement
    }


    //method implemted from interface
    @Override
    public void manageEmployee( ) {

    }
}
