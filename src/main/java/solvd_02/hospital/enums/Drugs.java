package solvd_02.hospital.enums;

public enum Drugs {
    PARACETAMOL("PARACETAMOL"),
    LOPERAMIDE("LOPERAMIDE"),
    LORATADINE("LORATADINE"),
    TAMIFLU("TAMIFLU"),
    NODRUGS("NO DRUGS");


    private String name;

    Drugs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
