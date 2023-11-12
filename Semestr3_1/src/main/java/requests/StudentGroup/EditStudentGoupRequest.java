package Requests.StudentGroup;

public class EditStudentGoupRequest {
    private String groupName;
    private long groupID;

    public EditStudentGoupRequest(String groupName, long groupID) {
        this.groupName = groupName;
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public long getGroupID() {
        return groupID;
    }
}
