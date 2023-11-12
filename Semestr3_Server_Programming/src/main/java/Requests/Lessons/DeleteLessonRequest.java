package Requests.Lessons;

public class DeleteLessonRequest {
    private long lessonID;

    public DeleteLessonRequest(long lessonID) {
        this.lessonID = lessonID;
    }

    public long getLessonID() {
        return lessonID;
    }

    public void setLessonID(long lessonID) {
        this.lessonID = lessonID;
    }
}
