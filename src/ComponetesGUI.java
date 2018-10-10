/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

/**
 *
 * @author alba
 */
public class ComponetesGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MiEtiqueta mi_etiqueta = new MiEtiqueta();
        mi_etiqueta.setSize(275, 108);
        
        //indicamos que la ventana se cierra alm precionar icono de cerrado
        mi_etiqueta.setDefaultCloseOperation(
                         JFrame.EXIT_ON_CLOSE);
        
        
        //Mostrar 
        mi_etiqueta.show();
        
    }
    
}
