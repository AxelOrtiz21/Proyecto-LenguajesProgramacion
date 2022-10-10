/*Nombre: Axel Ramon Ortiz Flores Matricula: 1819000 Hora: V6
Tarea 11: Serie C
 */
    import javax.swing.JOptionPane;
    public class Tarea12{
    public static void main(String[]args){
        int n, a=0, j=1, y=1, m=1, b=1, i, k, r;
        String entrada;
            
        entrada = JOptionPane.showInputDialog("Ingrese el total de numeros de la serie: ");
        n = Integer.parseInt(entrada);

        String letrero="";
            
            for(i=1; i<=n;i=i){
                if(y==1){
                    for(j=1;j<=m;j++){
                        if(i<=n){
                            a=a+2;
                        if(y==1){
                            letrero=letrero+a+" ,"; 
                        }else{
                            letrero=letrero+a+", ";
                        }
                        i=i+1;
                        }
                    }
                    y=0;
                    m=m+1;
                }else{
                    for(k=1; k<=3;k++){
                        if(i<=n){
                            b=b+2;
                            r=b*-1;
                        if(y==0){
                            letrero=letrero+r+" , ";
                        }else{
                            letrero=letrero+r+"  ";
                        }
                        i=i+1;
                        }
                    }
                    y=1;
                }
            }

            
        JOptionPane.showMessageDialog(null, letrero);
    }
        
}
            