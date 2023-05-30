/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import javax.swing.ImageIcon;

/**
 *
 * @author CLP
 */
public class GameOver implements Runnable{
    public static boolean para=false;             

    @Override
    public void run() {while(true){try {
    Thread.sleep(20); 
        if(BomberProject.explode2.gameover||BomberProject.explode1.gameover){
            para=true;
            BomberProject.tela.gameOver.setLocation(0, 0);
            
            if(BomberProject.explode1.gameover){
            BomberProject.tela.TP1.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/transparent.png")));
            BomberProject.move2.xl=268; BomberProject.move2.yl=446;
            BomberProject.move2.compx=268; BomberProject.move2.compy=446;
            }
            
            if(BomberProject.explode2.gameover){
            BomberProject.tela.TP2.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/transparent.png")));
            BomberProject.move.xl=268; BomberProject.move.yl=446;
            BomberProject.move.compx=268; BomberProject.move.compy=446;
            }
            
            if(BomberProject.explode2.gameover && BomberProject.explode1.gameover){
            BomberProject.tela.empate.setLocation(172,454);
            }
            
            Thread.sleep(20); 
        }
    
        }
        
    catch (Exception e) {
                System.out.println("deu erro");
            }
        }
    }
}
