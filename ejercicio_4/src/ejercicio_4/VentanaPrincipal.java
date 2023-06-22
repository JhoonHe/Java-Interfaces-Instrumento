package ejercicio_4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {

	JPanel panel;
	JTextField txtNombre;
	JTextField txtCiudad;
	JLabel txtFrase;
	JButton btnAceptar;
	JButton btnDesactivar;
	JButton btnActivar;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 4");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.yellow);

		txtNombre = new JTextField();
		txtNombre.setBounds(110, 80, 150, 30);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(110, 120, 150, 30);
		
		txtFrase = new JLabel();
		txtFrase.setBounds(110, 150, 400, 30);
		
		btnAceptar = new JButton();
		btnAceptar.setText("Aceptar");
		btnAceptar.setBounds(110, 180, 150, 30);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton();
		btnDesactivar.setText("Desactivar");
		btnDesactivar.setBounds(110, 220, 150, 30);
		btnDesactivar.addActionListener(this);
		
		btnActivar = new JButton();
		btnActivar.setText("Activar");
		btnActivar.setBounds(110, 260, 150, 30);
		btnActivar.addActionListener(this);
		
		panel.add(txtNombre);
		panel.add(txtCiudad);
		panel.add(txtFrase);
		panel.add(btnAceptar);
		panel.add(btnDesactivar);
		panel.add(btnActivar);
		
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnAceptar) {
		    txtFrase.setText("Usted se llama " + txtNombre.getText() + " y vive en " + txtCiudad.getText());
		}
		
		if (e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
		
		if (e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
	}
}
