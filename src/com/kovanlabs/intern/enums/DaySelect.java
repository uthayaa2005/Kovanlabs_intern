package com.kovanlabs.intern.enums;

public enum DaySelect {

    SUNDAY(1) , MONDAY(2),SATURDAY(7),TUSDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6);

    public int daynumber;
     DaySelect(int daynumber) {
        this.daynumber = daynumber;
    }
    public int getDaynumber() {
        return this.daynumber;
    }
}
