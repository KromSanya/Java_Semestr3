package Repositories;

import org.example.Attendance;
import org.example.Lesson;

import java.util.ArrayList;
import java.util.List;

public class RepositoryLesson implements IRepositoryLesson {
    private DataBase base;

    @Override
    public long addLesson(Lesson lesson) {
        System.out.println("Добавлено(типа)");
        return 6;
    }

    @Override
    public void editLesson(Lesson lesson) {
        System.out.println("Изменино(типа)");
    }

    @Override
    public void deleteLesson(long id) {
        System.out.println("Удалено(типа)");
    }

    @Override
    public Attendance GetLessonById(long id) {
        return base.getVisitingLessonMap().get(id);
    }

    @Override
    public List<Lesson> getLessonsByGroup(long idGroup, String startDate, String endDate) {
        List<Lesson> lessons = new ArrayList<>();
        for (Lesson lesson : base.getLessonMap().values()) {

        }
        return lessons;
    }

    @Override
    public List<Lesson> getLessonsByTeacher(long teacherId, String startDate, String endDate) {
        List<Lesson> lessons = new ArrayList<>();


        return lessons;
    }
}
