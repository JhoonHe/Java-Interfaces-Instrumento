package ejercicio_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements ActionListener{

	JPanel panel;
	JLabel etiNombre;
	JLabel etiCiudad;
	JButton btnOcultarNombre;
	JButton btnVisuNombre;
	JButton btnOcultarCiudad;
	JButton  btnVisuCiudad;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 1");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
	
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.blue);
		
		etiNombre = new JLabel();
		etiNombre.setText("Jhon");
		etiNombre.setBounds(100, 80, 120, 30);
		etiNombre.setForeground(Color.white);
		
		etiCiudad = new JLabel();
		etiCiudad.setText("Armenia");
		etiCiudad.setBounds(100, 220, 120, 30);
		etiCiudad.setForeground(Color.white);
		
		btnOcultarNombre = new JButton();
		btnOcultarNombre.setText("Ocultar Nombre");
		btnOcultarNombre.setBounds(200, 60, 150, 30);
		btnOcultarNombre.addActionListener(this);
		
		btnVisuNombre = new JButton();
		btnVisuNombre.setText("Visualizar Nombre");
		btnVisuNombre.setBounds(200, 100, 150, 30);
		btnVisuNombre.addActionListener(this);
		
		btnOcultarCiudad = new JButton();
		btnOcultarCiudad.setText("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(200, 200, 150, 30);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisuCiudad = new JButton();
		btnVisuCiudad.setText("Visualizar Ciudad");
		btnVisuCiudad.setBounds(200, 240, 150, 30);
		btnVisuCiudad.addActionListener(this);
		
		panel.add(etiNombre);
		panel.add(etiCiudad);
		panel.add(btnOcultarNombre);
		panel.add(btnVisuNombre);
		panel.add(btnOcultarCiudad);
		panel.add(btnVisuCiudad);
		
		add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnOcultarNombre) {
			etiNombre.setVisible(false);
		}
		
		if(e.getSource() == btnVisuNombre) {
			etiNombre.setVisible(true);
		}
		
		if (e.getSource() == btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		
		if (e.getSource() == btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}
	}
}
