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
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno Tarde
 */
public class Usuario {
    private String Nome;
    private String Senha;
    private String Email;
    private boolean Ativo;
    private String PSeguranca;
    private String RSeguranca;

    public Usuario() {
    }

    public Usuario(String Nome) {
        
    this.Nome = Nome;

     int n = 0;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario WHERE Nome = '" + this.Nome + "'";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                this.Nome = rs.getString("Nome");
                this.Senha = rs.getString("Senha");
                this.Email = rs.getString("Email");
                this.Ativo = rs.getBoolean("Ativo");
                this.PSeguranca = rs.getString("PSeguranca");
                this.RSeguranca = rs.getString("RSeguranca");
                n++;
            }
            
            if (n == 0) {
                this.Nome = Nome;
                this.Senha = "";
                this.Email = "";
                this.Ativo = false;
                this.PSeguranca = "";
                this.RSeguranca = "";
            }
            
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    public Usuario(String Nome, String Senha, String Email, boolean Ativo, String PSeguranca, String RSeguranca) {
        this.Nome = Nome;
        this.Senha = Senha;
        this.Email = Email;
        this.Ativo = Ativo;
        this.PSeguranca = PSeguranca;
        this.RSeguranca = RSeguranca;
    }

    public String getPSeguranca() {
        return PSeguranca;
    }

    public void setPSeguranca(String PSeguranca) {
        this.PSeguranca = PSeguranca;
    }

    public String getRSeguranca() {
        return RSeguranca;
    }

    public void setRSeguranca(String RSeguranca) {
        this.RSeguranca = RSeguranca;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

 
    public static ArrayList<Usuario> listar() {
        
        ArrayList<Usuario> usuarios = new ArrayList();
        Usuario usuario;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario where Ativo = 1";
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                usuario = new Usuario();
                usuario.Nome = rs.getString("Nome");
                usuario.Senha = rs.getString("Senha");
                usuario.Email = rs.getString("Email");
                usuario.Ativo = rs.getBoolean("Ativo");
                usuario.PSeguranca = rs.getString("PSeguranca");
                usuario.RSeguranca = rs.getString("RSeguranca");
                usuarios.add(usuario);
                
            }
            
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return usuarios;
    }
    
    public static boolean logar(Usuario usuario) {
        
        int n=0;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario where Nome='"+usuario.Nome+"' and "+"Senha=PASSWORD('"+usuario.Senha+"') and Ativo =1";
            
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                n++;  
            }
            
            if(n==0){
                return false;
            }
            
            rs.close();
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    
    public static boolean Cadastrar(Usuario usuario) {
        
        boolean n=false;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario where Nome='"+usuario.Nome+"'";
            
            
            ResultSet rs = st.executeQuery(sql);
            
            n=rs.isBeforeFirst();
            
            if (!n){
                    try {


                    String sql2 = "INSERT INTO Usuario VALUES ('"+ usuario.Nome +"', PASSWORD('"+ usuario.Senha +"') ,'"+ usuario.Email +"',1,'"+ usuario.PSeguranca +"', PASSWORD('"+ usuario.RSeguranca +"'))";
                    st.executeUpdate(sql2);
                    return true;
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
            return false;
        }
        
        return false;
    }
    
    public void inserir(Usuario usuario) {
              
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "INSERT INTO Usuario VALUES ('"+ Nome +"', PASSWORD('"+ Senha +"') ,'"+ Email +"',1,'"+ usuario.PSeguranca +"', PASSWORD('"+ usuario.RSeguranca +"'))";
            
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
            
            String sql = "UPDATE Usuario SET Senha = PASSWORD('"+ Senha +"') , Email = '"+ Email +"', Ativo = 1, PSeguranca = '"+PSeguranca+"', RSeguranca = PASSWORD('"+ RSeguranca +"') WHERE Nome = '"+ Nome +"'";
            
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
            
            String sql = "UPDATE Usuario SET Ativo = 0 WHERE Nome = '"+ Nome +"'";
            
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
        return Nome;
    }

    
    public static boolean RecuperarSenha(Usuario usuario){
        boolean n=false;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario where Nome = '"+usuario.Nome+"' and RSeguranca = PASSWORD('"+ usuario.RSeguranca +"')";
            
            
            ResultSet rs = st.executeQuery(sql);
            
            n=rs.isBeforeFirst();
            
            if (!n){
                    try {
                        
                        //System.out.println("A resposta esta errada");
                        
                    return false;
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
            return false;
        }
        
        //System.out.println("A resposta esta correta");
        
        return true;
        
        
        
    }
   
    public static boolean VerificarUsuarioRec(String Nome){
         boolean n=false;
        
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "SELECT * FROM Usuario where Nome='"+Nome+"'";
            
            
            ResultSet rs = st.executeQuery(sql);
            
            n=rs.isBeforeFirst();
            
            if (!n){
                    try {
                        
                        //System.out.println("O usuario nao existe");
                    return false;
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
            return false;
        }
        
        //System.out.println("O usuario  existe");
        return true;
        
        
        
    }
    
    public boolean validar(String email){
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    
    public static void RedefinirSenha(Usuario usuario){
        try {
            Connection conexao = Conexao.getConexao();
            Statement st = conexao.createStatement();
            
            String sql = "UPDATE Usuario SET Senha = PASSWORD('"+ usuario.Senha +"') WHERE Nome = '"+ usuario.Nome +"'";
            
            st.executeUpdate(sql);
            
            st.close();
            Conexao.closeAll(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
