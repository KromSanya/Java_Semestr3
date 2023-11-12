package Requests.StudentGroup;

public class AddStudentGroupRequest {

    private String groupName;

    public AddStudentGroupRequest(String groupName, long groupID) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}

