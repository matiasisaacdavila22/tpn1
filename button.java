package tp1;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;





public class button extends JButton  implements ActionListener{
	
	private boolean estado;
	
	public button() {
         
		estado=false;
		
	    addActionListener(this);
		
}
	public void cambiarNombre(int x, int y) {
		setText((x+1)+"-"+(y+1));
	}

@Override
public void actionPerformed(ActionEvent e) {//nnnn
	
	setBackground(Color.orange);
}
}
