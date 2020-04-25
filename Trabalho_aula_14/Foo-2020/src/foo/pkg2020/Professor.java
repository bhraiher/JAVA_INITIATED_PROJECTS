
package foo.pkg2020;


public class Professor {
    String nome;
    String nRegistro;
    String titulacao;
    String horasSemanais;
    double precoHora;
    
    public Professor(){
        
    }
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
