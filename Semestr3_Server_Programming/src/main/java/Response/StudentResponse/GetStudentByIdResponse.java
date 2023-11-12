package Response.StudentResponse;

public class GetStudentByIdResponse {
    private String firstName, lastName, middleName, groupName;
    private String status;

    public GetStudentByIdResponse(String firstName, String lastName, String middleName, String groupName, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.groupName = groupName;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
