package Requests.Teacher;

public class EditTeacherRequest {
    private String firstName, lastName, middleName;
    private long teacherID;

    public EditTeacherRequest(String firstName, String lastName, String middleName, long teacherID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.teacherID = teacherID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getTeacherID() {
        return teacherID;
    }
}
