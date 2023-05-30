/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;


import javax.swing.ImageIcon;

/**
 *
 * @author Arthur
 */
public class Explode extends javax.swing.JLabel implements Runnable{
     
    
    @Override
    public void run() {while(true){
        try {
            
            if(SpaceshipBattle.tiro1.tomoudano){
                if(SpaceshipBattle.telaclasse.para==false){
                SpaceshipBattle.move2.left2=false;SpaceshipBattle.move2.right2=false;
                SpaceshipBattle.move2.up2=false;SpaceshipBattle.move2.down2=false;
                SpaceshipBattle.move.left1=false;SpaceshipBattle.move.right1=false;
                SpaceshipBattle.move.up1=false;SpaceshipBattle.move.down1=false;}
                
                SpaceshipBattle.telaclasse.para=true;
                
                SpaceshipBattle.contavida.vidap2=SpaceshipBattle.contavida.vidap2-1;
                
                SpaceshipBattle.pontuacao.D1=SpaceshipBattle.pontuacao.D1+3;
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM1.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM2.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM3.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM4.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM5.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM6.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM7.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM1.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM2.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM3.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM4.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM5.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM6.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("boom/AZUL/BOOM7.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("ICN/Transparent.png")));
                SpaceshipBattle.tiro1.tomoudano=false;
                Thread.sleep(2000);
                SpaceshipBattle.telaclasse.p2button.setIcon(new ImageIcon(getClass().getResource("ICN/vil2.png")));
                Thread.sleep(30);
                SpaceshipBattle.telaclasse.para=false;
            
                SpaceshipBattle.telaclasse.xa1=120;
                SpaceshipBattle.telaclasse.ya1=200;
                SpaceshipBattle.telaclasse.xa2=120;
                SpaceshipBattle.telaclasse.ya2=0;
                SpaceshipBattle.telaclasse.p1button.setLocation(SpaceshipBattle.telaclasse.xa1, SpaceshipBattle.telaclasse.ya1);
                SpaceshipBattle.telaclasse.p2button.setLocation(SpaceshipBattle.telaclasse.xa2, SpaceshipBattle.telaclasse.ya2);}
        
                
                Thread.sleep(20);
                
        
    } 
            catch (InterruptedException ex) {
            }
    }
    
}
}