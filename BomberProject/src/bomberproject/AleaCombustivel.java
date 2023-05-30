/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import java.util.Random;

/**
 *
 * @author SummonerArthur
 */
public class AleaCombustivel implements Runnable{

    int qualcomb=0;
    boolean jaGerei=false;
    
    @Override
    public void run() {while(true){try{
//        System.out.println("ｔｅｓｔｅ");
        Thread.sleep(20);
        Random Rand = new Random();
        qualcomb=Rand.nextInt(5);
        
        if(BomberProject.tela.player1.getLocation().x>= BomberProject.tela.combustivel.getLocation().x-16 &&
                BomberProject.tela.player1.getLocation().x<= BomberProject.tela.combustivel.getLocation().x+16 &&
                    BomberProject.tela.player1.getLocation().y>= BomberProject.tela.combustivel.getLocation().y &&
                        BomberProject.tela.player1.getLocation().y<= BomberProject.tela.combustivel.getLocation().y+16){
        jaGerei=false;
        
        
        }
        
        
        
        if(!jaGerei){
            jaGerei=true;
            Thread.sleep(500);
        switch(qualcomb){
            case 0:
                BomberProject.tela.combustivel.setLocation(268-12,446-16); //baixo
                break;
            case 1:
                BomberProject.tela.combustivel.setLocation(268-12,64-16); //cima
                break;
            case 2:
                BomberProject.tela.combustivel.setLocation(268-12,256-16); //meio
                break;
            case 3:
                BomberProject.tela.combustivel.setLocation(446,256-16); //direita
                break;
            case 4:
                BomberProject.tela.combustivel.setLocation(64,256-16); //esquerda
                break;
        }
                    }
    }
        catch (Exception e) {
                System.out.println("deu erro");
            }
       
    }
    
}
}
