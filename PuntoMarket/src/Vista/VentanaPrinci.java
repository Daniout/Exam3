
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Daniel
 */
public class VentanaPrinci extends JFrame implements ActionListener {
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem menuItemRegistro, menuItemConsulta;

    public VentanaPrinci() {
        
        this.setTitle("Registro de Informacion de los productos. Punto Market");
        this.setSize(500, 800);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.initComponents();
        this.setVisible(true);
        
    }
    
    public void initComponents(){
        this.barraMenu = new JMenuBar();
        this.setJMenuBar(this.barraMenu);
        
        this.menu = new JMenu("Consultar Registros");
        this.barraMenu.add(this.menu);
        
        
        this.menuItemConsulta = new JMenuItem("Consulta");
        this.menuItemConsulta.addActionListener(this);
        this.menu.add(this.menuItemConsulta);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); 
    } 
}
