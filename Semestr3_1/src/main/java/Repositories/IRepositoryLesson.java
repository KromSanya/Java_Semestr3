package Repositories;

import org.example.Attendance;
import org.example.Lesson;

import java.util.List;

public interface IRepositoryLesson {
    /**
     * добавление занятия
     * @param lesson занятие (с id == null)
     * @return id (!= null) добавленой занятия
     */
    long addLesson(Lesson lesson);

    /**
     * изменение занятия
     * @param lesson занятие
     */
    void editLesson(Lesson lesson);

    /**
     * удаление занятия
     * @param id id занятия
     */
    void deleteLesson(long id);

    /**
     * получение занятия по id (с данными о посещаемости)
     * @param id id занятия
     * @return список посещения занятия с занятием
     */
    Attendance GetLessonById(long id);

    /**
     * получение списка занятий за период для группы (без информации о посещаемости)
     * @param idGroup id группы
     * @param startDate начальная дата
     * @param endDate конечная дата
     * @return занятие
     */
    List<Lesson> getLessonsByGroup(long idGroup, String startDate, String endDate);

    /**
     * получение списка занятий за период для преподавателя (без информации о посещаемости)
     * @param teacherId id преподавателя
     * @param startDate начальная дата
     * @param endDate конечная дата
     * @return занятие
     */
    List<Lesson> getLessonsByTeacher(long teacherId, String startDate, String endDate);
}
