/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 11: Serie B
*/
import javax.swing.JOptionPane;
 
public class Tarea11{

    public static void main(String[] args) {
        String entrada;
        int i, j, n, b=1, m=2, s=2, k,o=-1;
        entrada = JOptionPane.showInputDialog("Ingrese el total de numeros de la serie: ");
        n = Integer.parseInt(entrada);
        
	String letrero= "";
		
		for(i=1;i<=n;i=i){
			if(b==1){
				for(k=1;k<=1;k++){
					if(i<=n){
						letrero=letrero+o+", ";
						o=o-2;
						i=i+1;
					}
				}
			b=0;
			}else{
				for(j=1;j<=m;j++){
					if(i<=n){
						letrero=letrero+s+", ";
						i=i+1;
					}
				}
				m=m+1;
				s=s+2;
				b=1;
			}
		}
		
	JOptionPane.showMessageDialog(null, letrero);
    }

}
