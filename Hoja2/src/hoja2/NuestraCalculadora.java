/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
  public void setString(String linea){
   		this.linea = linea;
  }

  public void meterVector(){
    contador = 0;
   	for (int x=linea.length(); x>=0; x--){
   	  if((linea.charAt(x)==42) || (linea.charAt(x)==43) || (linea.charAt(x)==45) || ((linea.charAt(x))>=47) && (linea.charAt(x)<=57)){ //si son signos o numeros
			   String s1 = Character.toString(linea.charAt(x));
				  //int a = Integer.parseInt(s1);
				  stack1.push(s1);
				  contador++;
				  //stack1.peek();
      }
			else if(linea.charAt(x)==32){

			}
			else{
				//tronitos
			}
   	}
   		//=stack1
  }

  public void calcularVector(){
   	for (int x = 0; x==contador; x++){
   			String s2 = stack1.pop();
        if ((s2=="0") || (s2=="1") || (s2=="2") || (s2=="3") || (s2=="4") || (s2=="5") || (s2=="6") || (s2=="7") || (s2=="8") || (s2=="9")){
          numero = Integer.parseInt(s2);
          stack2.push(numero);
          contador2++;
        }
        if (s2=="+"){
          numero1 = stack2.pop();
          numero2 = stack2.pop();
          resultado = (numero2 + numero1);
          String s3 = Integer.toString(resultado);
          stack1.push(s3);
          contador2--;
        }

        if (s2=="-"){
          numero1 = stack2.pop();
          numero2 = stack2.pop();
          resultado = (numero2 - numero1);
          String s3 = Integer.toString(resultado);
          stack1.push(s3);
          contador2--;
        }

        if (s2=="*"){
          numero1 = stack2.pop();
          numero2 = stack2.pop();
          resultado = (numero2 * numero1);
          String s3 = Integer.toString(resultado);
          stack1.push(s3);
          contador2--;
        }

        if (s2=="/"){
          numero1 = stack2.pop();
          numero2 = stack2.pop();
          try {
            resultado = (numero2 / numero1);
            String s3 = Integer.toString(resultado);
            stack1.push(s3);
            contador2--;
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



  public int getResultado(){
   	return resultado;

  }

}
	
/*Desde el main recorrer el Archivo y guardar cada linea en una variable (String) y mandarla a la clase calculadora. En la clase calculadora tener estos métodos:
	setString(); que sirve para meter el String en una variable para luego recorrer la variable 
	meterVector(); separamos el string en un vector
	calcularVector(); aqui hacemos las operaciones y lo almacenamos en una variable para el getResultado
	getResultado(int Resultado); saca el resultado para mandarlo al main
*/
/*
	String linea = "2 3 4 2 3 2 3 4";
        for (int x = 0; x<linea.length(); x++){
                if(linea.charAt(x)!=32){
   			String s = Character.toString(linea.charAt(x));
   			int a = Integer.parseInt(s);
                        System.out.println(a);
   			//stack1.push(Integer.parseInt(linea.charAt(x)));
   			//stack1.peek();
   		}
                if(linea.charAt(x)==32){
                    System.out.println("espacio");
                }
        }*/