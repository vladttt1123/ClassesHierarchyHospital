package solvd_02.hospital.rooms;

public abstract class Room {

    private double square;
    private double ceilingHeight;
    private double roomWidth;
    private int floor;


    public Room(double square, double ceilingHeight, double roomWidth, int floor) {
        this.square = square;
        this.ceilingHeight = ceilingHeight;
        this.roomWidth = roomWidth;
        this.floor = floor;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "square=" + square +
                ", floor=" + floor +
                '}';
    }
}
