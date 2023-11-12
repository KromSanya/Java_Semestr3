package Response.StudentResponse;

import java.util.List;

public class GetStudentsByGroupResponse {
    private List<String> firstName, lastName, middleName;
    private List<String> status;

    public GetStudentsByGroupResponse(List<String> firstName, List<String> lastName, List<String> middleName, List<String> status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.status = status;
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

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }
}
