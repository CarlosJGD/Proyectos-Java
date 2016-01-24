import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class TestJTextField extends JFrame{      
    JPanel jpanel = (JPanel) this.getContentPane();
    JTextField jtextfield = new JTextField();     

    public TestJTextField() {
    	jpanel.setLayout(null);
    	jpanel.setBackground(Color.lightGray);

    	jtextfield.setBounds(new Rectangle(25, 15, 250, 21));
        jtextfield.setText("Realizada modificación del JTextField");
        jtextfield.setEditable(true);
        jtextfield.setHorizontalAlignment(JTextField.LEFT); 
  
        jpanel.add(jtextfield, null);

		setSize(300,150);
        setTitle("Mi Formulario");
        setVisible(true);
     }

    public static void main(String arg[]) {
    	new TestJTextField();
    }
}
