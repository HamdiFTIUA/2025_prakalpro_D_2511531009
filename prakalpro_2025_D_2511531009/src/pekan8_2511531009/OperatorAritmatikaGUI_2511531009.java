package pekan8_2511531009;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531009 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txthasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531009 frame = new OperatorAritmatikaGUI_2511531009();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511531009() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 0, 238, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblAngka = new JLabel("Angka 1");
		lblAngka.setBounds(10, 58, 57, 14);
		contentPane.add(lblAngka);
		
		JLabel lblAngka_1 = new JLabel("Angka 2");
		lblAngka_1.setBounds(10, 86, 57, 14);
		contentPane.add(lblAngka_1);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(10, 111, 57, 14);
		contentPane.add(lblOperator);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setBounds(10, 136, 57, 14);
		contentPane.add(lblHasil);
		
		txtAngka1 = new JTextField();
		txtAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka1.setBounds(65, 55, 125, 20);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka2.setColumns(10);
		txtAngka2.setBounds(65, 83, 125, 20);
		contentPane.add(txtAngka2);
		
		txthasil = new JTextField();
		txthasil.setEditable(false);
		txthasil.setHorizontalAlignment(SwingConstants.CENTER);
		txthasil.setColumns(10);
		txthasil.setBounds(65, 136, 125, 20);
		contentPane.add(txthasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(65, 108, 36, 21);
		contentPane.add(cbOperator);
		
		JButton Hitung = new JButton("Hitung");
		Hitung.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				}	else if (txtAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
					} else {
						try {
							int a = Integer.valueOf(txtAngka1.getText());
							int b = Integer.valueOf(txtAngka2.getText());
							int c = cbOperator.getSelectedIndex();
							if (c==0) {hasil = a+b;}
							if (c==1) {hasil = a-b;}
							if (c==2) {hasil = a*b;}
							if (c==3) {hasil = a/b;}
							if (c==4) {hasil = a%b;}
							txthasil.setText(String.valueOf(hasil));
						} catch (NumberFormatException ex) {
							pesanError("Angka 1 dan Angka 2 tidak valid");
						}
					}
				
			}
		});
		Hitung.setBounds(101, 107, 89, 23);
		contentPane.add(Hitung);
		

	}
}
