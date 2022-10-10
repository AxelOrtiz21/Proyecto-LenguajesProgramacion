/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 16: Multiplicacion de Maatrices
*/
import javax.swing.JOptionPane;

public class Tarea16{

	public static void main(String[] args) {
		int i, b, j;
		int k, m;
		int n, z;
		int[][] A;
		int[][] B;
		int[][] C;
		String letrero="";
		String entrada;

		entrada= JOptionPane.showInputDialog("#Filas del Arreglo A: ");
		k= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("#Columna del Arreglo A");
		m= Integer.parseInt(entrada);

		entrada= JOptionPane.showInputDialog("Las filas de B se autodefinen por regla!!\n#Columnas del Arreglo B");
		n= Integer.parseInt(entrada);


				A = new int[k][m];
				B = new int[m][n];
				C = new int[k][n];

				/*Pedimos los datos del arreglo A*/
				for(i=0; i<k; i++){
					for(j=0; j<m; j++){
						entrada= JOptionPane.showInputDialog("Ingrese A["+(i+1)+"]["+(j+1)+"]: ");
						A[i][j]= Integer.parseInt(entrada);
				    }
				}
				/*Pedimos los datos del arreglo B*/
				for(i=0; i<m; i++){
					for(j=0; j<n; j++){
						entrada= JOptionPane.showInputDialog("Ingrese B["+(i+1)+"]["+(j+1)+"]: ");
						B[i][j]= Integer.parseInt(entrada);
				    }
				}

				/*Inicializamos el arreglo c*/
				for(i=0; i<k; i++){
					for (j=0; j<n; j++) {
						C[i][j]=0;
					}
				}

				/*Multiplicamos el arreglo A * arreglo B = arreglo C*/
				for (i=0; i<k; i++){
					for (j=0; j<n; j++) {
						for ( z=0; z<m; z++ ){
							C[i][j] += A[i][z] * B[z][j];
					    }
					}
				}

				/*Imprimimos Arreglo C= resultante*/
				for(i=0; i<k; i++){
					for (j=0; j<n; j++) {
						letrero= letrero+C[i][j]+" ";
					}
					letrero = letrero + "\n     ";
				 }

				letrero="C=" + letrero;

				JOptionPane.showMessageDialog(null, letrero);
		}
		
    }


