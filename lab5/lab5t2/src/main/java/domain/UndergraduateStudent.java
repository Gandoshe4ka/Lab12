package domain;

public class UndergraduateStudent extends Student {
    private String group;

    public UndergraduateStudent() {
    }

    public UndergraduateStudent(String name, int studentId, String group) {
        super(name, studentId);
        this.group = group;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        if (group != null && !group.trim().isEmpty()) {
            this.group = group;
        } else {
            this.group = "Unknown";
        }
    }
}