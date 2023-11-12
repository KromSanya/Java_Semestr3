package Response.StudentGroupResponse;

import org.example.StudentGroup;

import java.util.List;

public class GetStudentsGroupsResponse {
    List<String> groups;

    public GetStudentsGroupsResponse(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }
}

