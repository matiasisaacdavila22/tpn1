package tp1;

public class interesante {

	
	
	import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import java.awt.Insets;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class ArrObjetos implements ActionListener{
	    
	    JButton []arrBtn = new JButton[9];//arreglo de botones
	    JPanel jp1;
	    JLabel jl1, jl2;
	    
	    private ArrObjetos (){//constructor de la clase
	        
	        JFrame frMain = new JFrame("Arreglo de Botones");
	        frMain.setLayout(new BorderLayout(10, 20));
	        
	        jl1 = new JLabel();//creacion jlabel que muestra el numero pulsado     
	        jl1.setText("Aqu� ira el numero que se pulse");
	        
	        mostrarBot();
	        
	        frMain.add(jl1, BorderLayout.NORTH);
	        frMain.add(jp1, BorderLayout.SOUTH);
	        
	        frMain.setSize(400, 300);
	        frMain.setLocation(300, 200);
	        frMain.setVisible(true);
	        frMain.setResizable(false);
	        frMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
	    }
	    
	    public void mostrarBot(){//metodo donde se encontrara el jpanel que contiene los botones
	        jp1 = new JPanel(new GridLayout(3, 3, 20, 5));
	        
	        for(int i=arrBtn.length-1; i>=0; i--){//ciclo para crear, a�adir, establecer propiedades a los botones
	            arrBtn[i] = new JButton(""+(i+1));
	            jp1.add(arrBtn[i]);
	            arrBtn[i].setMargin(new Insets(1, 1, 1, 1));
	            arrBtn[i].addActionListener(this);
	        }//fin ciclo
	    }

	    public static void main(String[] args) {        
	        ArrObjetos trin = new ArrObjetos(); //se invoca el constructor        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {        
	        jl1.setText(e.getActionCommand());//cuando se presione un boton se mostrara el numero en el jlabel
	    }
	}
}
