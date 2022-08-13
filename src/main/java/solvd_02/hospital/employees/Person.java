package solvd_02.hospital.employees;

import solvd_02.hospital.exceptions.InvalidAgeException;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            try {
                throw new InvalidAgeException("Age can't be negative value. Please enter a valid age");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }
        else if (age == 0 ){
            try {
                throw new InvalidAgeException("Age can't be equal to zero. Please enter a valid age");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }
        else if(age > 1 && age < 18){
            try {
                throw new InvalidAgeException("Must be 18 or greater");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }
        else{
            this.age = age;
        }

    }
}
