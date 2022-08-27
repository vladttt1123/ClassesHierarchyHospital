package solvd_02.hospital.program;

import solvd_02.hospital.employees.DoctorFamily;
import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.rooms.Ward;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class Program {
    public static void main(String[] args) throws InvalidSalaryException {
        // is it a good practice to call setter method within the constructor ?

        // when I print the familydoc1, why is it only showing unique values ?
        // how to throw an exception in case i want to check not only for negative value
        // but also for data type like String







//        Patient patient1 = new Patient("John", 18, 3,"headache",
//                true, 001);
//////        Nurse opnurse2 = new OperationalNurse("Sarah", 25, 003, 1, 1000,
//////               "neurology", 25);
////
////        calculateSalary(1, 20);
////        familydoc1.referToSurgeon(patient1, Diagnosis.APPENDECTOMY, surgeon1);
//        DoctorHead doc1 = new DoctorHead("Bob", 25, 5643, 25, 15,

        DoctorFamily familydoc1 = new DoctorFamily(
                "Bob",25, 2, 250, 100, Specialty.DOCTOR
        );
        familydoc1.prescribeDrugs(Diagnosis.DIARHEA);





//
//        //getting list of patients and printing it
//        List<Patient> patients = Patient.getListPatients();
//        Patient.printPatients(patients);
//
//        //returns list of ALL employees
//        List<Employee> employees = Employee.getListEmployees();
//        Employee.printEmployees(employees);
//
//        //returns list of Employees based on Specialty ( Doctor )
//        List<Employee> doctors = Employee.filterBySpecialty(employees, Specialty.DOCTOR);
//        //Employee.printEmployees(doctors);
//
//        //returns list of Employees based on Specialty ( Nurse )
//        List<Employee> nurses = Employee.filterBySpecialty(employees, Specialty.NURSE);
//        //Employee.printEmployees(nurses);
//
//
//        //Employee with MAX Salary
//        Employee withMaxSalary = Employee.findWithMaxSalary(employees);
//        System.out.println("Employee with the biggest salary is " + withMaxSalary);
//
//
//        //Employee with Min Salary
//        Employee withMinSalary = Employee.findWithMinSalary(employees);
//        System.out.println("Employee with the smallest salary is " + withMinSalary);
//
//        Map<Specialty, List<Employee>> groupedBySpecialty = Employee.groupBySpecialty(employees);
//        System.out.println(groupedBySpecialty);
//
//        Ward ward1 = new Ward(25, 3, 7, 2, 4);
//
//        ServiceCleaning cleaner1 = new ServiceCleaning("Clara", 25, 2,
//                10, "Cleaning"
//                ,Specialty.SERVICE);
//        cleaner1.clean(ward1);




























//        System.out.println(familydoc1);
//        System.out.println(familydoc2);












    }
}
