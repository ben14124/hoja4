/***************************************************
Universidad del Valle de Guatemala
Juan Diego Benitez C. - 14124
Daniela I. Pocasangre A. - 14162
Ma. Belen Hernandez - 14361
Jose Alejandro Rivera - 14213
Algoritmos y Estructuras de Datos
Seccion 30
***************************************************/
package hoja2; 
/**
 * Esta clase implementa a la interface Calculadora; aqui se crea el funcionamiento e los metodos.
 * @see Calculadora 
 * @author Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class NuestraCalculadora implements Calculadora{

  private Stack<String> stack1;
  private Stack<Integer> stack2;
  private String linea, primero;
  private int resultado;
  private int contador, contador2; //contador para saber cuantas veces recorrer el for del stack
  private int numeros,letras;
  private int numero;
  private int numero1, numero2;
  private char last;
  private boolean calcular;
  private static NuestraCalculadora singleCalcu; //variable estatica para uso del patron de diseno singleton
  
  /**
   * Es el constructor privatizado que sirve para el uso del patron de diseño
   * de singlenton.
   * @param stackString Pila de Strings.
   * @param stackInt Pila de enteros.
   */
  private NuestraCalculadora(Stack<String> stackString, Stack<Integer> stackInt){
      this.stack1=stackString;
      this.stack2=stackInt;
  } //constructor privatizado para uso del patron de diseno singleton
  
  //Metodo getCalculadora para crear una unica instancia de la clase NuestraCalculadora (patron singleton)
  /**
   * Sirve para crear una unica instancia de la clase NuestraCalculadora.
   * Este es el patron Singlenton.
   * @param stackString Pila de Strings.
   * @param stackInt Pila de enteros.
   * @return singleCalcu Objeto nuevo de tipo NuestraCalculadora
   */
  public static NuestraCalculadora getCalculadora(Stack<String> stackString, Stack<Integer> stackInt){
      if (singleCalcu==null){
          singleCalcu= new NuestraCalculadora(stackString, stackInt);
      }
      return singleCalcu;
  }
  
  /**
   * Sirve para ingresar una linea del archivo .text
   * @param linea Nueva linea del archivo.
   */
  public void setString(String linea){
      this.linea = linea;
  }

  /**
   * Esto ayuda al programa a identificar que elementos de la linea son enteros 
   * y cuales son Strings para saber el tipo de operacion a realizar.
   */
  public void meterVector(){
    contador = 0;
    letras = 0;
    numeros = 0;
    for (int x=linea.length()-1; x>=0; x--){
      if((linea.charAt(x)==42) || (linea.charAt(x)==43) || (linea.charAt(x)==45) || ((linea.charAt(x))>=47) && (linea.charAt(x)<=57)){ //si son signos o numeros
          String s1 = Character.toString(linea.charAt(x));
          stack1.push(s1);
          if((linea.charAt(x)==42) || (linea.charAt(x)==43) || (linea.charAt(x)==45) || ((linea.charAt(x))==47)){
          	  letras++; //suma cantidad de signos
          }
          else if((linea.charAt(x)>47) && (linea.charAt(x)<=57)){
          	  numeros++; //suma la cantidad de numeros
          }
          
          if(x==linea.length()-1){
          	  last = linea.charAt(x); //se almacena el ultimo valor del vector
          }
          else{
          
          }  
          
          contador++;
          calcular = true;
      }
      else if(linea.charAt(x)==32){

      }
      else{
        calcular=false;
      }
    }
      //=stack1
  }

  /**
   * Realiza las diferentes operaciones dentro de la linea. Verifica el tipo de
   * operacion a realizar y la aplica. Contiene tambien la programacion defensiva.
   * @return calcular Indica si se tiene un error dentro del programa.
   */
  public boolean calcularVector(){ //try-catch NumberFormatException
  	  primero = stack1.pop();//saca el primero para verificar si es signo
  	  if(primero.equals("+") || primero.equals("-") || primero.equals("*") || primero.equals("/")){
  	  	  calcular=false; //si el primero es signo, no se realiza operacion
  	  }
  	  
  	  else{
  	  	  if(numeros<letras || numeros==letras){ //si hay mas signos que numeros o la misma cantidad es error
  	  	  	  calcular=false;
  	  	  }
  	  	  else{
  	  	  	  if(last>47 && last <= 57){ //si el ultimo valor es un numero, error
				  calcular=false;
  	  	  	  }
  	  	  	  else{
  	  	  	  	if(calcular==false){

  	  	  	  	}
  	  	  	  	else if(calcular==true){
				  calcular=true;
				  stack1.push(primero);
				}
  	  	  	  }
  	  	  }
  	  }
  	  
  	  if(calcular==true){
	    for (int x = 0; x<contador; x++){
		String s2 = stack1.pop();
		
		try {
		  //if ((s2.equals("0")) || (s2.equals("1")) || (s2.equals("2")) || (s2.equals("3")) || (s2.equals("4")) || (s2.equals("5")) || (s2.equals("6")) || (s2.equals("7")) || (s2.equals("8")) || (s2.equals("9"))){
		    numero = Integer.parseInt(s2);
		    stack2.push(numero);
		    contador2++;
		}
		
		catch (NumberFormatException s){
		    if (s2.equals("+")){
			numero1 = stack2.pop();
			numero2 = stack2.pop();
			resultado = (numero2 + numero1);
			//System.out.println(resultado);
			String s3 = Integer.toString(resultado);
			stack1.push(s3);
			contador++; //cada vez que entramos en un signo hay que subirle 1 al contador porque luego sigue el ciclo y x sube de valor cuando "no lo deberia"
		    }
	
		    if (s2.equals("-")){
			numero1 = stack2.pop();
			numero2 = stack2.pop();
			resultado = (numero2 - numero1);
			String s3 = Integer.toString(resultado);
			stack1.push(s3);
			contador++;
		    }
	
		    if (s2.equals("*")){
			numero1 = stack2.pop();
			numero2 = stack2.pop();
			resultado = (numero2 * numero1);
			String s3 = Integer.toString(resultado);
			stack1.push(s3);
			contador++;
		    }
	
		    if (s2.equals("/")){
			numero1 = stack2.pop();
			numero2 = stack2.pop();
			try {
			  resultado = (numero2 / numero1);
			  contador++;
			  //System.out.println(resultado);
			  String s3 = Integer.toString(resultado);
			  stack1.push(s3);
			}
			catch (ArithmeticException e){
			  //Error: division por cero
			}
			if ((stack2.empty())==false){
			    for (int y = 0; y==contador; y++){
				String s4 = Integer.toString(stack2.pop());
				stack1.push(s4);
			    }
			}
		    }
		}
	    }
	  }
	  
	  else if(calcular==false){
	  
	  }
	  return calcular;
   }

  /**
   * Obtiene el resultado final de las operaciones en cada linea. 
   * @return resultado Resultado final de tipo entero.
   */
  public int getResultado(){
    return resultado;

  }

}
