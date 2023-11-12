package Requests.Teacher;

public class DeleteTeacherRequest {
    private long id;

    public DeleteTeacherRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
