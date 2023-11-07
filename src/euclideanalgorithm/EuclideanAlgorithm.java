/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package euclideanalgorithm;

import javax.swing.JFrame;

/**
 *
 * @author lamashuhail
 */
public class EuclideanAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        layout gcdLayout = new layout();

        // Create a JFrame to hold the layout panel
        JFrame frame = new JFrame("GCD Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gcdLayout);
        frame.pack();
        frame.setVisible(true);        
    }
    
}
