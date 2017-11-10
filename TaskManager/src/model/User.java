/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author USER
 */
//  проверочка
public class User {
    private final String id;
    private final String login;
    private final String password;
    private TaskLog taskLog;
    
    public User(String i, String l, String p, LinkedList<Record> rec){
        id = i;
        login = l;
        password = p;
        taskLog = new TaskLog(rec);
    }

    public TaskLog getTaskLog(){
        return taskLog;
    }

}
