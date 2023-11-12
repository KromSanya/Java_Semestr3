package Response.LessonsResponse;

import org.example.Student;

import java.util.Map;

public class GetLessonsByTeacherResponse {

    private String teachername, teacherLastName, teacherMiddleName;
    private String groupName;
    private int number;
    private String name, date;
 //   private Map<Student, Boolean> students;

    public GetLessonsByTeacherResponse(String teachername, String teacherLastName, String teacherMiddleName, String groupName, int number, String name,
                                       String date, Map<Student, Boolean> students) {
        this.teachername = teachername;
        this.teacherLastName = teacherLastName;
        this.teacherMiddleName = teacherMiddleName;
        this.groupName = groupName;
        this.number = number;
        this.name = name;
        this.date = date;

    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTeacherMiddleName() {
        return teacherMiddleName;
    }

    public void setTeacherMiddleName(String teacherMiddleName) {
        this.teacherMiddleName = teacherMiddleName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
