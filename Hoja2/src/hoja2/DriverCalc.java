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
public class DriverCalc{

	public static void main(String[] args){

		Calculadora Casio = new NuestraCalculadora();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	    	for(String line; (line = br.readLine()) != null; ) {
	        	Casio.setString(line);
	    	}
		}	
	}
}