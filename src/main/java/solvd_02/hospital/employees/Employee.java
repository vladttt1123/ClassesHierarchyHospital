package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidSalaryException;
import solvd_02.hospital.exceptions.InvalidYearsWorkedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//comamnd shuft F
public abstract class Employee extends Person{
    protected static Logger logger = LogManager.getLogger(Employee.class);



    private int jobId;
    private int yearsWorked;
    private double salaryHourly;



    public Employee(String name, int age, int jobId, int yearsWorked, double salaryHourly)
    {
        super(name, age);
        logger.info("Your jobid is "+ jobId);
        this.jobId = jobId;
        logger.info("Your total work experience is " + yearsWorked);
        logger.error("Your total experience can't be lower than 0");
        this.setYearsWorked(yearsWorked);
        logger.info("you pay per hours is "+ salaryHourly);

        this.setSalaryHourly(salaryHourly);
    }

    public abstract void work();


    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked){
        if(yearsWorked <= 0){
            try {
                throw new InvalidYearsWorkedException("years worked can't be 0 or lower");
            } catch (InvalidYearsWorkedException e) {
                e.printStackTrace();
            }
        }
        else{
            this.yearsWorked = yearsWorked;
        }
    }

    public double getSalaryHourly() {
        return salaryHourly;
    }

    public void setSalaryHourly(double salaryHourly) {
        if(salaryHourly < 0){
            try {
                throw new InvalidSalaryException("Salary can't be a negative value. Please enter valid value");
            } catch (InvalidSalaryException e) {
                e.printStackTrace();
            }
        }
        this.salaryHourly = salaryHourly;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "jobId=" + jobId +
                ", yearsWorked=" + yearsWorked +
                ", salary=" + salaryHourly +
                '}';
    }
}
