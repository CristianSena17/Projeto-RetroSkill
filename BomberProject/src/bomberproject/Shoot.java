/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Aluno
 */
public class Shoot implements Runnable{
    
    int sx=-32,sy=-32,addx=0,addy=0;
    
    public static boolean imshooting=false ,saiu=false ,pegalocal=false;

    @Override
    public void run() { if(BomberProject.gameover.para==false){ try{
        sx=Move.xl;sy=Move.yl;
        
        
        {while(true){
            if(TelaJogo.sight=='D'){addy=+10;addx=0;
            TelaJogo.shot.setIcon(new ImageIcon(getClass().getResource("Bullet/baixored.png")));}
            if(TelaJogo.sight=='U'){addy=-10;addx=0;
            TelaJogo.shot.setIcon(new ImageIcon(getClass().getResource("Bullet/cimared.png")));}
            if(TelaJogo.sight=='L'){addx=-10;addy=0;
            TelaJogo.shot.setIcon(new ImageIcon(getClass().getResource("Bullet/esquerdared.png")));}
            if(TelaJogo.sight=='R'){addx=+10;addy=0;
            TelaJogo.shot.setIcon(new ImageIcon(getClass().getResource("Bullet/direitared.png")));}
            sx=Move.xl;sy=Move.yl-24;
            
            
            if (imshooting){do{
            saiu=true;
                
            TelaJogo.shot.setLocation(sx+addx, sy+addy);
            sx=TelaJogo.shot.getLocation().x;
            sy=TelaJogo.shot.getLocation().y;
            Thread.sleep(20);
            
            
            
            
            if(BomberProject.tela.player2.getLocation().x >= TelaJogo.shot.getLocation().x-16
                    && 
               BomberProject.tela.player2.getLocation().x <= TelaJogo.shot.getLocation().x+16     
                    &&
                    BomberProject.tela.player2.getLocation().y >= TelaJogo.shot.getLocation().y-12
                    &&
                    BomberProject.tela.player2.getLocation().y <= TelaJogo.shot.getLocation().y+24){
                
                sx=-32;sy=-32;
                BomberProject.explode2.posso=true;}
            
//            34
            
            
            
            if(sx>76&&sx<118 && sy>64&&sy<100   ||  sx>140&&sx<190 && sy>64&&sy<100   ||  sx>204&&sx<246 && sy>64&&sy<100   ||  sx>278&&sx<318 && sy>64&&sy<100   ||  sx>332&&sx<382 && sy>64&&sy<100   ||  sx>400&&sx<446 && sy>64&&sy<100 ||
               sx>76&&sx<118 && sy>130&&sy<160   ||  sx>140&&sx<190 && sy>130&&sy<160   ||  sx>204&&sx<246 && sy>130&&sy<160   ||  sx>278&&sx<318 && sy>130&&sy<160   ||  sx>332&&sx<382 && sy>130&&sy<160  ||  sx>400&&sx<446 && sy>130&&sy<160 ||
               sx>76&&sx<118 && sy>194&&sy<222   ||  sx>140&&sx<190 && sy>194&&sy<222   ||  sx>204&&sx<246 && sy>194&&sy<222   ||  sx>278&&sx<318 && sy>194&&sy<222   ||  sx>332&&sx<382 && sy>194&&sy<222   ||  sx>400&&sx<446 && sy>192&&sy<222 ||
               sx>76&&sx<118 && sy>256&&sy<286   ||  sx>140&&sx<190 && sy>256&&sy<286   ||  sx>204&&sx<246 && sy>258&&sy<286   ||  sx>278&&sx<318 && sy>258&&sy<286   ||  sx>332&&sx<382 && sy>258&&sy<286   ||  sx>400&&sx<446 && sy>256&&sy<286 ||
               sx>76&&sx<118 && sy>320&&sy<350   ||  sx>140&&sx<190 && sy>320&&sy<350   ||  sx>204&&sx<246 && sy>322&&sy<350   ||  sx>278&&sx<318 && sy>322&&sy<350   ||  sx>332&&sx<382 && sy>322&&sy<350   ||  sx>400&&sx<446 && sy>320&&sy<350 ||
               sx>76&&sx<118 && sy>384&&sy<414   ||  sx>140&&sx<190 && sy>384&&sy<414   ||  sx>204&&sx<246 && sy>390&&sy<414   ||  sx>278&&sx<318 && sy>390&&sy<414   ||  sx>332&&sx<382 && sy>390&&sy<414   ||  sx>400&&sx<446 && sy>384&&sy<414 ||
                    sx>448 || sy>428 || sx<54 || sy<34)
            {saiu=false;}
            }
            while(saiu);}
            imshooting=false;
                TelaJogo.shot.setLocation(-64, -64);
                Thread.sleep(20);}}
    }
catch (InterruptedException ex) {}
    }
}
}