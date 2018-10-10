
import javax.swing.JFrame; //proporciona caracteristicas de una ventana 
import javax.swing.JLabel; // componenete que muestra imagenes 
import java.awt.FlowLayout; // capa de componenetes, especificos como se ordena.
import javax.swing.SwingConstants; //Constantes comunes dyilizadas con las liberias SWING
import javax.swing.Icon; // interfas grafica para imagenes 
import javax.swing.ImageIcon; //cargas las imagenes 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alba
 */
public class MiEtiqueta extends JFrame{
    //mostrar unicamenre texto
    private JLabel etiqueta1; 
     
    //mostrar texto e icono.
    private JLabel etiqueta2;
   
    //mostarar texto adicional e icono
    private JLabel etiqueta3;
   
    
    //El contructor 
    public MiEtiqueta(){
        //hace referencia al constructor de la clase padre.
        super ("prueba de etiqueta");
        
        //Mandamos la capa 
        setLayout(new FlowLayout ());
        
        etiqueta1 = new JLabel("Etiqueta con texto");
        
        //texto de ayuda 
        etiqueta1.setToolTipText("Esta es la etiqueta1");
        
        //Se agrega la etiqueta a la ventana (JFrame)
        add (etiqueta1); 
        
        //se crea el icono
        Icon icono = 
                new ImageIcon(
                       "C:\\Users\\alba\\Documents\\NetBeansProjects\\ComponetesGUI\\resources\\icono.png");
        
        //creamos la etiqueta con el icono y o psocionamos a la izqueierda 
        etiqueta2 = new JLabel (
                "Etiqueta con texto e icono",
                 icono,
                 SwingConstants.LEFT);
        
        //Texto de ayuda 
        etiqueta2.setToolTipText("esta e sla qtiqueta1");
        
        //agregamos la etiqueta a la ventana (JFrame)
        add (etiqueta2);
        
        //Se crea la etiqueta sin argumentos
        etiqueta3 = new JLabel();
        
        //se le asigana un texto 
        etiqueta3.setText("Etiqueta con icono y texto ");
        
        
        //se le anade el icono 
        etiqueta2.setIcon (icono);
        
        //se le da una alineacion al texto 
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        
        
        //Se coloca en texto abajo
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        
        //Texto de ayuda 
        etiqueta3.setToolTipText ("Esta es la etiqueta3");
        
        
        //SE agrega a la etiqueta a la ventana (JFrame)
        add (etiqueta3);
              
        
        
        
        
    }
}
