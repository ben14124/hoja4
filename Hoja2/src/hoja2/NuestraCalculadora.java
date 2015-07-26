/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;

/**
 *
 * @author dbs_jd
 */
public class NuestraCalculadora implements Calculadora{

  Stack<String> stack1 = new StackVector<String>();
  Stack<Integer> stack2 = new StackVector<Integer>();
  String linea;
  int resultado;
  int contador, contador2; //contador para saber cuantas veces recorrer el for del stack
  int numero;
  int numero1, numero2;
  
  @Override
  public void setString(String linea){
      this.linea = linea;
  }

  @Override
  public void meterVector(){
    contador = 0;
    for (int x=linea.length()-1; x>=0; x--){
      if((linea.charAt(x)==42) || (linea.charAt(x)==43) || (linea.charAt(x)==45) || ((linea.charAt(x))>=47) && (linea.charAt(x)<=57)){ //si son signos o numeros
         String s1 = Character.toString(linea.charAt(x));
          stack1.push(s1);
          contador++;
      }
      else if(linea.charAt(x)==32){

      }
      else{
        //tronitos
      }
    }
      //=stack1
  }

  @Override
  public void calcularVector(){ //try-catch NumberFormatException
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

  @Override
  public int getResultado(){
    return resultado;

  }

}