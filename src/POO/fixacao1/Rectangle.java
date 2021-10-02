
package exercicio.fixacao1;


public class Rectangle {
    
    public double width; 
    public double heigth;
    
    public double area() {
        return width * heigth;
    }
    
    public double perimeter() {
        return (width * 2) + (heigth * 2);
    }
    
    public double diagonal() {
        return Math.sqrt(width * width + heigth * heigth);
    }
 
    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f%n",area())
              + "PERIMETER = " + String.format("%.2f%n",perimeter())
              + "DIAGONAL = " + String.format("%.2f",diagonal());
    }
    
    
}
