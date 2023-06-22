package ejercicio_8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements ActionListener{

	JPanel panel;
	JLabel etiTexto;
	JButton btnAzul;
	JButton btnRojo;
	JButton btnVerde;
	JButton btnFondoAzul;
	JButton btnFondoRojo;
	JButton btnFondoVerde;
	JButton btnTransparente;
	JButton btnOpaca;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 8");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		
		etiTexto = new JLabel();
		etiTexto.setBounds(110, 80, 150, 30);
		etiTexto.setText("¡Hola Mundo!");
		etiTexto.setOpaque(true);
		
		btnAzul = new JButton();
		btnAzul.setBounds(110, 120, 150, 30);
		btnAzul.setText("Azul");
		btnAzul.addActionListener(this);
		
		btnRojo = new JButton();
		btnRojo.setBounds(110, 160, 150, 30);
		btnRojo.setText("Rojo");
		btnRojo.addActionListener(this);
		
		btnVerde = new JButton();
		btnVerde.setBounds(110, 200, 150, 30);
		btnVerde.setText("Verde");		
		btnVerde.addActionListener(this);
		
		btnFondoAzul = new JButton();
		btnFondoAzul.setBounds(110, 240, 150, 30);
		btnFondoAzul.setText("Fondo Azul");
		btnFondoAzul.addActionListener(this);
		
		btnFondoRojo = new JButton();
		btnFondoRojo.setBounds(110, 280, 150, 30);
		btnFondoRojo.setText("Fondo Rojo");
		btnFondoRojo.addActionListener(this);
		
		btnFondoVerde = new JButton();
		btnFondoVerde.setBounds(110, 320, 150, 30);
		btnFondoVerde.setText("Fondo Verde");
		btnFondoVerde.addActionListener(this);
		
		btnTransparente = new JButton();
		btnTransparente.setBounds(110, 360, 150, 30);
		btnTransparente.setText("Transparente");
		btnTransparente.addActionListener(this);
		
		btnOpaca = new JButton();
		btnOpaca.setBounds(110, 400, 150, 30);
		btnOpaca.setText("Opaca");
		
		panel.add(etiTexto);
		panel.add(btnAzul);
		panel.add(btnRojo);
		panel.add(btnVerde);
		panel.add(btnFondoAzul);
		panel.add(btnFondoRojo);
		panel.add(btnFondoVerde);
		panel.add(btnTransparente);
		panel.add(btnOpaca);
		
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAzul) {
			etiTexto.setForeground(Color.blue);
		}
		
		if (e.getSource() == btnRojo) {
			etiTexto.setForeground(Color.red);
		}
		
		if (e.getSource() == btnVerde) {
			etiTexto.setForeground(Color.green);
		}
		
		if (e.getSource() == btnFondoAzul) {
			etiTexto.setBackground(Color.blue);
		}
		
		if (e.getSource() == btnFondoRojo) {
			etiTexto.setBackground(Color.red);
		}
		
		if (e.getSource() == btnFondoVerde) {
			etiTexto.setBackground(Color.green);
		}
		
		if (e.getSource() == btnTransparente) {
			etiTexto.setOpaque(false);
		}
		
		if (e.getSource() == btnOpaca) {
			etiTexto.setOpaque(true);
		}
	}

}
