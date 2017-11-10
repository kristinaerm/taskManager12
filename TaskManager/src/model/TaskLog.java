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
    }
    
    public LinkedList<Record> getRecords(){
        return records;
    }
    
    public Record getRecord (int n){
        return new Record();
    }
    
    public void addRecord (Record rec){
        
    }
    
    public void deleteRecord (int n){
        
    }  
    
    public void sort (){
        
    }
}
