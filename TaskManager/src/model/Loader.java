/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import org.w3c.dom.Document;

/**
 *
 * @author USER
 */
public class Loader {
    
    //тут устраивай, как тебе удобнее, потом скажешь
    public static void addUser(Document document, User user) {

    }

    public static User readDocument(Document document) {
        return new User(null, null, null, null);
    }

    public static void writeDocument(Document document) {

    }

    public static void clearDocument(Document document) {
        //очистка документа
    }

    
}
