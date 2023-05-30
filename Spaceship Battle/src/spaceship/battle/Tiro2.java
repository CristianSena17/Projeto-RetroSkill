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
public class Tiro2 extends javax.swing.JLabel implements Runnable{
    javax.swing.JFrame TelaClasse;
    int Xtirod=0, Ytirod=0;
    boolean tomoudano;
    
// o caminho é SpaceshipBattle.telaclasse.
    
    @Override
    public void run() {while(true){
    
    if (SpaceshipBattle.telaclasse.enabletiro2 == 'A' && SpaceshipBattle.telaclasse.para==false){
    SpaceshipBattle.telaclasse.enabletiro2='B';
    Xtirod=SpaceshipBattle.telaclasse.xa2;
    Ytirod=SpaceshipBattle.telaclasse.ya2;
    
    do {SpaceshipBattle.telaclasse.shoot2.setLocation(Xtirod, Ytirod);
if(Xtirod>SpaceshipBattle.telaclasse.xa1-20 && Xtirod<SpaceshipBattle.telaclasse.xa1+20 && Ytirod>SpaceshipBattle.telaclasse.ya1-10 && Ytirod<SpaceshipBattle.telaclasse.ya1+10){
   tomoudano=true;}
    
            try {
                Thread.sleep(30);
            } 
            catch (InterruptedException ex) {
            }
        Ytirod=Ytirod+12;
    }
            while(Ytirod<220);
    
    SpaceshipBattle.telaclasse.shoot2.setLocation(80000, 80000);}
    
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tiro2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        } 
    }
}

