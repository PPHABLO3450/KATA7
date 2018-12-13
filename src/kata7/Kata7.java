/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata7;

import javax.swing.JFrame;

/**
 *
 * @author pablo
 */
public class Kata7 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Kata7().launch();
    }
    
    public Kata7() {
        Watch watch = new Watch();
        WatchDisplay watchDisplay = new WatchDisplay();
        new WatchPresenter(watch, watchDisplay);
        this.setTitle("WatchOfPablo");
        this.setSize(500,524);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(watchDisplay);
    }
    
     private void launch() {
        this.setVisible(true);
    }
    
}
