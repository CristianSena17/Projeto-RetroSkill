
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

import javax.swing.ImageIcon;

/**
 *
 * @author Aluno
 */
public class Move2 implements Runnable{

    
    
    public static int xl=448,yl=448;
    
    public static int compx=448,compy=448;
    
    public static int paco=4;
    boolean left=false, right=false, up=false, down=false;
    
    

    @Override
    public void run() {
        {while(true) {System.out.print(""); if(BomberProject.gameover.para==false){  try {
        if(left&&!right){
             xl=xl-paco;
             BomberProject.tela.TP2.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/left 1.png")));
             BomberProject.tela.sight2='L';
                compara();
                    if(xl<64){
                        xl=64;}
            
            Thread.sleep(20);} 
                
                if(right){
                    xl=xl+paco;
                    BomberProject.tela.TP2.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/right 1.png")));
                    BomberProject.tela.sight2='R';
                    compara();
                        if(xl>448){
                            xl=448;}
                Thread.sleep(20);   
                }
                
                
        if(up&&!down){
             yl=yl-paco; 
             BomberProject.tela.TP2.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/up 1.png")));
             BomberProject.tela.sight2='U';
            compara();
                if(yl<64){
                    yl=64;}
            Thread.sleep(20);}  
                
                if(down){
                    yl=yl+paco;
                    BomberProject.tela.TP2.setIcon(new ImageIcon(getClass().getResource("tank/TANKBLUE/down 1.png")));
                    BomberProject.tela.sight2='D';
                    compara();
                        if(yl>448){
                            yl=448;}
                Thread.sleep(20);   
                }
            
    }
            catch (Exception e) {
                System.out.println("deu erro");
            }
        }
        }}
    } 
    public void compara(){ /*as linhas são contadas de cima para baixo*/
            if( /*linha 1*/ xl>66&&xl<126 && yl>66&&yl<126   ||  xl>130&&xl<190 && yl>66&&yl<126   ||  xl>194&&xl<254 && yl>66&&yl<126   ||  xl>258&&xl<318 && yl>66&&yl<126   ||  xl>322&&xl<382 && yl>66&&yl<126   ||  xl>390&&xl<446 && yl>66&&yl<126 ||
                    /*linha 2*/ xl>66&&xl<126 && yl>130&&yl<190   ||  xl>130&&xl<190 && yl>130&&yl<190   ||  xl>194&&xl<254 && yl>130&&yl<190   ||  xl>258&&xl<318 && yl>130&&yl<190   ||  xl>322&&xl<382 && yl>130&&yl<190   ||  xl>390&&xl<446 && yl>130&&yl<190 ||
                        /*linha 3*/ xl>66&&xl<126 && yl>194&&yl<254   ||  xl>130&&xl<190 && yl>194&&yl<254   ||  xl>194&&xl<254 && yl>194&&yl<254   ||  xl>258&&xl<318 && yl>194&&yl<254   ||  xl>322&&xl<382 && yl>194&&yl<254   ||  xl>390&&xl<446 && yl>194&&yl<254 ||
                            /*linha 4*/ xl>66&&xl<126 && yl>258&&yl<318   ||  xl>130&&xl<190 && yl>258&&yl<318   ||  xl>194&&xl<254 && yl>258&&yl<318   ||  xl>258&&xl<318 && yl>258&&yl<318   ||  xl>322&&xl<382 && yl>258&&yl<318   ||  xl>390&&xl<446 && yl>258&&yl<318 ||
                                /*linha 5*/ xl>66&&xl<126 && yl>322&&yl<382   ||  xl>130&&xl<190 && yl>322&&yl<382   ||  xl>194&&xl<254 && yl>322&&yl<382   ||  xl>258&&xl<318 && yl>322&&yl<382   ||  xl>322&&xl<382 && yl>322&&yl<382   ||  xl>390&&xl<446 && yl>322&&yl<382 ||
                                    /*linha 6*/ xl>66&&xl<126 && yl>390&&yl<446   ||  xl>130&&xl<190 && yl>390&&yl<446   ||  xl>194&&xl<254 && yl>390&&yl<446   ||  xl>258&&xl<318 && yl>390&&yl<446   ||  xl>322&&xl<382 && yl>390&&yl<446   ||  xl>390&&xl<446 && yl>390&&yl<446){
            xl=compx;
            yl=compy;}
            else{
            compx=xl;
        compy=yl;
        
        
            
        }
    }
    
    
    
}
