import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TestArrayControles extends JFrame {
	JPanel jpanel = (JPanel) this.getContentPane();          
    JLabel[] label = new JLabel[6];    		  //Declaración del array de etiquetas
    JTextField[] text = new JTextField[6];    //Declaración del array de cajas de texto
    Border border = BorderFactory.createLineBorder(Color.black, 1);

    public TestArrayControles() {
    	jpanel.setLayout(null);
    	jpanel.setBackground(Color.lightGray);
    	
    	for(int i = 0; i < label.length; i++) {
    		label[i] = new JLabel();    //Llenamos el array de etiquetas
    		text[i] = new JTextField();    //Llemanos el array de cajas de texto
            label[i].setBounds(new Rectangle(15, (i+1)*40, 60, 25));
            label[i].setText("Dato "+(i+1));
            label[i].setBorder(border);
            label[i].setHorizontalAlignment(SwingConstants.CENTER);  
            text[i].setBounds(new Rectangle(100, (i+1)*40, 60, 25));
            jpanel.add(label[i], null);
            jpanel.add(text[i], null);
    	}
        setSize(200,330);              
        setTitle("Mi Formulario");                
        setVisible(true);
   }
    
   public static void main(String arg[]) { 
	   new TestArrayControles();     
   }
}
