package solvd_02.hospital.exceptions;

public class InvalidPatientIdException extends IllegalArgumentException{
    public InvalidPatientIdException(String msg) {
        super(msg);
    }
}
