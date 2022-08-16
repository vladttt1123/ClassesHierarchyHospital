package solvd_02.hospital.exceptions;

public class InvalidNumberOfPatientsException extends IllegalArgumentException{
    public InvalidNumberOfPatientsException(String msg) {
        super(msg);
    }
}
