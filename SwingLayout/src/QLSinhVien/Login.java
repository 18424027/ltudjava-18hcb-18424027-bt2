/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSinhVien;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hieu
 */
public class Login implements ActionListener {
    public static boolean RIGHT_TO_LEFT = false;
    JButton btnLogin;
    
    public void addComponentToPane(Container pane) {
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }

        JPanel panels = new JPanel();
        panels.setOpaque(false);
        pane.add(panels, BorderLayout.PAGE_START);
        
        

        //Make the center component big, since that's the
        //typical usage of BorderLayout.
//        button = new JButton("Button 2 (CENTER)");
//        button.setPreferredSize(new Dimension(200, 100));
//        pane.add(button, BorderLayout.CENTER);
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.PAGE_AXIS));
        addComponentsToPane(panelCenter);
        pane.add(panelCenter);

//        button = new JButton("Button 3 (LINE_START)");
//        pane.add(button, BorderLayout.LINE_START);

        JButton button = new JButton("Login");
        button.setActionCommand("Login");
        button.addActionListener(this);
        pane.add(button, BorderLayout.PAGE_END);

//        button = new JButton("5 (LINE_END)");
//        pane.add(button, BorderLayout.LINE_END);
        
    }
    
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        addPanelImput("username",pane);
        addPanelImput("password",pane);
    }
    
    public static void addComponentInput(String textLabel ,Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                ComponentOrientation.RIGHT_TO_LEFT);
        }
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JLabel(textLabel));
        JTextField txtUser = new JTextField("");
        txtUser.setPreferredSize(new Dimension(200, 20));
        contentPane.add(txtUser);
    }
    private static void addPanelImput(String text,Container container){
        JPanel panel = new JPanel();
        addComponentInput(text,panel);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(panel);
    }
    
    private void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("BoxLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        new Login();
    }
    
    public Login(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Login"))
            JOptionPane.showMessageDialog(btnLogin, "Login");
    }
}
