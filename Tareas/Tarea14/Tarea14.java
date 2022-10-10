/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 14: Busqueda en Matriz
*/
import javax.swing.JOptionPane;

public class Tarea14{

	public static void main(String[] args) {
		int i, n, b, c=0, m, j;
		int[][] A;
		String letrero="";
		String entrada;

		entrada= JOptionPane.showInputDialog("Ingrese el numero de filas: ");
		n= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("Ingrese el numero de columnas");
		m= Integer.parseInt(entrada);

		A = new int[n][m];

		/*Rellenar arreglo*/
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				entrada= JOptionPane.showInputDialog("Ingrese A["+(i+1)+"]["+(j+1)+"]: ");
				A[i][j]= Integer.parseInt(entrada);
		    }
		}

		/*Pedir numero a buscar*/
		entrada= JOptionPane.showInputDialog("Ingrese el numero a buscar: ");
		b= Integer.parseInt(entrada);

		/*Busqueda del numero*/
		for (i=0; i<n; i++){
			for (j=0; j<m; j++) {
				if(A[i][j]==b){
					c=c+1;
				}
			}
		}

		/*Impresion*/
		for(i=0; i<n; i++){
			for (j=0; j<m; j++) {
				letrero= letrero+A[i][j]+" ";
			}
			letrero = letrero + "\n     ";
		 }

		letrero="El valor "+b+" aparece "+c+" veces en la Matriz: \nA=" + letrero;

		JOptionPane.showMessageDialog(null, letrero);
    }
}

