
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class impression {
    public static void impr(JTable jt, String titre) {
       
        MessageFormat entete = new MessageFormat(titre);
        MessageFormat pied = new MessageFormat("Page{0, number, integer}");
        try {
         //   Table.print(tableau_sacPostal.PrintMode.NORMAL, header, footer);
           // tableau_sacPostal.print(Jta)
            jt.print(JTable.PrintMode.FIT_WIDTH, entete, pied);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur :|\n"+e, "Impression ", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
