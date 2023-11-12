package org.example;

public class StudentGroup {

    private String groupName;
    private long groupID;

    public StudentGroup(String groupName, long groupID) {
        this.groupName = groupName;
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }
}

