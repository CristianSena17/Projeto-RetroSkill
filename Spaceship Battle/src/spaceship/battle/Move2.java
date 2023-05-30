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
public class Move2 extends javax.swing.JLabel implements Runnable{
    boolean left2=false,right2=false,up2=false,down2=false;

    @Override
    public void run() {
        {while(true) {System.out.print(""); try {
         if(SpaceshipBattle.telaclasse.pause=='N'){
                
                 if(left2&&!right2){
                SpaceshipBattle.telaclasse.xa2=SpaceshipBattle.telaclasse.xa2-6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p2button.setLocation(SpaceshipBattle.telaclasse.xa2, SpaceshipBattle.telaclasse.ya2);
            Thread.sleep(35);    
                }
                if(right2){
                SpaceshipBattle.telaclasse.xa2=SpaceshipBattle.telaclasse.xa2+6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p2button.setLocation(SpaceshipBattle.telaclasse.xa2, SpaceshipBattle.telaclasse.ya2);
            Thread.sleep(35);    
                }
                if(up2&&!down2){
                SpaceshipBattle.telaclasse.ya2=SpaceshipBattle.telaclasse.ya2-6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p2button.setLocation(SpaceshipBattle.telaclasse.xa2, SpaceshipBattle.telaclasse.ya2);
            Thread.sleep(35);    
                }
                if(down2){
                SpaceshipBattle.telaclasse.ya2=SpaceshipBattle.telaclasse.ya2+6;
            SpaceshipBattle.telaclasse.checaLugar();
            SpaceshipBattle.telaclasse.p2button.setLocation(SpaceshipBattle.telaclasse.xa2, SpaceshipBattle.telaclasse.ya2);
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
