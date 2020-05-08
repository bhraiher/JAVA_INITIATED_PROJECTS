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
public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    
public Disciplina(){
}

public Disciplina(String nome, int cargaHoraria, Professor professor) {
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    this.professor = professor;
}
    
  
    
public void setNome(String nome){
    this.nome = nome;
}
public String getNome(){
    return nome;
}

public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
}
public int getCargaHoraria(){
    return cargaHoraria;
}

public void setProfessor(Professor professor){
    this.professor = professor;
}
public Professor getProfessor(){
    return professor;
}



    
}