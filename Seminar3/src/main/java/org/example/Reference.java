package org.example;

import java.time.LocalDateTime;
import java.util.Set;


public class Reference {
    private String  fullname, univername, divisioname, speciality;
    private LocalDateTime dateStart, dateEnd;
    private Set<LineTable> lineTables;

    public Reference(String fullname, String univername, String divisioname, String speciality, LocalDateTime dateStart, LocalDateTime dateEnd, Set<LineTable> lineTables) {
        this.fullname = fullname;
        this.univername = univername;
        this.divisioname = divisioname;
        this.speciality = speciality;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.lineTables = lineTables;
    }

    public Reference() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUnivername() {
        return univername;
    }

    public void setUnivername(String univername) {
        this.univername = univername;
    }

    public String getDivisioname() {
        return divisioname;
    }

    public void setDivisioname(String divisioname) {
        this.divisioname = divisioname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }


    public Set<LineTable> getLineTables() {
        return lineTables;
    }

    public void setLineTables(Set<LineTable> lineTables) {
        this.lineTables = lineTables;
    }
}
