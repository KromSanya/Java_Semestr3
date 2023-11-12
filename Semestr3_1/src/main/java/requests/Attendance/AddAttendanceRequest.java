package Requests.Attendance;

import org.example.Student;

import java.util.List;

public class AddAttendanceRequest {
    private long lessonID;
    private List<Long> studentsID;
    private boolean attendance;

    public AddAttendanceRequest(long lessonID, List<Long> studentsID, boolean attendance) {
        this.lessonID = lessonID;
        this.studentsID = studentsID;
        this.attendance = attendance;
    }

    public long getLessonID() {
        return lessonID;
    }

    public void setLessonID(long lessonID) {
        this.lessonID = lessonID;
    }

    public List<Long> getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(List<Long> studentsID) {
        this.studentsID = studentsID;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
}
