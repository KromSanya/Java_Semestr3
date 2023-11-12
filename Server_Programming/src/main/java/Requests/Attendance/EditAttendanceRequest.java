package Requests.Attendance;

import org.example.Student;

import java.util.List;

public class EditAttendanceRequest {
    private long lessonID;
    private List<Student> students;
    private boolean attendance;
}
