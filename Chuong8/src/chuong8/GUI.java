/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class GUI extends JFrame {
    public int cao = 600;
    public int rong = 600;
    
    public GUI(String title){
        initGUI(title);
        addEvents();
    }
    private void initGUI(String title){
        setTitle(title);
        setSize(rong, cao);
//        setResizable(false);
    }
    private void addEvents() {
        WindowListener wL = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                System.out.println("Da dong frame");
            }
            
        };
        addWindowListener(wL);
    }
    
}
