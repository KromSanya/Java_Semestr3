package Requests.Teacher;

public class GetTeacherByIdRequest {
    private long teacherID;

    public GetTeacherByIdRequest(long teacherID) {
        this.teacherID = teacherID;
    }

    public long getTeacherID() {
        return teacherID;
    }
}
