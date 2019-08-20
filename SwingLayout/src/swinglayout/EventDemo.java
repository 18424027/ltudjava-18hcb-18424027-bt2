/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinglayout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author E7470
 */
public class EventDemo extends JFrame implements ActionListener {
    JButton okButton, exitButton, cancelButton;
    
    public EventDemo(){
        createAndShow();
    }
    
    public void createAndShow(){
        okButton = new JButton("OK");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(okButton);
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
//        
        this.add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        
        this.add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        
        this.setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public static void main(String[] args){
        new EventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane, "Ban vua nhan nut OK.");
        if("exit".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane, "Ban vua nhan nut Exit");
        if("cancel".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(rootPane, "Ban vua nhan nut Cancel");
        }
    }
}
