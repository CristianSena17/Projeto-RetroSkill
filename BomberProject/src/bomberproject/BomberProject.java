/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;

/**
 *
 * @author Aluno
 */
public class BomberProject {
    public static Move move;
    public static Move2 move2;
    public static TelaJogo tela;

    public static Shoot shoot;
    public static Shoot2 shoot2;
    public static SetaLugar seta;
    public static Explode1 explode1;
    public static Explode2 explode2;
    public static AleaCombustivel aleacombustivel;
    
    public static GameOver gameover;
    public static Musica musica;
    
    public static Thread thr1;
    public static Thread thr2;
    public static Thread thr3;
    public static Thread thr4;
    public static Thread thr5;
    public static Thread thr6;
    
    public static Thread combust;
    public static Thread som;
    
    public static Thread thrExpl1;
    public static Thread thrExpl2;
    
    public static String nome;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciar(nome);
        
//        aleacombustivel = new AleaCombustivel();
//        combust = new Thread(aleacombustivel);
//        combust.start();
//        
    }
    
    public static void iniciar(String nome){
        BomberProject.nome=nome;
        
        //System.out.println("Nome inicial: "+BomberProject.nome);
        
        tela = new TelaJogo();
        tela.setVisible(true);
        
        move = new Move();
        thr1 = new Thread(move);
        thr1.start();
        
        move2 = new Move2();
        thr2 = new Thread(move2);
        thr2.start();
        
        shoot = new Shoot();
        thr3 = new Thread(shoot);
        thr3.start();
        
        shoot2 = new Shoot2();
        thr4 = new Thread(shoot2);
        thr4.start();
        
        explode1 = new Explode1();
        thrExpl1 = new Thread(explode1);
        thrExpl1.start();
        
        explode2 = new Explode2();
        thrExpl2 = new Thread(explode2);
        thrExpl2.start();
        
        seta = new SetaLugar();
        thr5 = new Thread(seta);
        thr5.start();
        
        musica = new Musica();
        som = new Thread(musica);
        som.start();
        
        gameover = new GameOver();
        thr6 = new Thread(gameover);
        thr6.start();
    }
    
    static String getNome() {
        return nome;
    }
}
