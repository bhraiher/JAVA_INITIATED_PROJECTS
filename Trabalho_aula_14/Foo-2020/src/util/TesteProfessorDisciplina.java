/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import modelo.Disciplina;
import modelo.Professor;

/**
 *
 * @author bruno
 */
public class TesteProfessorDisciplina {

    public static void main(String[] args) {
        Disciplina d = new Disciplina();
        d.setNome("Matemática");
        d.setCargaHoraria(80);
        
        Professor p = new Professor();
        p.setNome("João da Silva"); 
        p.setHorasSemanais("20 HORAS");
        p.setPrecoHora(1000.00);
        p.setTitulacao("Mestre");
        
        d.setProfessor(p);
        
        System.out.println("Nome da disciplina: "+d.getNome());
        System.out.println("Carga horária da disciplina: "+d.getCargaHoraria());
        System.out.println("    Nome do professor: "+d.getProfessor().getNome());
        System.out.println("    Horas semanais contratual: "+d.getProfessor().getHorasSemanais());
        System.out.println("    Titulação: "+d.getProfessor().getTitulacao());
    }
    
}
