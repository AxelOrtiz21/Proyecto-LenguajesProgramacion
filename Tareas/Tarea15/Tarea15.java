/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 15: Suma de Matrices
*/
import javax.swing.JOptionPane;

public class Tarea15{

	public static void main(String[] args) {
		int i, b, j;
		int n, m;
		int f, c;
		int[][] A;
		int[][] B;
		int[][] C;
		String letrero="";
		String entrada;

		entrada= JOptionPane.showInputDialog("#Filas del Arreglo A: ");
		n= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("#Columna del Arreglo A");
		m= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("#Filas del Arreglo B: ");
		f= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("#Columnas del Arreglo B");
		c= Integer.parseInt(entrada);


		if(n==f){
			if (m==c) {
				A = new int[n][m];
				B = new int[f][c];
				C = new int[n][m];

				/*Pedimos los datos del arreglo A*/
				for(i=0; i<n; i++){
					for(j=0; j<m; j++){
						entrada= JOptionPane.showInputDialog("Ingrese A["+(i+1)+"]["+(j+1)+"]: ");
						A[i][j]= Integer.parseInt(entrada);
				    }
				}
				/*Pedimos los datos del arreglo B*/
				for(i=0; i<f; i++){
					for(j=0; j<c; j++){
						entrada= JOptionPane.showInputDialog("Ingrese B["+(i+1)+"]["+(j+1)+"]: ");
						B[i][j]= Integer.parseInt(entrada);
				    }
				}

				/*Sumamos el arreglo A +  arreglo B = arreglo C*/
				for (i=0; i<n; i++){
					for (j=0; j<m; j++) {
						C[i][j] = A[i][j] + B[i][j];
					}
				}

				/*Imprimimos Arreglo C= resultante*/
				for(i=0; i<n; i++){
					for (j=0; j<m; j++) {
						letrero= letrero+C[i][j]+" ";
					}
					letrero = letrero + "\n     ";
				 }

				letrero="C=" + letrero;

				JOptionPane.showMessageDialog(null, letrero);
			}else{
				JOptionPane.showMessageDialog(null, "Los Arreglos deben tener las mismas longitudes!!");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Los Arreglos deben tener las mismas longitudes!!");
		}
		
    }
}

