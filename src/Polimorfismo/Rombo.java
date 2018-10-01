/* 
Se implementa interface Figura para atraer sus metodos abstractos para calculos
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */
public class Rombo implements Figura{

  private float diagA;
  private float diagB;
  

  public Rombo() {
  }

  public Rombo(float diagA, float diagB) {
    this.diagA = diagA;
    this.diagB = diagB;
  }

  public float getDiagA() {
    return diagA;
  }

  public void setDiagA(float diagA) {
    this.diagA = diagA;
  }

  public float getDiagB() {
    return diagB;
  }

  public void setDiagB(float diagB) {
    this.diagB = diagB;
  }

  
  // Se sobreescribe la funcion segun su formula para el area
  @Override
  public float calcularArea() {

    return diagA * diagB / 2;

  }

  
  // Se sobreescribe la funcion segun su formula para el perimetro
  @Override
  public float calcularPerimetro() {
    
    // Se castea la funcion matematica porque son doubles
    return ((float)Math.sqrt((float)Math.pow(diagA / 2,2) + (float)Math.pow(diagB / 2,2)))+ diagA / 2 + diagB / 2;

  }
  
}
