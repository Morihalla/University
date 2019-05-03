package be.intecbrussel.Model;

public enum Courses {
    BIOLOGY("Biology"),
    CHEMISTRY("Chemistry"),
    MATHEMATICS("Mathematics"),
    ENGLISH("English"),
    FRENCH("French"),
    DUTCH("Dutch");

    private String coursName;

    Courses(String coursName) {
        this.coursName = coursName;
    }

    public String getCoursName() {
        return coursName;
    }

}
