import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestJTextArea extends JFrame {

	JPanel jpanel = (JPanel) this.getContentPane();
	JTextArea jtextarea = new JTextArea();     
 
	public TestJTextArea() {
		jpanel.setLayout(null);
		jpanel.setBackground(Color.lightGray);
		
		jtextarea.setBounds(new Rectangle(25, 15, 250, 90));
		jtextarea.setText("Esto es un control \r\n JTextArea \r\n de varias líneas");
		jtextarea.setEditable(false);
		jpanel.add(jtextarea, null);
		setSize(300,150);       
		setTitle("Mi Formulario");        
		setVisible(true);
	}


	    public static void main(String arg[]) {  
	    	new TestJTextArea();  
	    }
}
