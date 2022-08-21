package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Diagnosis;
import solvd_02.hospital.exceptions.InvalidAgeException;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


import static solvd_02.hospital.employees.Doctor.getListOfDoctors;
import static solvd_02.hospital.employees.Employee.getListOfEmployees;
import static solvd_02.hospital.employees.Patient.getListOfPatients;
import static solvd_02.hospital.employees.ServiceAccounting.calculateSalary;

public class Program {
    public static void main(String[] args) throws InvalidSalaryException {
        // is it a good practice to call setter method within the constructor ?

        // when I print the familydoc1, why is it only showing unique values ?
        // how to throw an exception in case i want to check not only for negative value
        // but also for data type like String

        /**
         * modified interface manage employees by adding methid fire employee,
         * added this method to head doctor and nurse manager,
         * added Log4J
         * made examine patient an interface, so taht doctor and nurse can examine patient
         * made method refer to surgeon for  Family Doctor
         *need to make Logger Private and added it to every class and implement it to methods
         * string util file util
         * NEW::::
         *  implemented method to get the list of Patients in the Patients Class
         *  method to get the list of Doctors,
         *  method to get list of all employees ( Doctors, Nurses, Service )
         */



//
//        NurseManager nurseManager1 = new NurseManager("Alice", 30, 4234, 21,45,
//                "departemnt", 5);
//
////
//        OperationalNurse opnurse1 = new OperationalNurse("Sarah", 25, 002, 1, 500,
//                "neurology", 25);
////        DoctorFamily familydoc1 = new DoctorFamily("John",25, 0001, 3,
////                1000, 15);
//        List<Doctor> listOfDoctors = new ArrayList<>();
//        listOfDoctors.add(new DoctorSurgeon("Sergiy", 25, 005, 2,
//                4500, 23, 2));
//        listOfDoctors.add(new DoctorFamily("John",25, 0001, 2,
//                1000, 10));
//
////        Patient patient1 = new Patient("John", 18, 3,"headache",
////                true, 001);
////////        Nurse opnurse2 = new OperationalNurse("Sarah", 25, 003, 1, 1000,
////////               "neurology", 25);
//////
//////        calculateSalary(1, 20);
//////        familydoc1.referToSurgeon(patient1, Diagnosis.APPENDECTOMY, surgeon1);
////        DoctorHead doc1 = new DoctorHead("Bob", 25, 5643, 25, 15,
////                25);
////
////        doc1.fireEmployee(familydoc2);
////        nurseManager1.fireEmployee(opnurse1);
////        opnurse1.examinePatient(patient1);
////        familydoc2.examinePatient(patient1);
////        familydoc2.referToSurgeon(patient1, Diagnosis.APPENDECTOMY,surgeon1 );
////        familydoc2.work();
//        List<Patient> listOfPatients = new ArrayList<>();
//        listOfPatients.add(new Patient("Peter", 29, 10,
//                "APPENDECTOMY", false, 456));
//        listOfPatients.add(new Patient("Igor", 29, 10,
//                "HEADACHE", true, 123));


        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new DoctorFamily("Bob Johnson",49, 8736, 3,
                765, 10));
        listOfEmployees.add(new OperationalNurse("Clara", 25, 873, 3,
                                                                    450, "test",
                                                                        20));

        listOfEmployees.add(new ServiceSecurity("Ken", 25, 478, 39, 35,
                "security"));



//        getListOfPatients(listOfPatients);
//
//        getListOfDoctors(listOfDoctors);

        getListOfEmployees(listOfEmployees);















        




//        System.out.println(familydoc1);
//        System.out.println(familydoc2);












    }
}
