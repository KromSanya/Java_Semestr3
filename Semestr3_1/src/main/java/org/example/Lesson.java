package org.example;

import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


/**
 Занятие
 */
public class Lesson {

    private long subjectID, groupID, lessonID;
    private long teacherID;
    private int number;
    @NotNull
    private String name;
    @Pattern("^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$")
    private String date;


    public Lesson(long subjectID, long teacher, long groupID, int number, String name, String date, Long lessonID) {
        this.subjectID = subjectID;
        this.teacherID = teacher;
        this.groupID = groupID;
        this.number = number;
        this.name = name;
        this.date = date;
        this.lessonID = lessonID;
    }

    public long getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(long subjectID) {
        this.subjectID = subjectID;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
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

    public Long getLessonID() {
        return lessonID;
    }

    public void setLessonID(Long lessonID) {
        this.lessonID = lessonID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson lesson)) return false;
        return subjectID == lesson.subjectID && groupID == lesson.groupID && lessonID == lesson.lessonID && teacherID == lesson.teacherID && number == lesson.number && name.equals(lesson.name) && date.equals(lesson.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectID, groupID, lessonID, teacherID, number, name, date);
    }
}
