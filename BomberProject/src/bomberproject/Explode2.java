/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import javax.swing.ImageIcon;

/**
 *
 * @author SummonerArthur
 */
public class Explode2 implements Runnable{
boolean posso=false;
int x=1;

int vidap2=0, pontosp1=0;
boolean gameover=false;
    
    @Override
    public void run() {while(true){try{
    if (posso){vidap2=vidap2+1;
        if(vidap2>5){
            gameover=true;}
    while (x<10){
        BomberProject.tela.explosion2.setLocation(BomberProject.tela.player2.getLocation().x-36, BomberProject.tela.player2.getLocation().y-36);
        Thread.sleep(20);
        BomberProject.tela.explosion2.setIcon(new ImageIcon(getClass().getResource("BOOM/image_part_00"+x+".png")));
        x++;
    }
    while (x<81){
        BomberProject.tela.explosion2.setLocation(BomberProject.tela.player2.getLocation().x-36, BomberProject.tela.player2.getLocation().y-36);
        Thread.sleep(20);
        BomberProject.tela.explosion2.setIcon(new ImageIcon(getClass().getResource("BOOM/image_part_0"+x+".png")));
        x++;
    }
    if (x>=81){x=1;
    posso=false;
    
    pontosp1=pontosp1+30;
    BomberProject.explode1.pontosp2=BomberProject.explode1.pontosp2-10;
    if(BomberProject.explode1.pontosp2<0){
    BomberProject.explode1.pontosp2=0;
    }
    
    switch (vidap2) {
    case 0:
    BomberProject.tela.vidaEscuro2.setSize(0, 32);
    break;
    case 1:
    BomberProject.tela.vidaEscuro2.setSize(133, 32);
    break;
    case 2:
    BomberProject.tela.vidaEscuro2.setSize(218, 32);
    break;
    case 3:
    BomberProject.tela.vidaEscuro2.setSize(303, 32);
    break;
    case 4:
    BomberProject.tela.vidaEscuro2.setSize(388, 32);
    break;
    case 5:
    BomberProject.tela.vidaEscuro2.setSize(473, 32);
    gameover=true;
    break;

    default:
    vidap2=0;
}
    }
    
    }Thread.sleep(20);
     
    }
    catch (Exception e) {
                System.out.println("deu erro");}
    }
    
}}
