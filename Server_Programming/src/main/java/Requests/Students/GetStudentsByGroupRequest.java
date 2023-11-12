package Requests.Students;

public class GetStudentsByGroupRequest {
    private long groupID;

    public GetStudentsByGroupRequest(long groupID) {
        this.groupID = groupID;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }
}
