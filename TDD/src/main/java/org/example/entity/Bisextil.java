package org.example.entity;

public class Bisextil {
    private int year;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Boolean bisextil(int year) {
        if(year%4 == 0 && year%100 != 0) {
            return true;
        }
        else if(year%400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
