package ejercicio_5;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame implements MouseListener {

	JPanel panel;
	JLabel etiPal1;
	JLabel etiPal2;
	JLabel etiPal3;
	JLabel etiPal4;
	JLabel etiOcultar;

	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 5");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.orange);

		etiPal1 = new JLabel();
		etiPal1.setText("Etiqueta 1");
		etiPal1.setBounds(110, 80, 150, 30);

		etiPal2 = new JLabel();
		etiPal2.setText("Etiqueta 2");
		etiPal2.setBounds(110, 100, 150, 30);

		etiPal3 = new JLabel();
		etiPal3.setText("Etiqueta 3");
		etiPal3.setBounds(110, 120, 150, 30);

		etiPal4 = new JLabel();
		etiPal4.setText("Etiqueta 4");
		etiPal4.setBounds(110, 140, 150, 30);

		etiOcultar = new JLabel();
		etiOcultar.setText("Ocultar");
		etiOcultar.setBounds(110, 180, 200, 30);
		etiOcultar.setOpaque(true);
		etiOcultar.setBackground(Color.yellow);
		etiOcultar.addMouseListener(this);

		panel.add(etiPal1);
		panel.add(etiPal2);
		panel.add(etiPal3);
		panel.add(etiPal4);
		panel.add(etiOcultar);

		add(panel);

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

		if (e.getSource() == etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {

		if (e.getSource() == etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}

	}
}
