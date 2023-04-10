package org.example;

public class LineTable {
    private String discipline, markstr;
    private int num, mark;

    public LineTable(String discipline, String markstr, int num, int mark) {
        this.discipline = discipline;
        this.markstr = markstr;
        this.num = num;
        this.mark = mark;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getMarkstr() {
        return markstr;
    }

    public void setMarkstr(String markstr) {
        this.markstr = markstr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
