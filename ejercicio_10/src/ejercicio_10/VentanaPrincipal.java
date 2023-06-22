package ejercicio_10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

	JPanel panel;
	JLabel etiTexto;
	JTextField txtPalabra1, txtPalabra2;
	JButton btnConcatena;

	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 10");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.green);

		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(110, 80, 150, 30);

		txtPalabra2 = new JTextField();
		txtPalabra2.setBounds(110, 120, 150, 30);

		btnConcatena = new JButton();
		btnConcatena.setText("Concatenar");
		btnConcatena.setBounds(110, 160, 150, 30);
		btnConcatena.addActionListener(this);

		etiTexto = new JLabel();
		etiTexto.setBounds(110, 200, 150, 30);

		panel.add(txtPalabra1);
		panel.add(txtPalabra2);
		panel.add(btnConcatena);
		panel.add(etiTexto);

		add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConcatena) {
			etiTexto.setText(txtPalabra1.getText() + " " + txtPalabra2.getText());
		}
	}

}
