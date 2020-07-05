/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ExercAL12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entrada,media;
        int cc = 0;
        int par = 0;
        int impar = 0;
        int soma = 0;
        int maiorCem = 0;

        
        
        do{
            //total de valores
            cc++;

           entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor(0 interrompe)","Entrada de dados",JOptionPane.WARNING_MESSAGE));
      
           //verifica numeros maiores que cem
           if(entrada > 100){
               maiorCem++;
           }
           
           //soma de todas entradas para fazer media depois
           soma +=  entrada;   
           
           if(entrada == 0){
               cc--;
           }
           
            //pares-impares
           if(entrada == 0){
               continue;
               
           }else if (entrada%2==0){
               par++;
           }else{
               impar++;
           }
           
        }while(entrada > 0);
        
        //verifica media 
        media = soma/cc;
        
        JOptionPane.showMessageDialog(null, "Total de valores: "+cc
                                     +"\nTotal de pares: "+par
                                     +"\nTotal de impares: "+impar
                                     +"\nAcima de 100: "+maiorCem
                                     +"\nMedia dos valores: "+ media,"Encerrado!", JOptionPane.WARNING_MESSAGE);
        
        
    }
       
}
