/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author DIEGO
 */
public class clientesBac {
    
    public static globalVariables g = new globalVariables();
            
    public static void main(String args[]) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        //Esta instruccion aplica el skin
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");

        frmMenuPrincipal f1 = new frmMenuPrincipal();
        f1.jLabelLogo.setIcon(g.getImagen());
        f1.show();
    }
}