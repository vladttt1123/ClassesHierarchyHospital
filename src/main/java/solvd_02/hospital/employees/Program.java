package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

import static solvd_02.hospital.employees.ServiceAccounting.calculateSalary;

public class Program {
    public static void main(String[] args) throws InvalidYearsWorkedException, InvalidAgeException, InvalidSalaryException {
        // is it a good practice to call setter method within the constructor ?

        // when I print the familydoc1, why is it only showing unique values ?
        // how to throw an exception in case i want to check not only for negative value
        // but also for data type like String


//
//        OperationalNurse opnurse1 = new OperationalNurse("Sarah", 25, 002, 1, 500,
//                "neurology", 25);
        DoctorFamily familydoc1 = new DoctorFamily("John",25, 0001, -2,
                1000, 15);
//        DoctorFamily familydoc2 = new DoctorFamily("John",25, 0001, 2,
//                1000, -2);
        Patient patient1 = new Patient("John", 18, 3,"headache",
                true, 001);
//        Nurse opnurse2 = new OperationalNurse("Sarah", 25, 003, 1, 1000,
//               "neurology", 25);

        calculateSalary(1, 20);

        familydoc1.referToSpecialist(Diagnosis.ALLERGIE);
        familydoc1.referToSpecialist(Diagnosis.STROKE);
        familydoc1.referToSpecialist(Diagnosis.APPENDECTOMY);

        




//        System.out.println(familydoc1);
//        System.out.println(familydoc2);












    }
}
