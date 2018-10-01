/*
Calculadora de Areas y Perimetros aplicando polimorfismo.
Integrantes del Equipo:
== Ricardo Ivan Macias
== Daniel Emir Olivas
== Luis Orozco
== Victor Valdez
== Karen Peña

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
    
      // Se crea indice para el arreglo irlo aumentando
      int index = 0;
      
      // Arreglo de figuras
      Figura f[] = new Figura[8];
      
      // Se instancian los objetos a un arreglo tipo Figura
      f[index++] = new Circulo(10);
      f[index++] = new Cuadrado(10);
      // En el caso de los triangulos se suben segun el tipo de triangulo para tomar su propio constructor.
      f[index++] = new Triangulo(10,10,"Isoceles");
      f[index++] = new Triangulo(10,10,"Equilatero");
      f[index++] = new Triangulo(10,10,"Rectangulo");
      f[index++] = new Triangulo(10,10,10,"Escaleno");
      f[index++] = new Rombo(10,10);
      f[index++] = new Romboide(10,10);

      // Se inicializan las variables de reusltados
      float totalArea = 0;
      float totalPerimetro = 0;
      
      // Se hace un foreach que recorra el arreglo y vaya sumando al resultado las areas y permitros de la Figura
      for(Figura g : f){
        totalArea += g.calcularArea();
        totalPerimetro += g.calcularPerimetro();
      }
      
      // Se imprimen los resultados 
      System.out.println(totalArea);
      System.out.println(totalPerimetro); 
    
    }
    
}
