/* 
Se implementa interface Figura para atraer sus metodos abstractos para calculos
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */
public class Cuadrado implements Figura {
  
  private float lado;

  public Cuadrado() {
  }

  public Cuadrado(float lado) {
    this.lado = lado;
  }

  public float getLado() {
    return lado;
  }

  public void setLado(float lado) {
    this.lado = lado;
  }

  // Se sobreescribe la funcion segun su formula para el area
  @Override
  public float calcularArea() {
  
    return lado * lado;
  
  }

  // Se sobreescribe la funcion segun su formula para el perimetro
  @Override
  public float calcularPerimetro() {
    
    return lado * 4;

  }
  

    
}
