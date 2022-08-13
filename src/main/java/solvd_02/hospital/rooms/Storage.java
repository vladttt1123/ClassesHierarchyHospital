package solvd_02.hospital.rooms;

public class Storage extends Room {

    private int wardrobesNumber;

    public Storage(double square, double ceilingHeight, double roomWidth, int floor, int wardrobesNumber) {
        super(square, ceilingHeight, roomWidth, floor);
        this.wardrobesNumber = wardrobesNumber;
    }

    public int getWardrobesNumber() {
        return wardrobesNumber;
    }

    public void setWardrobesNumber(int wardrobesNumber) {
        this.wardrobesNumber = wardrobesNumber;
    }
}
