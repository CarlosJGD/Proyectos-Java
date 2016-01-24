import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestJLabel extends JFrame {
	JPanel jpanel = (JPanel) this.getContentPane();
    JLabel jlabel = new JLabel();
    JTextField jtextfield = new JTextField();    
	
	public TestJLabel() {
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		jlabel.setBounds(new Rectangle(5, 15, 249, 21));
		jlabel.setText("Introduzca su peso en kgs por favor");
		jtextfield.setBounds(new Rectangle(250, 15, 80, 21));
		jpanel.add(jlabel, null);
		jpanel.add(jtextfield, null);
	    setSize(400,150);        
	    setTitle("Mi Formulario");        
	    setVisible(true);
	}

	public static void main(String arg[]) { 
		new TestJLabel(); 
	}
}
