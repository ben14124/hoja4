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
	int contador; //contador para saber cuantas veces recorrer el for del stack
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