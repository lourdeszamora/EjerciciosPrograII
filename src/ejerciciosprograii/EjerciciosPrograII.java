/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprograii;

import java.util.Scanner;

/**
 *
 * @author Lourdes Zamora
 */
public class EjerciciosPrograII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resp;
        
        do{
            int flag=1;
            Scanner sc = new Scanner(System.in);
            int longitud= sc.nextInt();
            char[] arreglo= new char[longitud];

            for(int i=0;i<arreglo.length;i++){
            arreglo[i]=sc.next().charAt(0);
            }
            int ultimo=arreglo.length-1;
            for(int i=0;i<arreglo.length;i++){

                if(arreglo[i]!=arreglo[ultimo]){
                    System.out.println("No es Palindromo");
                    flag=0;
                    break;
                }
                ultimo--;
            }
            
            if(flag==1){
              System.out.println("Es un Palindromo");
            }
            
            System.out.print("Desea repetir todo el proceso?");
            resp=sc.next();
            
        
        
        }while(resp.equalsIgnoreCase("si"));
        
        
        
    }
    
}
