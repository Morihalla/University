package be.intecbrussel.Model;

import java.util.Objects;

public abstract class Employees extends Person {

    private double salary;
    private Jobs job;

    public Employees() {

    }

    public Employees(double salary, Jobs job) {
        this.salary = salary;
        this.job = job;
    }

    public Employees(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs job) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress);
        this.salary = salary;
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public Jobs getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "job=" + job +
                "salary=" + salary +
                " €}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return Double.compare(employees.salary, salary) == 0 &&
                job == employees.job;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, job);
    }
}


