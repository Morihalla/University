package be.intecbrussel.Model;

public enum Status {

    FRESHMAN("Freshman"),
    SOPHMORES("Sophmores"),
    JUNIOR("Junior"),
    SENIOR("Senior");

    private String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
