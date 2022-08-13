package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

public class DoctorNeurologist extends Doctor{

    public DoctorNeurologist(String name, int age, int jobId, int yearsWorked, double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
    }

    @Override
    public void work() {
        System.out.println("DoctorNeurologist works");
    }

    @Override
    public void examinePatient() {
        System.out.println("DoctorNeurologist examines patient");
    }




    public void performMRI(){
        System.out.println("Performing MRI ");
    }
}
