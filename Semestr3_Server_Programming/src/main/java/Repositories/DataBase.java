package Repositories;

import org.example.*;

import java.util.Map;

public class DataBase {
    private Map<Long, Student> studentMap;
    private Map<Long, Teacher> teacherMap;
    private Map<Long, StudentGroup> groupMap;
    private Map<Long, Subject> subjectMap;
    private Map<Long, Lesson> lessonMap;
    private Map<Long, Attendance> visitingLessonMap; // id занятия

    public Map<Long, Student> getStudentMap() {
        return studentMap;
    }

    public Map<Long, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public Map<Long, StudentGroup> getGroupMap() {
        return groupMap;
    }

    public Map<Long, Subject> getSubjectMap() {
        return subjectMap;
    }

    public Map<Long, Lesson> getLessonMap() {
        return lessonMap;
    }

    public Map<Long, Attendance> getVisitingLessonMap() {
        return visitingLessonMap;
    }
}
