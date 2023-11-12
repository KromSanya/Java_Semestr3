package Requests.Lessons;

/**
 * получение списка занятий за период для преподавателя (без информации о посещаемости)
 */
public class GetLessonsByTeacherRequest {
    private long teacherId;
    private String startDate;
    private String endDate;

    public GetLessonsByTeacherRequest(long teacherId, String startDate, String endDate) {
        this.teacherId = teacherId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getTeacherId() { return teacherId; }
    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
