package ejercicio_6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements ActionListener, MouseListener {

	JPanel panel;
	JLabel etiNombre;
	JButton btnEsquina;
	JButton btnCentro;
	JButton btnAgrandar;
	JButton btnAchicar;

	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 6");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		etiNombre = new JLabel();
		etiNombre.setText("Jhon");
		etiNombre.setBounds(110, 80, 150, 30);
		etiNombre.setBackground(Color.white);
		etiNombre.setOpaque(true);
		
		btnEsquina = new JButton();
		btnEsquina.setText("Esquina");
		btnEsquina.setBounds(110, 20, 150, 30);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		
		btnCentro = new JButton();
		btnCentro.setText("Centro");
		btnCentro.setBounds(110, 160, 150, 30);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		
		btnAgrandar = new JButton();
		btnAgrandar.setText("Agrandar");
		btnAgrandar.setBounds(110, 200, 150, 30);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		
		btnAchicar = new JButton();
		btnAchicar.setText("Achicar");
		btnAchicar.setBounds(110, 240, 150, 30);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		
		panel.add(etiNombre);
		panel.add(btnEsquina);
		panel.add(btnCentro);
		panel.add(btnAgrandar);
		panel.add(btnAchicar);
		
		add(panel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnEsquina) {
			etiNombre.setLocation(0, 0);
		}
		
		if (e.getSource() == btnCentro) {
			etiNombre.setLocation(250, 250);
		}
		
		if (e.getSource() == btnAgrandar) {
			etiNombre.setSize(300, 50);
		}
		
		if (e.getSource() == btnAchicar) {
			etiNombre.setSize(50, 20);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(200, 50);
		}
		
		if (e.getSource() == btnCentro) {
			btnCentro.setSize(200, 50);
		}
		
		if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(200, 50);
		}
		
		if (e.getSource() == btnAchicar) {
			btnAchicar.setSize(200, 50);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(150, 30);
		}
		
		if (e.getSource() == btnCentro) {
			btnCentro.setSize(150, 30);
		}
		
		if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(150, 30);
		}
		
		if (e.getSource() == btnAchicar) {
			btnAchicar.setSize(150, 30);
		}
		
	}
}
