/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprograii;

/**
 *
 * @author Lourdes Zamora
 */
public class Alumno {
    private int codigo;
    public String name;
    public static int version=1223;
    
    public Alumno(int codigo, String n){
    
        this.codigo=codigo;
        name= n;
    }
    
    public void print(){
    System.out.print(codigo);
    }
    
    public int getCodigo(){
    
    return codigo;

    }
    
}
