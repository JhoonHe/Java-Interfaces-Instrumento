package ejercicio_9;

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
	JTextField txtPrimerTrimestre;
	JTextField txtSegundoTrimestre;
	JTextField txtTercerTrimestre;
	JLabel etiNotaFinal;
	JLabel etiResultado;
	JButton btnCalcular;
	
	public VentanaPrincipal() {
		iniciarComponentes();
		setTitle("Ejercicio 9");
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(110, 80, 150, 30);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setBounds(110, 120, 150, 30);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(110, 160, 150, 30);
		
		etiNotaFinal = new JLabel();
		etiNotaFinal.setBounds(110, 200, 150, 30);
		
		etiResultado = new JLabel();
		etiResultado.setBounds(110, 240, 150, 30);
		
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(110, 300, 150, 30);
		btnCalcular.addActionListener(this);
		
		panel.add(txtPrimerTrimestre);
		panel.add(txtSegundoTrimestre);
		panel.add(txtTercerTrimestre);
		panel.add(etiNotaFinal);
		panel.add(etiResultado);
		panel.add(btnCalcular);
		
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double promedio, primer, segundo, tercer;
		
		if (e.getSource() == btnCalcular) {
			primer = Double.parseDouble(txtPrimerTrimestre.getText());
			segundo = Double.parseDouble(txtSegundoTrimestre.getText());
			tercer = Double.parseDouble(txtTercerTrimestre.getText());
		
			promedio = (primer + segundo + tercer) / 3;
		
			etiNotaFinal.setText("Promedio: " + String.valueOf(promedio));
			
			if (promedio < 5) {
				etiResultado.setText("SUSPENSO");
				etiResultado.setForeground(Color.red);
				etiNotaFinal.setForeground(Color.red);
			}else {
				etiResultado.setText("APROBADO");
				etiResultado.setForeground(null);
				etiNotaFinal.setForeground(null);
			}
		}
		
	}

}
