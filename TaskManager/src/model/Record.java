/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Record {
    private String name;
    private String description;
    private Date time;
    private SimpleDateFormat dateTimeFormatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm"); 
    private String contacts;
    
    public Record(){
        name = "";
        description = "";
        contacts = "";
        time = new Date();
    }
    
    public Record (String n, String d, String t, String c ){
        name = n;
        description = d;
        contacts = c;
        try {
            time = dateTimeFormatter.parse(t);
        } catch (ParseException e) {
            time = new Date();
        }
    }
    
    public void setTime(String s){
        try {
            time = dateTimeFormatter.parse(s);
        } catch (ParseException e) {
            time = new Date();
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setContscts(String c) {
        contacts = c;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getContacts(){
        return contacts;
    }
    
    public Date getTime(){
        return time;
    }
    
    public String getTimeString(){
        return dateTimeFormatter.format(time);
    }
    
}
