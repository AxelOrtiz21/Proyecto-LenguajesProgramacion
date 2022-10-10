/*  
Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 9: Conversion de monedas
*/
import javax.swing.JOptionPane;
public class Tarea9{
	public static void main(String[] args) {
		String entrada;
		String[] options ={"Ninguna", "A Dolares", "A Euros\n", "A Yenes", "A Dolares de Hong Kong"};
		int o;
		float p;
		double d=0.040, e=0.037, y=4.34, dh=0.31, r;

		o = JOptionPane.showOptionDialog(null,"Ingrese la opcion deseada:", "Conversion de Moneda", 
		   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (o==0) {
			JOptionPane.showMessageDialog(null, "No ha elegido ninguna opcion, GRACIAS!!");
		}else{

		entrada= JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir: ");
		p= Float.parseFloat(entrada);


		switch(o){

			case 1: r= p*d;
			        JOptionPane.showMessageDialog(null, "La cantidad en dolares es: "+String.format("%.3f", r));
			        break;

			case 2: r= p*e;
			        JOptionPane.showMessageDialog(null, "La cantidad en euros es: "+String.format("%.3f", r));
			        break;

			case 3: r=p*y;
			        JOptionPane.showMessageDialog(null, "La cantidad en yenes es: "+String.format("%.3f", r));
			        break;

			case 4: r= p*dh;
			        JOptionPane.showMessageDialog(null, "La cantidad en dolares de Hong Kong es: "+String.format("%.3f", r));
			        break;

		    }
		}
	}
}