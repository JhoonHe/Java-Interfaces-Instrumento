package ejercicio_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener{

	JPanel panel;
	JTextField txtTexto;
	JLabel etiTexto1;
	JLabel etiTexto2;
	JButton btnTraspasa1;
	JButton btnTraspasa2;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 2");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.red);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(110, 80, 150, 30);
		
		etiTexto1 = new JLabel();
		etiTexto1.setBounds(110, 120, 150, 30);
		etiTexto1.setForeground(Color.white);
		
		etiTexto2 = new JLabel();
		etiTexto2.setBounds(110, 140, 150, 30);
		etiTexto2.setForeground(Color.white);
		
		btnTraspasa1 = new JButton();
		btnTraspasa1.setText("Traspasa 1");
		btnTraspasa1.setBounds(110, 180, 150, 30);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton();
		btnTraspasa2.setText("Traspasa 2");
		btnTraspasa2.setBounds(110, 240, 150, 30);
		btnTraspasa2.addActionListener(this);
		
		panel.add(txtTexto);
		panel.add(etiTexto1);
		panel.add(etiTexto2);
		panel.add(btnTraspasa1);
		panel.add(btnTraspasa2);
		
		add(panel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
		}
		
		if (e.getSource() == btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
	}
}
