package ejercicio_11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements MouseListener, ActionListener {

	JPanel panel;
	JLabel etiCero, etiUno, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve;
	JTextField txtNumero;
	JButton btnBorrar;
	
	String valores = "";

	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 11");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	public void iniciarComponentes() {

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.cyan);

		etiCero = new JLabel();
		etiCero.setText("0");
		etiCero.setBounds(60, 20, 10, 25);
		etiCero.addMouseListener(this);

		etiUno = new JLabel();
		etiUno.setText("1");
		etiUno.setBounds(100, 20, 10, 25);
		etiUno.addMouseListener(this);

		etiDos = new JLabel();
		etiDos.setText("2");
		etiDos.setBounds(140, 20, 10, 25);
		etiDos.addMouseListener(this);

		etiTres = new JLabel();
		etiTres.setText("3");
		etiTres.setBounds(180, 20, 10, 25);
		etiTres.addMouseListener(this);

		etiCuatro = new JLabel();
		etiCuatro.setText("4");
		etiCuatro.setBounds(220, 20, 10, 25);
		etiCuatro.addMouseListener(this);

		etiCinco = new JLabel();
		etiCinco.setText("5");
		etiCinco.setBounds(260, 20, 10, 25);
		etiCinco.addMouseListener(this);

		etiSeis = new JLabel();
		etiSeis.setText("6");
		etiSeis.setBounds(300, 20, 10, 25);
		etiSeis.addMouseListener(this);

		etiSiete = new JLabel();
		etiSiete.setText("7");
		etiSiete.setBounds(340, 20, 10, 25);
		etiSiete.addMouseListener(this);

		etiOcho = new JLabel();
		etiOcho.setText("8");
		etiOcho.setBounds(380, 20, 10, 25);
		etiOcho.addMouseListener(this);

		etiNueve = new JLabel();
		etiNueve.setText("9");
		etiNueve.setBounds(420, 20, 10, 25);
		etiNueve.addMouseListener(this);

		txtNumero = new JTextField();
		txtNumero.setBounds(100, 100, 100, 25);

		btnBorrar = new JButton();
		btnBorrar.setText("BORRAR");
		btnBorrar.setBounds(300, 100, 100, 25);
		btnBorrar.addActionListener(this);

		panel.add(etiCero);
		panel.add(etiUno);
		panel.add(etiDos);
		panel.add(etiTres);
		panel.add(etiCuatro);
		panel.add(etiCinco);
		panel.add(etiSeis);
		panel.add(etiSiete);
		panel.add(etiOcho);
		panel.add(etiNueve);
		panel.add(txtNumero);
		panel.add(btnBorrar);

		add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			txtNumero.setText(null);
			valores = "";
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		if (e.getSource() == etiCero) {
			valores += etiCero.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiUno) {
			valores += etiUno.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiDos) {
			valores += etiDos.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiTres) {
			valores += etiTres.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiCuatro) {
			valores += etiCuatro.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiCinco) {
			valores += etiCinco.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiSeis) {
			valores += etiSeis.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiSiete) {
			valores += etiSiete.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiOcho) {
			valores += etiOcho.getText();
			txtNumero.setText(valores);

		} else if (e.getSource() == etiNueve) {
			valores += etiNueve.getText();
			txtNumero.setText(valores);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
