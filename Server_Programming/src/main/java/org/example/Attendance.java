package org.example;

import java.util.List;
import java.util.Map;

public class Attendance {
    private long id;
   // private List<Student> students;

    private Map<Student, Boolean> studentsmap;

    public Attendance(long id, Map<Student, Boolean> studentsmap) {
        this.id = id;
        this.studentsmap = studentsmap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<Student, Boolean> getStudentsmap() {
        return studentsmap;
    }

    public void setStudentsmap(Map<Student, Boolean> studentsmap) {
        this.studentsmap = studentsmap;
    }
}
