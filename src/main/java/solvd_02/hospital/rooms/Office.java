package solvd_02.hospital.rooms;

public class Office extends Room {
    private int doctorsResponsibleNumber;
    private int computersNumber;

    public Office(double square, double ceilingHeight, double roomWidth, int floor, int doctorsResponsibleNumber, int computersNumber) {
        super(square, ceilingHeight, roomWidth, floor);
        this.doctorsResponsibleNumber = doctorsResponsibleNumber;
        this.computersNumber = computersNumber;
    }

    public int getDoctorsResponsibleNumber() {
        return doctorsResponsibleNumber;
    }

    public void setDoctorsResponsibleNumber(int doctorsResponsibleNumber) {
        this.doctorsResponsibleNumber = doctorsResponsibleNumber;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }
}
