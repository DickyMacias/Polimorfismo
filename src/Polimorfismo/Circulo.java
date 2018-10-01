/* 
Se implementa interface Figura para atraer sus metodos abstractos para calculos
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */

// Se crea la clase y se implementa la interface
public class Circulo implements Figura {
  
  // Se cran atributos
  private float radio;

  public Circulo() {
  }

  public Circulo(float radio) {
    this.radio = radio;
  }

  // Se sobreescribe la funcion segun su formula para el area.
  @Override
  public float calcularArea() {

    // Se castea la funcion matematica porque son doubles
    return (float)Math.PI * (radio * radio);   
  
  }

  // Se sobreescribe la funcion segun su formula para el perimetro.
  @Override
  public float calcularPerimetro() {
    
    // Se castea la funcion matematica porque son doubles
    return (float)Math.PI * (radio + radio);

  }
  
  
  
}
