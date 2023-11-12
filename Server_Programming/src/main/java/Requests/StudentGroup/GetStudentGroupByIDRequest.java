package Requests.StudentGroup;

public class GetStudentGroupByIDRequest {
    private long id;

    public GetStudentGroupByIDRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
