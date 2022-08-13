package solvd_02.hospital.enums;

public enum Diagnosis {
    ALLERGIE("ALLERGIE"),
    FLU("FLU"),
    DIARHEA("DIARHEA"),
    HEADACHE("HEADACHE"),
    APPENDECTOMY("APPENDECTOMY"),
    STROKE("STROKE");

    private String name;

    Diagnosis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
