/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimensaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jvdiniz1
 */
public class DimensaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é:" + dim.width + "X" + dim.height);
    }
    
}
