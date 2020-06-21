/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author 310212371
 */
public class DrawEvent extends ApplicationEvent{

    public DrawEvent(Object source) {
       super(source);
    }

    @Override
    public String toString() {
        return "Draw event is called"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
