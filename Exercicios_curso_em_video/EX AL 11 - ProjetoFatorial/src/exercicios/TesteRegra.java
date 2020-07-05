/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author bruno
 */
public class TesteRegra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,aux,tot;
        n = 5;
        tot = n;
        aux=1;
        while (n>=1){                
             aux *= n;
             n--;
          
        }
       
        System.out.println("Total: "+aux);
        
    }
    
}
