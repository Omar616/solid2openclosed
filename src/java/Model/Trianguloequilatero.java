/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bueno Rosas Brayan Omar
 */
public class Trianguloequilatero extends Forma{
    /* Se crea una clase que extiende de la clase forma permitiendo asi cumplir con el segundo principio */
    //Evita que se creen nuevos metodos, creando herencias que permitan agregar más figuras sin modificar las demas clases
   
    public Trianguloequilatero(double side) {
        super(side);
    }
    
    public double area(){
        return Math.sqrt(3) * Math.pow(side, 2)/4;
    } // metodo de calculo de area
    
    public double perimeter()
    {
        return side*3;
    }// metodo de calculo de perimetro 
}
