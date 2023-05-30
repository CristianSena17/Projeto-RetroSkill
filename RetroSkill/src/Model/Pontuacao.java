/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Pontuacao {
    private Usuario Nome;
    private int pontos;
    private Jogo id;
    
    public Pontuacao() {
    }

    public Pontuacao(Usuario Nome, Jogo id) {
        this.Nome = Nome;
        this.id = id;
        
        int n = 0;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM pontuacao WHERE Nome = '" + this.Nome + "' and id = "+this.id;
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                this.Nome =new Usuario( rs.getString("Usuario_Nome"));
                this.id =new Jogo(rs.getInt("jogo_id"));
                this.pontos = rs.getInt("pontos");
                n++;
            }
            
            if (n == 0) {
                this.Nome = Nome;
                this.id = id;
                this.pontos = 0;
            }
            
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pontuacao(Usuario Nome, int pontos, Jogo id) {
        this.Nome = Nome;
        this.pontos = pontos;
        this.id = id;
    }

    public Usuario getNome() {
        return Nome;
    }

    public void setNome(Usuario Nome) {
        this.Nome = Nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Jogo getId() {
        return id;
    }

    public void setId(Jogo id) {
        this.id = id;
    }
    
     public static ArrayList<Pontuacao> listarRanking(int idjogo) {
        
        ArrayList<Pontuacao> pontuacoes = new ArrayList();
        Pontuacao pontuacao;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM pontuacao where jogo_id = '"+idjogo+"' order by pontos desc";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                pontuacao = new Pontuacao();
                pontuacao.Nome =new Usuario( rs.getString("Usuario_Nome"));
                //pontuacao.id =new Jogo( rs.getInt("jogo_id"));
                pontuacao.pontos = rs.getInt("pontos");
                pontuacoes.add(pontuacao);
                
            }
            
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return pontuacoes;
    }

    public void inserir() {
              
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "INSERT INTO pontuacao VALUES ('"+ Nome +"',"+ id +","+ pontos +")";
            
            st.executeUpdate(sql);
            
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
  
    }
    
    public void editar() {
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "UPDATE pontuacao SET pontos = '"+ pontos +"' WHERE Usuario_Nome = '"+ Nome +"'and jogo_id = "+id;
            
            st.executeUpdate(sql);
            
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void excluir() {
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "UPDATE pontuacao SET pontos = 0 WHERE Usuario_Nome = '"+ Nome +"'and jogo_id = "+id;
            
            st.executeUpdate(sql);
            
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Pontuacao{" + "Nome=" + Nome + ", pontos=" + pontos + ", id=" + id + '}';
    }
 
    
    

    
    
    
}
