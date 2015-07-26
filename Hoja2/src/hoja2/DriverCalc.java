/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbs_jd
 */
public class DriverCalc{

	public static void main(String[] args){

                File file = new File("file.txt");
		Calculadora Casio = new NuestraCalculadora();
		try{
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    try {
                        for(String line; (line = br.readLine()) != null; ) {
                            Casio.setString(line);
                            Casio.meterVector();
                            Casio.calcularVector();
                            System.out.println(Casio.getResultado());
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(DriverCalc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
		catch (FileNotFoundException ex) {
                Logger.getLogger(DriverCalc.class.getName()).log(Level.SEVERE, null, ex);
            }
                
	}
}