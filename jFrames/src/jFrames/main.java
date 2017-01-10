package jFrames;

import javax.swing.JFrame;
 
public class main {
  public static void main(String[] args){

    Fenetre fenetre = new Fenetre();

    fenetre.setTitle("Ma première fenêtre Java");

    fenetre.setSize(400, 100);

    fenetre.setLocationRelativeTo(null);

    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    fenetre.setVisible(true);
  }       
}