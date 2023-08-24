package EjercicioCalculadoraEstandar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCalculadoraEstandar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldOperando1;
	private JTextField textFieldOperando2;

	/**
	 * Create the frame.
	 */
	public ViewCalculadoraEstandar(CalculadoraEstandar calc) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 498);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Título principal
		JLabel lblTitulo = new JLabel("Calculadora Estándar");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTitulo.setBounds(37, 11, 406, 41);
		contentPane.add(lblTitulo);

		// Resultado
		JLabel lblResultado = new JLabel("0");
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblResultado.setBounds(69, 75, 325, 29);
		contentPane.add(lblResultado);

		// Operando 1
		JLabel lblOperando1 = new JLabel("Operando 1");
		lblOperando1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperando1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperando1.setBounds(43, 133, 115, 19);
		contentPane.add(lblOperando1);

		textFieldOperando1 = new JTextField();
		textFieldOperando1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldOperando1.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOperando1.setBounds(43, 172, 115, 35);
		contentPane.add(textFieldOperando1);
		textFieldOperando1.setColumns(10);

		// Operando 2
		JLabel lblOperando2 = new JLabel("Operando 2");
		lblOperando2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperando2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperando2.setBounds(279, 135, 115, 19);
		contentPane.add(lblOperando2);

		textFieldOperando2 = new JTextField();
		textFieldOperando2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldOperando2.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldOperando2.setColumns(10);
		textFieldOperando2.setBounds(279, 172, 115, 35);
		contentPane.add(textFieldOperando2);

		// Operadores
		JButton btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					double num1 = Double.parseDouble(textFieldOperando1.getText());
					double num2 = Double.parseDouble(textFieldOperando2.getText());

					lblResultado.setText(calc.suma(num1, num2) + "");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Los valores introducidos no son correctos.");
				}	
			}
		});
		btnSuma.setBounds(43, 240, 115, 49);
		contentPane.add(btnSuma);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldOperando1.getText());
					double num2 = Double.parseDouble(textFieldOperando2.getText());

					lblResultado.setText(calc.resta(num1, num2) + "");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Los valores introducidos no son correctos.");
				}
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnResta.setBounds(279, 240, 115, 49);
		contentPane.add(btnResta);

		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldOperando1.getText());
					double num2 = Double.parseDouble(textFieldOperando2.getText());

					lblResultado.setText(calc.multiplicacion(num1, num2) + "");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Los valores introducidos no son correctos.");
				}
			}
		});
		btnMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicacion.setBounds(43, 322, 115, 49);
		contentPane.add(btnMultiplicacion);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldOperando1.getText());
					double num2 = Double.parseDouble(textFieldOperando2.getText());

					lblResultado.setText(calc.division(num1, num2) + "");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Los valores introducidos no son correctos.");
				}
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivision.setBounds(279, 322, 115, 49);
		contentPane.add(btnDivision);

		JButton btnResto = new JButton("%");
		btnResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldOperando1.getText());
					double num2 = Double.parseDouble(textFieldOperando2.getText());

					lblResultado.setText(calc.resto(num1, num2) + "");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Los valores introducidos no son correctos.");
				}
			}
		});
		btnResto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnResto.setBounds(162, 387, 115, 49);
		contentPane.add(btnResto);
	}
}