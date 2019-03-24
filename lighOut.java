package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lighOut {

	private JFrame frame;
	private JTextField txtfila;
	private JTextField txtcolumna;
	public  static JPanel panel;
	private controles control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lighOut window = new lighOut();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lighOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    panel = new JPanel();
		panel.setBounds(10, 56, 414, 195);
		frame.getContentPane().add(panel);
		
		txtfila = new JTextField();
		txtfila.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(txtfila);
		txtfila.setColumns(10);
		
		txtcolumna = new JTextField();
		txtcolumna.setBounds(124, 11, 86, 20);
		frame.getContentPane().add(txtcolumna);
		txtcolumna.setColumns(10);
		
		button botin2 =new button();	
        panel.add(botin2);
		JButton btna = new JButton();
		btna.setBounds(40, 40, 100, 50);
		panel.add(btna);
		JButton btnagregar = new JButton();
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int fila=Integer.parseInt(txtfila.getText());
			//	int columna=Integer.parseInt(txtcolumna.getText());
			//control.crearTablero(fila, columna);
			//tabla.agregarButton(3, 3);
				button botin =new button();	
				
				
				panel.add(botin);
				
			}
		});
		btnagregar.setBounds(239, 10, 89, 23);
		frame.getContentPane().add(btnagregar);
	}
}
