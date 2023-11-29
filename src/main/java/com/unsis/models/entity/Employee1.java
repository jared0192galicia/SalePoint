package com.unsis.models.entity;

import java.sql.Date;

/**
 *
 * @author labtecweb10
 */
public class Employee1 extends People {
    private String number;
    private Date dateEntry;
    private boolean status;
    private String area;
    private String position;
    private int numEmploye;

    public Employee1() {
    }
    
    public Employee1(int numEmploye, String number, Date dateEntry, boolean status, String area, String position, String name, String matherLastName, String fatherLastName, Date birthday, String mail, String cell) {
        super(name, matherLastName, fatherLastName, birthday, mail, cell);
        this.number = number;
        this.dateEntry = dateEntry;
        this.status = status;
        this.area = area;
        this.position = position;
    }
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setNumEmploye(int numEmploye) {
        this.numEmploye = numEmploye;
    }

    public int getNumEmploye() {
        return numEmploye;
    }

    public Date getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
