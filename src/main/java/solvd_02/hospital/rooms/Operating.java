package solvd_02.hospital.rooms;

public class Operating extends Room {

    private boolean isOperatingEquipmentAvailable;

    public Operating(double square, double ceilingHeight, double roomWidth, int floor, boolean isOperatingEquipmentAvailable) {
        super(square, ceilingHeight, roomWidth, floor);
        this.isOperatingEquipmentAvailable = isOperatingEquipmentAvailable;
    }

    public boolean isOperatingEquipmentAvailable() {
        return isOperatingEquipmentAvailable;
    }

    public void setOperatingEquipmentAvailable(boolean operatingEquipmentAvailable) {
        isOperatingEquipmentAvailable = operatingEquipmentAvailable;
    }
}
