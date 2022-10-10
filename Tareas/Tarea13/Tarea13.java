/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 13: Busqueda en vector
*/
import javax.swing.JOptionPane;

public class Tarea13{

	public static void main(String[] args) {
		int i, n, b, c=0;
		int[] A;
		String letrero="";
		String entrada;

		entrada= JOptionPane.showInputDialog("Ingrese el tamaño del arreglo: ");
		n= Integer.parseInt(entrada);

		A= new int[n];

		for(i=0; i<n; i++){
			entrada= JOptionPane.showInputDialog("Ingrese A["+(i+1)+"]: ");
			A[i]= Integer.parseInt(entrada);
		}

		entrada= JOptionPane.showInputDialog("Ingrese el numero a buscar: ");
		b= Integer.parseInt(entrada);

		for (i=0; i<n; i++){
			if(A[i]==b){
				c=c+1;
			}
		}

		for(i=0; i<n; i++){
			letrero= letrero+A[i]+", ";	
		 }

		letrero="El valor "+b+" aparece "+c+" veces en el vector: \n"+"A= ["+letrero+"]";

		JOptionPane.showMessageDialog(null, letrero);
    }
}

