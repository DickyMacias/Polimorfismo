/* 
Se implementa interface Figura para atraer sus metodos abstractos para calculos
 */
package Polimorfismo;

/**
 *
 * @author dicky
 */
public class Triangulo implements Figura{
  
  private float base;
  private float altura;
  private float ladoC;
  private String tipo;

  public Triangulo() {
  }

  // Se crea constructor para cuando recibe solo dos parametros, el caso de calcular area
  public Triangulo(float base, float altura) {
    this.base = base;
    this.altura = altura;
  }
  
//  Se Crea constructor para cuando recibe parametros de triangulo escaleno
  public Triangulo(float base, float altura, float ladoC, String tipo) {
    this.tipo = tipo;
    this.base = base;
    this.altura = altura;
    this.ladoC = ladoC;

  }
  
  // Se crea constructor para cuando recibe parametros para calcular perimetros excepto escaleno
  public Triangulo(float base, float altura, String tipo) {
    this.base = base;
    this.altura = altura;
    this.tipo = tipo;
  }
  
  // Se sobreescribe la funcion segun su formula para el area
  @Override
  public float calcularArea() {
    
    return (base * altura) / 2;
  }

  
  // Se sobreescribe la funcion segun sus formulas para el perimetro 
  @Override
  public float calcularPerimetro() {
    
    float result = 0;
    
    // Se crea un switch para poder recibir el parametro de tipo de triangulo desde su instanciacion.
    switch (tipo){
      case "Equilatero": {   
        result = base * 3;
        break;
      }
      case "Isoceles": {
        // Se castea la funcion matematica porque son doubles
        result = ((float)Math.sqrt((float)Math.pow(base / 2,2)*(float)Math.pow(altura, 2)))*2+base;
        break;
      }
      // Recibe tres parametros a diferencia de los otros switches, usando diferente constructor
      case "Escaleno": {
        result = base + altura + ladoC;
        break;
      }
      case "Rectangulo":{
        // Se castea la funcion matematica porque son doubles
        result = ((float)Math.sqrt((float)Math.pow(base,2)*(float)Math.pow(altura,2)))+base+altura;
        break;
      }
    }
    return result;
  }
  
  
          
  
  
  
}
