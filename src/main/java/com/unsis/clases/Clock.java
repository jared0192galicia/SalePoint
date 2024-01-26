/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsis.clases;

import javax.swing.JLabel;

/**
 *
 * @author labtecweb10
 */
public class Clock extends Thread {
    
    private final JLabel timer;

    public Clock(JLabel timer) {
        this.timer = timer;
    }
    
    @Override
    public void run () {
        int seg = 60;
        while (seg != -1) {            
            System.out.println(seg);
            try {
                timer.setText("El código será valido durante " + seg + " Seg");
                seg--;
                Clock.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        timer.setText("Código expirado");
        
        Tools.updateCode();
    }
}
