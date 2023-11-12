package Requests.Lessons;

import org.example.Teacher;

public class EditLessonRequest {


    private long teacherID;
    private long groupID;
    private int number;
    private String date;
    private long lessonID;

    public EditLessonRequest(long subjectID, long teacherID, long groupID, int number, String name, String date, Long lessonID) {
        this.teacherID = teacherID;
        this.groupID = groupID;
        this.number = number;
        this.date = date;
        this.lessonID = lessonID;
    }



    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getLessonID() {
        return lessonID;
    }

    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }
}

