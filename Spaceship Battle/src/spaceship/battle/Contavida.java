/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship.battle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author SummonerArthur
 */
public class Contavida implements Runnable{
    public int vidap2=3,vidap1=3;
    public boolean devosalvar=false, devosalvar2;
    
    @Override
    public void run() {
        while(true){try {
            
        if (vidap2==3){SpaceshipBattle.telaclasse.vida2.setIcon(new ImageIcon(getClass().getResource("CONT/AZUL/cont3.png")));}
            else if (vidap2==2){SpaceshipBattle.telaclasse.vida2.setIcon(new ImageIcon(getClass().getResource("CONT/AZUL/cont2.png")));}
                else if (vidap2==1){SpaceshipBattle.telaclasse.vida2.setIcon(new ImageIcon(getClass().getResource("CONT/AZUL/cont1.png")));}
                    else if (vidap2==0){SpaceshipBattle.telaclasse.para=true;
                    
                    //fica chamando toda hora e somando o valor no banco
                    //PegaPontos();
                    
                    SpaceshipBattle.telaclasse.C1l.setLocation(SpaceshipBattle.telaclasse.C1l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.D1l.setLocation(SpaceshipBattle.telaclasse.D1l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.U1l.setLocation(SpaceshipBattle.telaclasse.U1l.getLocation().x,260);
                    
                    SpaceshipBattle.telaclasse.C2l.setLocation(SpaceshipBattle.telaclasse.C2l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.D2l.setLocation(SpaceshipBattle.telaclasse.D2l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.U2l.setLocation(SpaceshipBattle.telaclasse.U2l.getLocation().x,260);
                    
                    SpaceshipBattle.telaclasse.winlose1.setIcon(new ImageIcon(getClass().getResource("WINLOSE/ganhou rosa.png")));
                    SpaceshipBattle.telaclasse.winlose2.setIcon(new ImageIcon(getClass().getResource("WINLOSE/perdeu azul.png")));
                    
                    SpaceshipBattle.telaclasse.logoIcon.setIcon(new ImageIcon(getClass().getResource("WINLOSE/Enter.png")));
                    
                    SpaceshipBattle.telaclasse.gameOver.setLocation(0, 0);
                    SpaceshipBattle.telaclasse.gameover=true;}
        
        if (vidap1==3){SpaceshipBattle.telaclasse.vida1.setIcon(new ImageIcon(getClass().getResource("CONT/ROSA/cont3.png")));}
            else if (vidap1==2){SpaceshipBattle.telaclasse.vida1.setIcon(new ImageIcon(getClass().getResource("CONT/ROSA/cont2.png")));}
                else if (vidap1==1){SpaceshipBattle.telaclasse.vida1.setIcon(new ImageIcon(getClass().getResource("CONT/ROSA/cont1.png")));}
                    else if (vidap1==0){SpaceshipBattle.telaclasse.para=true;
                    
                    
                    //fica chamando toda hora e somando o valor no banco
                    //PegaPontos();
                    
                    
                    SpaceshipBattle.telaclasse.C1l.setLocation(SpaceshipBattle.telaclasse.C1l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.D1l.setLocation(SpaceshipBattle.telaclasse.D1l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.U1l.setLocation(SpaceshipBattle.telaclasse.U1l.getLocation().x,260);
                    
                    SpaceshipBattle.telaclasse.C2l.setLocation(SpaceshipBattle.telaclasse.C2l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.D2l.setLocation(SpaceshipBattle.telaclasse.D2l.getLocation().x,260);
                    SpaceshipBattle.telaclasse.U2l.setLocation(SpaceshipBattle.telaclasse.U2l.getLocation().x,260);
                    
                    SpaceshipBattle.telaclasse.winlose1.setIcon(new ImageIcon(getClass().getResource("WINLOSE/perdeu rosa.png")));
                    SpaceshipBattle.telaclasse.winlose2.setIcon(new ImageIcon(getClass().getResource("WINLOSE/ganhou azul.png")));
                    
                    SpaceshipBattle.telaclasse.logoIcon.setIcon(new ImageIcon(getClass().getResource("WINLOSE/Enter.png")));
                    
                    SpaceshipBattle.telaclasse.gameOver.setLocation(0, 0);
                    SpaceshipBattle.telaclasse.gameover=true;}
        
        
        
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Contavida.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    }
    
    public static void PegaPontos(){
        int pontos=Integer.parseInt(Pontos.StaticPontos);
         int pontosp2=Integer.parseInt(Pontos.StaticPontosp2);
        inserir(SpaceshipBattle.getNome(),(pontos+pontosp2));
                    
        //System.out.println("Soma do pontos: "+(pontos+pontosp2));
    }
    
    public static void inserir(String Nome, int pontos) {
        //System.out.println("Valor final de pontos: "+ pontos);
        
        
        boolean n=false;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM pontuacao where Usuario_Nome='"+Nome+"' and jogo_id=1";
            
            
            ResultSet rs = st.executeQuery(sql);
            
            n=rs.isBeforeFirst();
            
            if (!n){
                
                try {

                    //System.out.println("inseriu novo");
                    String sql2 = "INSERT INTO pontuacao VALUES ('"+ Nome +"',1,"+ pontos +")";

                    st.executeUpdate(sql2);

                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }else{
                try {

                    //System.out.println("Fez update");
                    String sql3 = "UPDATE pontuacao SET pontos = pontos + '"+ pontos +"' WHERE Usuario_Nome='"+Nome+"' and jogo_id=1";
                    
                    st.executeUpdate(sql3);

                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }   
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
            
        }

    }
    

    
    
}
