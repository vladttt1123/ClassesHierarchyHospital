package solvd_02.hospital.employees;

import solvd_02.hospital.enums.Specialty;
import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//comamnd shuft F
public abstract class Employee extends Person {
    private static Logger LOGGER = LogManager.getLogger(Employee.class);



    private int yearsWorked;
    private double salaryHourly;
    private Specialty specialty;


    public Employee(String name, int age, int yearsWorked, double salaryHourly, Specialty specialty) {
        super(name, age);
        LOGGER.info("Your total work experience is " + yearsWorked);
        this.setYearsWorked(yearsWorked);
        LOGGER.info("you pay per hours is " + salaryHourly);

        this.setSalaryHourly(salaryHourly);
        this.specialty = specialty;
    }

    public abstract void work();





    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        if (yearsWorked <= 0) {
            try {
                throw new InvalidYearsWorkedException("years worked can't be 0 or lower");
            } catch (InvalidYearsWorkedException e) {
                e.printStackTrace();
            }
        } else {
            this.yearsWorked = yearsWorked;
        }
    }

    public double getSalaryHourly() {
        return salaryHourly;
    }

    public void setSalaryHourly(double salaryHourly) {
        if (salaryHourly < 0) {
            try {
                throw new InvalidSalaryException("Salary can't be a negative value. Please enter valid value");
            } catch (InvalidSalaryException e) {
                e.printStackTrace();
            }
        }
        this.salaryHourly = salaryHourly;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", yearsWorked=" + yearsWorked +
                ", salary=" + salaryHourly +
                '}';
    }


    // List of All employees

    public static List<Employee> getListEmployees(){
        return List.of(
                new DoctorFamily("Bob Johnson",49, 15, 100,
                        25, Specialty.DOCTOR),
                new DoctorFamily("Steven Peterson",51, 12, 115,
                        15, Specialty.DOCTOR),
                new OperationalNurse("Clara", 25, 5, 50,
                        "testDepartemnt", 8, Specialty.NURSE),
                new ServiceSecurity("Ken", 25, 3, 25, "security",
                         Specialty.SERVICE)
        );
    }



    // Filtering Employees based on Specialty. Possible Values ( Doctor, Nurse, Service )

    public static List<Employee> filterBySpecialty(List<Employee> employees, Specialty specialty){
        return employees.stream()
                .filter(employee -> employee.getSpecialty().equals(specialty))
                .collect(Collectors.toList());
    }


    // method that finds an employee with the biggest salary
    public static Employee findWithMaxSalary(List<Employee> employees){
        return employees.stream().max(Comparator.comparing(Employee::getSalaryHourly)).orElse(null);
    }


    // method that finds an employee with the smallest salary
    public static Employee findWithMinSalary(List<Employee> employees){
        return employees.stream().min(Comparator.comparing(Employee::getSalaryHourly)).orElse(null);
    }

    //method that groups employees based on the specialty
    public static Map<Specialty, List<Employee>> groupBySpecialty(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getSpecialty));
    }

    //method that will output list of employees
    public static void printEmployees(List<Employee> employees){
        employees.forEach(System.out::println);
    }


// The method belows seems to be deprecated, that's why method above was used
//    public static void getListOfEmployees(List<Employee> list) {
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
//    }
}
