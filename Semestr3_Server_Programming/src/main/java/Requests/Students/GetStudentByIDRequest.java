package Requests.Students;

public class GetStudentByIDRequest {
    private long studentID;

    public GetStudentByIDRequest(long studentID) {
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
}

