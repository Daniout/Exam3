
package Vista;
import Datos.*;
import Entidades.*;
import Logica.*;
import java.io.IOException;
/**
 *
 * @author Daniel
 */
public class Test {
    public static void main(String[] args) throws IOException {
        VentanaPrinci  escritorio = new VentanaPrinci();
        Tiendatxt t1 = new Tiendatxt();
        Info in1  = new Info ("Abbc1","VPar-Guatapuri","Valledupar","Cesar","Portatil: HP",5000,100,4900);
        Info in2  = new Info ("Abbc1","VPar-Guatapuri","Valledupar","Cesar","Televisor: LG",2000,400,1600);
        
        t1.escribir(in1);
        t1.escribir(in2);
        
    }
}
