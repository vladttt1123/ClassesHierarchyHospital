package solvd_02.hospital.enums;

public enum Department {
    SURGERY("SURGERY"),
    OPHTALMOLOGY("OPHTALMOLOGY"),
    NEUROLOGY("OPHTALMOLOGY"),
    PSYSCHIATRIC("OPHTALMOLOGY"),
    CARDIOLOGY("OPHTALMOLOGY"),
    INFECTOUS("OPHTALMOLOGY");

    private String name;

    Department(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
