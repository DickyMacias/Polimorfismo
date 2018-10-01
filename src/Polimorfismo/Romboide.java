/* 
Se implementa interface Figura para atraer sus metodos abstractos para calculos
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */
public class Romboide implements Figura{
  
  private float base;
  private float altura;

  public Romboide() {
  }

  public Romboide(float base, float altura) {
    this.base = base;
    this.altura = altura;
  }

  
  // Se sobreescribe la funcion segun su formula para el area
  @Override
  public float calcularArea() {
    
    return base * altura;

  }

  
  // Se sobreescribe la funcion segun su formula para el perimetro
  @Override
  public float calcularPerimetro() {

    return base * 2 + altura * 2;
    
  }
  
}
