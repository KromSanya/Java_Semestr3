package Repositories;

import org.example.*;

import java.util.List;

public interface IRepositoryAttendance {
    void addAttendanceData(int lessonId, List<Student> students);

    void deleteAttendanceData(int lessonId);
}

