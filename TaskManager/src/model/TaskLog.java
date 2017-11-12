/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.SimpleTaskManager;
import java.util.LinkedList;
import org.w3c.dom.Document;

/**
 *
 * @author USER
 */
public class TaskLog {
    
    private LinkedList<Record> records;
    private String id;
    
    
    
    public TaskLog (LinkedList<Record> rec){
        //сформировать айдишник
        records = rec;
        sort();
    }
    
    public LinkedList<Record> getRecords(){
        return records;
    }
    
    public void changeRecord (int n, String na, String ti, String des, String con){
        Record rec = records.get(n);
        if ((!na.equals(""))) {
            rec.setName(na);
        }
        if ((!ti.equals(""))) {
            rec.setTime(ti);
            sort();
        }
        if ((!des.equals(""))) {
            rec.setDescription(des);
        }
        if ((!con.equals(""))) {
            rec.setContacts(con);
        }
    }
    
    public Record getRecord (int n){
        Record rec = records.get(n);
        return new Record(rec.getName(),rec.getDescription(), rec.getTimeString(), rec.getContacts());
    }
    
    public void addRecord (Record rec){
        records.add(rec);
        sort();
    }
    
    public void deleteRecord (int n){
        records.remove(n);
    }  
    
    public void sort (){
        Record temp = null;
        for (int j = 0; j < records.size(); j++) {
            for (int k = 0; k < records.size() - 1; k++) {
                if (records.get(k).compareTo(records.get(k+1))==1) {
                    temp = records.get(k);
                    records.set(k, records.get(k+1));
                    records.set(k+1, temp);
                }
            }
        }
    }
}
