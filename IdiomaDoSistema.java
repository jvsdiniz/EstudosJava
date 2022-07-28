/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author jvdiniz1
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale localizacao = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(localizacao.getDisplayLanguage());
    }
    
}
