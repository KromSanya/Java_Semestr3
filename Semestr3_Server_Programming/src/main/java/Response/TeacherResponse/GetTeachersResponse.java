package Response.TeacherResponse;

import java.util.List;

public class GetTeachersResponse {
    private List<String> firstName, lastName, middleName;
    private List<Long> teacherID;

    public GetTeachersResponse(List<String> firstName, List<String> lastName, List<String> middleName, List<Long> teacherID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.teacherID = teacherID;
    }

    public List<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    public List<String> getLastName() {
        return lastName;
    }

    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public void setMiddleName(List<String> middleName) {
        this.middleName = middleName;
    }

    public List<Long> getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(List<Long> teacherID) {
        this.teacherID = teacherID;
    }
}
