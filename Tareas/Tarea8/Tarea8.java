/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 8:  Conversión de Temperatura 
*/

import javax.swing.JOptionPane;
public class Tarea8{
	public static void main(String[] args){
		String entrada;
		String[] options ={"Ninguna","C >> F","F >> C"};
		float x;
		double f, c;
		
		int v = JOptionPane.showOptionDialog(null, "Ingrese la opcion deseada: ", "Conversion de Temperatura", 
		JOptionPane.YES_NO_CANCEL_OPTION, 
		JOptionPane.QUESTION_MESSAGE, 
		null,
		options,
		options[0]);

		if(v==0){
			JOptionPane.showMessageDialog(null, "No ha elegido ninguna opcion de conversion, Gracias!!");
		}else if(v==1){
				entrada= JOptionPane.showInputDialog("Ingrese los grados Celcius a convertir:");
			    x= Float.parseFloat(entrada);
			    f= ((x*1.8)+32);
			    JOptionPane.showMessageDialog(null, x + " grados Celcius es igual a " + String.format("%.2f", f)+" en grados Farenheit");
			}else if(v==2){
				entrada= JOptionPane.showInputDialog("Ingrese los grados Celcius a convertir:");
				x= Float.parseFloat(entrada);
				c=(x-32)/1.8;
				JOptionPane.showMessageDialog(null, x + "grados Farenheit es igual a "+ String.format("%.2f", c)+" en grados Celcius");
			}
		}
	}