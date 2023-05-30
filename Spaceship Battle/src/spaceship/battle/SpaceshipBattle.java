/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;

import java.io.File;
import java.io.FileInputStream;
import spaceship.battle.SND.Tocarsom;

/**
 *
 * @author Arthur
 */
public class SpaceshipBattle {
    public static TelaClasse telaclasse;
    public static Tiro1 tiro1;
    public static Tiro2 tiro2;
    public static Explode explode;
    public static Explode2 explode2;
    public static Move move;
    public static Move2 move2;
    public static Contavida contavida;
    public static Pontos pontuacao;
    public static Tocarsom tocarsom;
    
    public static String nome;
    
    public static Thread thr1;
    public static Thread thr2;
    public static Thread thr3;
    public static Thread thr4;
    public static Thread thr5;
    public static Thread thr6;
    public static Thread thr7;
    public static Thread thr8;
    public static Thread thr9;
    public static Thread thr10;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        iniciar(nome);
        
        //System.out.println("Chamou a main");
    }
    
    public static void iniciar(String nome) {
        SpaceshipBattle.nome=nome;
        
        //System.out.println("nome no jogo: "+SpaceshipBattle.nome);
        
        // TODO code application logic here
        telaclasse = new TelaClasse();
        thr1 = new Thread(telaclasse);
        
        tiro1 = new Tiro1();
        thr2 = new Thread(tiro1);
        SpaceshipBattle.thr2.start();
        
        tiro2 = new Tiro2();
        thr3 = new Thread(tiro2);
        SpaceshipBattle.thr3.start();
        
        explode = new Explode();
        thr4 = new Thread(explode);
        thr4.start();
        
        move = new Move();
        thr5 = new Thread(move);
        SpaceshipBattle.thr5.start();
        
        move2 = new Move2();
        thr6 = new Thread(move2);
        SpaceshipBattle.thr6.start();
        
        contavida = new Contavida();
        thr7 = new Thread(contavida);
        thr7.start();
        
        pontuacao = new Pontos();
        thr8 = new Thread(pontuacao);
        thr8.start();
        
        explode2 = new Explode2();
        thr9 = new Thread((Runnable) explode2);
        thr9.start();
        
        telaclasse.setVisible(true);
        
        
        tocarsom = new Tocarsom();
        thr10 = new Thread(tocarsom);
        thr10.start();
    }

    

    static String getNome() {
        return nome;
    }

    

    
    
}
