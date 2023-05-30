/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;

/**
 *
 * @author CLP
 */
public class Move extends javax.swing.JLabel implements Runnable{
    boolean left1=false,right1=false,up1=false,down1=false;

    @Override
    public void run() {
        {while(true) {System.out.print(""); try {
         if(SpaceshipBattle.telaclasse.pause=='N'){
                if(left1&&!right1){
                SpaceshipBattle.telaclasse.xa1=SpaceshipBattle.telaclasse.xa1-6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p1button.setLocation(SpaceshipBattle.telaclasse.xa1, SpaceshipBattle.telaclasse.ya1);
            Thread.sleep(35);    
                }
                if(right1){
                SpaceshipBattle.telaclasse.xa1=SpaceshipBattle.telaclasse.xa1+6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p1button.setLocation(SpaceshipBattle.telaclasse.xa1, SpaceshipBattle.telaclasse.ya1);
            Thread.sleep(35);    
                }
                if(up1&&!down1){
                SpaceshipBattle.telaclasse.ya1=SpaceshipBattle.telaclasse.ya1-6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p1button.setLocation(SpaceshipBattle.telaclasse.xa1, SpaceshipBattle.telaclasse.ya1);
            Thread.sleep(35);    
                }
                if(down1){
                SpaceshipBattle.telaclasse.ya1=SpaceshipBattle.telaclasse.ya1+6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p1button.setLocation(SpaceshipBattle.telaclasse.xa1, SpaceshipBattle.telaclasse.ya1);
            Thread.sleep(35);    
                }
                
            }
    }
            catch (Exception e) {
                System.out.println("deuruim");
            }
        }
        }
    }
}
