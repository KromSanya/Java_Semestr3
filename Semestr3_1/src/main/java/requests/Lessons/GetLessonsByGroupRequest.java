package Requests.Lessons;

/**
 * получение списка занятий за период для группы (без информации о посещаемости)
 */
public class GetLessonsByGroupRequest {
    private long groupId;
    private String startDate;
    private String endDate;

    public GetLessonsByGroupRequest(long groupId, String startDate, String endDate) {
        this.groupId = groupId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}