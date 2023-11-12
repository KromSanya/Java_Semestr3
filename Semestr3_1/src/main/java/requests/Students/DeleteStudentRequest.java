package Requests.Students;

public class DeleteStudentRequest {
    private long id;

    public DeleteStudentRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
