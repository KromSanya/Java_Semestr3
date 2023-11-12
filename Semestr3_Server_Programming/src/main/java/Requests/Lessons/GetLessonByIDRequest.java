package Requests.Lessons;

public class GetLessonByIDRequest {
    private long lessonID;

    public GetLessonByIDRequest(long lessonID) {
        this.lessonID = lessonID;
    }

    public long getLessonID() {
        return lessonID;
    }

    public void setLessonID(long lessonID) {
        this.lessonID = lessonID;
    }
}

