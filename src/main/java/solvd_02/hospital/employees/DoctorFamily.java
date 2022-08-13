package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

import static solvd_02.hospital.enums.Diagnosis.*;

public class DoctorFamily extends Doctor{

    public DoctorFamily(String name, int age, int jobId, int yearsWorked, double salaryHourly, int numberOfPatients)
              {
        super(name, age, jobId, yearsWorked, salaryHourly, numberOfPatients);
    }



    @Override
    public void examinePatient() {
        // to implement
    }

    @Override
    public void work() {
        // to implement
    }

    public void referToSpecialist(Diagnosis diagnosis){
        if(diagnosis == ALLERGIE){
            System.out.println("Give pills from allergy");
        }
        else if(diagnosis == FLU){
            System.out.println("Prescribe antibiotics");
        }
        else if(diagnosis == STROKE){
            DoctorNeurologist doctorNeurologist = new DoctorNeurologist("John", 25, 002,
                                                                             3, 2000, 15);
            doctorNeurologist.performMRI();
        }
        else if(diagnosis == APPENDECTOMY){
            DoctorSurgeon doctorSurgeon = new DoctorSurgeon("Peter", 25, 003, 3,
                    4500, 45, 100);

            doctorSurgeon.operate();
        }

        // to implement
    }


}
