
package foo.pkg2020;

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
        System.out.println("    Nome do professor: "+d.getNameProfessor());
        System.out.println("    Horas semanais contratual: "+d.getProfessor().horasSemanais);
        System.out.println("    Titulação: "+d.getProfessor().titulacao);
    }
    
}
