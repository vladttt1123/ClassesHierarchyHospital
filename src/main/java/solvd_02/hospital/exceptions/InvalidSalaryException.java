package solvd_02.hospital.exceptions;

public class InvalidSalaryException extends IllegalArgumentException{
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}
