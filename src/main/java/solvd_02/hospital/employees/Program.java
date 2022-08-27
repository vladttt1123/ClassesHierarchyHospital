package solvd_02.hospital.employees;

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
         *  method to get list of all employees ( Doctors, Nurses, Service ) in Employees class
         *  method that filters employees based on speciality
         *  method that returns an employee with max/min salary
         *  method that returns list of all employees grouped based on speciality
         *  exceptions, enums
         *  TODO:
         *  functional interfacess
         *  стоврити потоки двома способами
         *  to do deadlock and functional interface
         *  гонка потоків , коли обидва потоки чекають один одного , і програма заціклюється
         *  життєві цикли мейвена
         *
         *
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





        //getting list of patients and printing it
        List<Patient> patients = Patient.getListPatients();
        Patient.printPatients(patients);

        //returns list of ALL employees
        List<Employee> employees = Employee.getListEmployees();
        Employee.printEmployees(employees);

        //returns list of Employees based on Specialty ( Doctor )
        List<Employee> doctors = Employee.filterBySpecialty(employees, Specialty.DOCTOR);
        //Employee.printEmployees(doctors);

        //returns list of Employees based on Specialty ( Nurse )
        List<Employee> nurses = Employee.filterBySpecialty(employees, Specialty.NURSE);
        //Employee.printEmployees(nurses);


        //Employee with MAX Salary
        Employee withMaxSalary = Employee.findWithMaxSalary(employees);
        System.out.println("Employee with the biggest salary is " + withMaxSalary);


        //Employee with Min Salary
        Employee withMinSalary = Employee.findWithMinSalary(employees);
        System.out.println("Employee with the smallest salary is " + withMinSalary);

        Map<Specialty, List<Employee>> groupedBySpecialty = Employee.groupBySpecialty(employees);
        System.out.println(groupedBySpecialty);

        Ward ward1 = new Ward(25, 3, 7, 2, 4);

        ServiceCleaning cleaner1 = new ServiceCleaning("Clara", 25, 2,
                10, "Cleaning"
                ,Specialty.SERVICE);
        cleaner1.clean(ward1);




























//        System.out.println(familydoc1);
//        System.out.println(familydoc2);












    }
}
