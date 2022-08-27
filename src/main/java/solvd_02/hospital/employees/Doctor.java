package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidNumberOfPatientsException;

import java.util.List;

// all enums to separate folder
public abstract class Doctor extends  Employee {

    private int numberOfPatients;

    public Doctor(String name, int age, int yearsWorked, double salaryHourly, int numberOfPatients,
                  Specialty specialty) {
        super(name, age, yearsWorked, salaryHourly,specialty);
        this.setNumberOfPatients(numberOfPatients);
    }


    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        if (numberOfPatients < 0) {
            try {
                throw new InvalidNumberOfPatientsException("Can't be smaller than 0, Please enter valid information");
            } catch (InvalidNumberOfPatientsException e) {
                e.printStackTrace();
            }
        }
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String toString() {
        return "Name {" + getName() + " age " + getAge() +
                " numberOfPatients  " + numberOfPatients +
                '}';
    }



    }


