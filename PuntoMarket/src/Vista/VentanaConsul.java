
package Vista;

import java.awt.Container;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */

public class VentanaConsul extends JDialog{
    private Container contenedor;
    private JPanel panelFiltro, panelBase;
    private JScrollPane panelResultado;
    private JLabel lFiltro;
    private JTextField tFiltro;
    private String titulos[]={"Codigo Tienda",
        "Nombre tienda",
        "Ciudad", 
        "Departamento",
        "Nombre producto",
        "Subtotal consolidado",
        "Descuento consolidado",
        "Total consolidado"};
 
    public VentanaConsul (JFrame frame, boolean op) {
        super(frame, op);
        this.iniciarComponentes();
        this.setSize(500, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.actualizarTabla();
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actualizarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

 
