package be.intecbrussel.Model;

import java.util.Objects;

public class Staff extends Employees {




    public Staff() {
    }

    public Staff(double salary, Jobs job) {
        super(salary, job);
    }

    public Staff(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs job) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress, salary, job);
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
