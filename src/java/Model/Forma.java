
package Model;

/**
 *
 * @author Bueno Rosas Brayan Omar
 */
public class Forma {
    double side;
// clase padre que se encarga de dar parte a las formas, creando una clase de la cual se pueden 
    // derivar las demas 
    public Forma(double side) {
        this.side = side;
    }
    
    public double area(){
        return 0;
    }// metodo que sera usado para cada forma
    
    public double perimeter(){
        return 0;
    }// metodo para calcular el perimetro de diferentes formulas
}
