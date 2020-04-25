package foo.pkg2020;


public class Disciplina {
    String nome;
    int cargaHoraria;
    Professor professor;
    
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


public String getNameProfessor(){
    return professor.nome;
}
    
}
