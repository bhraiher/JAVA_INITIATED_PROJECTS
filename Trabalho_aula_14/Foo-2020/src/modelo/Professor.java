/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bruno
 */
public class Professor {
    private String nome;
    private String nRegistro;
    private String titulacao;
    private String horasSemanais;
    private double precoHora;
    
    public Professor(){  
    }
    
    /*public Professor(String nome, String nRegistro, String titulacao, String horasSemanais, double precoHora){
        this.nome = nome;
        this.nRegistro = nRegistro;
        this.titulacao = titulacao;
        this.horasSemanais = horasSemanais;
        this.precoHora = precoHora;        
    }*/
    
    //METODOS nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //METODOS nRegistro
    public void setNRegistro(String nRegistro){
        this.nRegistro = nRegistro;
    }
    public String getNRegistr(){
        return nRegistro;
    }
    
    //METODOS titulacao;
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    public String getTitulacao(){
        return titulacao;
    }
    
    //METODOS horasSemanais;
    public void setHorasSemanais(String horasSemanais){
        this.horasSemanais = horasSemanais;
    }
    public String getHorasSemanais(){
        return horasSemanais;
    }
    
    //METODOS precoHora;
    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }
    public double getPrecoHora(){
        return precoHora;
    }

    
    
}
