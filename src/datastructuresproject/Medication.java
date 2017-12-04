/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresproject;

import java.io.Serializable;

/**
 *
 * @author 18dasgus
 */
public class Medication implements Serializable {

    private String time;
    private String name;
    private String amtDose;
    private boolean reminder;

    public Medication(String a, String n, String t) {
        time = t;
        name = n;
        amtDose = a;
    }

    public String toString() {
        return amtDose + ";" + name + ";" + time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmtDose() {
        return amtDose;
    }

    public void setAmtDose(String amtDose) {
        this.amtDose = amtDose;
    }
    public void setReminder(boolean x){
        this.reminder = x;
    }
    public boolean getReminder(){
        return reminder;
    }

}
