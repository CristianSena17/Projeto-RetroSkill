/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author SummonerArthur
 */
public class Pontos implements Runnable{

    public static String StaticPontos, StaticPontosp2;
    
    public String pontos, pontosp2;
    int DM1,UM1,C1,D1,U1,PP1=0;
    int DM2,UM2,C2,D2,U2,PP2=0;
    
    
    
    
    @Override
    public void run() {
        while(true){try {
        
            
                if(SpaceshipBattle.telaclasse.shoot1.getLocation().x<SpaceshipBattle.telaclasse.xa2-20 && 
                SpaceshipBattle.telaclasse.shoot1.getLocation().x>SpaceshipBattle.telaclasse.xa2-32 && 
                SpaceshipBattle.telaclasse.shoot1.getLocation().y<SpaceshipBattle.telaclasse.ya2+5 &&
                SpaceshipBattle.telaclasse.shoot1.getLocation().y>SpaceshipBattle.telaclasse.ya2-5){
        SpaceshipBattle.pontuacao.U1=SpaceshipBattle.pontuacao.U1+5;
        }
    
        if(SpaceshipBattle.telaclasse.shoot1.getLocation().x<SpaceshipBattle.telaclasse.xa2+40 && 
                SpaceshipBattle.telaclasse.shoot1.getLocation().x>SpaceshipBattle.telaclasse.xa2+20 && 
                SpaceshipBattle.telaclasse.shoot1.getLocation().y<SpaceshipBattle.telaclasse.ya2+5 &&
                SpaceshipBattle.telaclasse.shoot1.getLocation().y>SpaceshipBattle.telaclasse.ya2-5){
        SpaceshipBattle.pontuacao.U1=SpaceshipBattle.pontuacao.U1+5;
        }
        
        
        
        if(SpaceshipBattle.telaclasse.shoot2.getLocation().x<SpaceshipBattle.telaclasse.xa1-20 && 
                SpaceshipBattle.telaclasse.shoot2.getLocation().x>SpaceshipBattle.telaclasse.xa1-32 && 
                SpaceshipBattle.telaclasse.shoot2.getLocation().y<SpaceshipBattle.telaclasse.ya1+5 &&
                SpaceshipBattle.telaclasse.shoot2.getLocation().y>SpaceshipBattle.telaclasse.ya1-5){
        SpaceshipBattle.pontuacao.U2=SpaceshipBattle.pontuacao.U2+5;
        }
    
        if(SpaceshipBattle.telaclasse.shoot2.getLocation().x<SpaceshipBattle.telaclasse.xa1+40 && 
                SpaceshipBattle.telaclasse.shoot2.getLocation().x>SpaceshipBattle.telaclasse.xa1+20 && 
                SpaceshipBattle.telaclasse.shoot2.getLocation().y<SpaceshipBattle.telaclasse.ya1+5 &&
                SpaceshipBattle.telaclasse.shoot2.getLocation().y>SpaceshipBattle.telaclasse.ya1-5){
        SpaceshipBattle.pontuacao.U2=SpaceshipBattle.pontuacao.U2+5;
        }
        
        
                
                if(U1>9){
                U1=U1-10;
                D1=D1+1;}
                if(D1>9){
                D1=D1-10;
                C1=C1+1;}
                if(C1>9){
                C1=C1-10;
                UM1=UM1+1;}
                
                
                
                if(U2>9){
                U2=U2-10;
                D2=D2+1;}
                if(D2>9){
                D2=D2-10;
                C2=C2+1;}
                if(C2>9){
                C2=C2-10;
                UM2=UM2+1;}
                
                SpaceshipBattle.telaclasse.C1l.setIcon(new ImageIcon(getClass().getResource("NMB/ROSA/"+C1+".png")));
                SpaceshipBattle.telaclasse.D1l.setIcon(new ImageIcon(getClass().getResource("NMB/ROSA/"+D1+".png")));
                SpaceshipBattle.telaclasse.U1l.setIcon(new ImageIcon(getClass().getResource("NMB/ROSA/"+U1+".png")));
                pontos=(UM1+C1+""+D1+U1);
                
                StaticPontos=(UM1+C1+""+D1+U1);
                
                SpaceshipBattle.telaclasse.C2l.setIcon(new ImageIcon(getClass().getResource("NMB/AZUL/"+C2+".png")));
                SpaceshipBattle.telaclasse.D2l.setIcon(new ImageIcon(getClass().getResource("NMB/AZUL/"+D2+".png")));
                SpaceshipBattle.telaclasse.U2l.setIcon(new ImageIcon(getClass().getResource("NMB/AZUL/"+U2+".png")));
                pontosp2=(UM2+C2+""+D2+U2);
                
                StaticPontosp2=(UM2+C2+""+D2+U2);
                
                Thread.sleep(20);
//                System.out.println(SpaceshipBattle.telaclasse.shoot1.getLocation().x);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pontos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
