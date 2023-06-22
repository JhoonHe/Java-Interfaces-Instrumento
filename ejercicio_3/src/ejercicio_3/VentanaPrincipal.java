package ejercicio_3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener, KeyListener  {

	JPanel panel;
	JTextField txtTexto;
	JLabel etiTexto;
	JButton btnVaciar;

	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 3");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.green);

		txtTexto = new JTextField();
		txtTexto.setBounds(110, 80, 150, 30);
		txtTexto.addKeyListener(this);

		etiTexto = new JLabel();
		etiTexto.setBounds(110, 100, 150, 30);

		btnVaciar = new JButton();
		btnVaciar.setText("Vaciar");
		btnVaciar.setBounds(110, 200, 150, 30);
		btnVaciar.addActionListener(this);

		panel.add(txtTexto);
		panel.add(etiTexto);
		panel.add(btnVaciar);

		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == btnVaciar) {
			txtTexto.setText("");
			etiTexto.setText("");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getSource() == txtTexto) {
			etiTexto.setText( txtTexto.getText());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
