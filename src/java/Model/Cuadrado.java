
package Model;

/**
 *
 * @author Bueno Rosas Brayan 
 */
public class Cuadrado extends Forma {
    // clase hija de forma que representa una nueva forma
    public Cuadrado(double side) {
        super(side);
    }
    // metodo sobreescrito del calculo de area
    public double area(){
        return side*side;
    }
    // metodo sobreescrito del calculo del perimetro 
    public double perimeter()
    {
        return side*4;
    }
}
