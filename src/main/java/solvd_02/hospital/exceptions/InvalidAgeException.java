package solvd_02.hospital.exceptions;

// try to Inherit More Specific Exceptions


public class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
