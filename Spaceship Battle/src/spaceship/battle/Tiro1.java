/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static spaceship.battle.SpaceshipBattle.explode;
import static spaceship.battle.SpaceshipBattle.thr4;

/**
 *
 * @author Aluno Tarde
 */
public class Tiro1 extends javax.swing.JLabel implements Runnable{
    javax.swing.JFrame TelaClasse;
    int Xtiro=0, Ytiro=0;
    boolean tomoudano;
    
// o caminho é SpaceshipBattle.telaclasse.
    
    @Override
    public void run() {while(true){
    
    if (SpaceshipBattle.telaclasse.enabletiro1 == 'A' && SpaceshipBattle.telaclasse.para==false){
    SpaceshipBattle.telaclasse.enabletiro1='B';
    Xtiro=SpaceshipBattle.telaclasse.xa1;
    Ytiro=SpaceshipBattle.telaclasse.ya1;
    
    do {SpaceshipBattle.telaclasse.shoot1.setLocation(Xtiro, Ytiro);
if(Xtiro>SpaceshipBattle.telaclasse.xa2-20 && Xtiro<SpaceshipBattle.telaclasse.xa2+20 && Ytiro>SpaceshipBattle.telaclasse.ya2-10 && Ytiro<SpaceshipBattle.telaclasse.ya2+10){
   tomoudano=true;}
    
            try {
                Thread.sleep(30);
            } 
            catch (InterruptedException ex) {
            }
        Ytiro=Ytiro-12;
    }while(Ytiro>-20);
    
    SpaceshipBattle.telaclasse.shoot1.setLocation(80000, 80000);}
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tiro1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}

