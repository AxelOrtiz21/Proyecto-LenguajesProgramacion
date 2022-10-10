/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 10: Serie A
*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Tarea10{
	public static void main(String[] args){
	 String entrada;
	 int n, i=1, j=1;
	 double x=1;
	 
	 DecimalFormat sindecimales= new DecimalFormat("0");
	 
	 entrada=JOptionPane.showInputDialog("Ingrese el total de numeros de la serie: ");
	 n=Integer.parseInt(entrada);
	 
	 String letrero="";
	
		while(i<n){
					
					x= i;
					x=Math.pow(x, j);
					letrero=letrero+sindecimales.format(x)+", ";
					j= j+2;
		i++;	
		}
					x= i;
					x=Math.pow(x, j);
		 JOptionPane.showMessageDialog(null, letrero+sindecimales.format(x)+".");

	}
}