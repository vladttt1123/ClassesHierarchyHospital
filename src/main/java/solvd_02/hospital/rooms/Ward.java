package solvd_02.hospital.rooms;

public class Ward extends Room{

    private int numberBeds;

    public Ward(double square, double ceilingHeight, double roomWidth, int floor, int numberBeds) {
        super(square, ceilingHeight, roomWidth, floor);
        this.numberBeds = numberBeds;
    }

    public int getNumberBeds() {
        return numberBeds;
    }

    public void setNumberBeds(int numberBeds) {
        this.numberBeds = numberBeds;
    }


    @Override
    public String toString() {
        return "Ward{" +
                "numberBeds=" + numberBeds +
                '}';
    }
}
