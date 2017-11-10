/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import view.SimpleTaskManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class TaskManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
    SimpleTaskManager frame = new SimpleTaskManager();
        
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
