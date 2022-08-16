package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidNumberOfPatientsException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

// all enums to separate folder
public abstract class Doctor extends  Employee{

    private int numberOfPatients;

    public Doctor(String name, int age,  int jobId, int yearsWorked, double salaryHourly, int numberOfPatients) {
        super(name, age, jobId, yearsWorked, salaryHourly);
        this.setNumberOfPatients(numberOfPatients);
    }


    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        if(numberOfPatients < 0){
            try {
                throw new InvalidNumberOfPatientsException("Can't be smaller than 0, Please enter valid information");
            } catch (InvalidNumberOfPatientsException e) {
                e.printStackTrace();
            }
        }
        this.numberOfPatients = numberOfPatients;
    }


}
