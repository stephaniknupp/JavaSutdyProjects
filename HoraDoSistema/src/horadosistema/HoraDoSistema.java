/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author steph
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
         Locale loc = Locale.getDefault();  
        System.out.print ("A língua do seu sistema é: " + loc.getDisplayLanguage()); // imprime "Português" 
        System.out.println ("  " + loc.getLanguage()); // imprime "pt"
        
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();  
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);  
      
    }
    
    
}
