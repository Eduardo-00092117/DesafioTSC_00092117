
package main;

import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Eduardo
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch(Exception e){
            
        }
        new frmMenu().setVisible(true);
    }
    
}
