package be.intecbrussel.Model;

public class Teachers extends Employees {

    private Faculty faculty;

    public Teachers(Faculty faculty) {
        this.faculty = faculty;
    }

    public Teachers(double salary, Jobs job, Faculty faculty) {
        super(salary, job);
        this.faculty = faculty;
    }

    public Teachers(int ID, String name, int age, String gender, String address, String phoneNumber, String emailAddress, double salary, Jobs job, Faculty faculty) {
        super(ID, name, age, gender, address, phoneNumber, emailAddress, salary, job);
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "faculty=" + faculty +
                '}';
    }
}
