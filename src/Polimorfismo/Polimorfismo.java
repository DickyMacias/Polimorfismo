/*
Calculadora de Areas aplicando polimorfismo
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      int index = 0;
      
      // Arreglo de figuras
      Figura f[] = new Figura[5];
      
      f[index++] = new Circulo(10);
      f[index++] = new Cuadrado(10);
      f[index++] = new Triangulo(10,10);
      f[index++] = new Rombo(10,10);
      f[index++] = new Romboide(10,10);

      float total = 0;
      
      for(Figura g : f){
        total += g.calcularArea();
      }
      
      System.out.println(total);   
    
    }
    
}
