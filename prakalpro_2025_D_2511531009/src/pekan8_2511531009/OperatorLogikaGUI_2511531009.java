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

public class OperatorLogikaGUI_2511531009 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					OperatorLogikaGUI_2511531009 frame = new OperatorLogikaGUI_2511531009();
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
	public OperatorLogikaGUI_2511531009() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR LOGIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 0, 238, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblAngka = new JLabel("Data 1");
		lblAngka.setBounds(10, 58, 57, 14);
		contentPane.add(lblAngka);
		
		JLabel lblAngka_1 = new JLabel("Data 2");
		lblAngka_1.setBounds(10, 86, 57, 14);
		contentPane.add(lblAngka_1);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(10, 111, 57, 14);
		contentPane.add(lblOperator);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setBounds(10, 136, 57, 14);
		contentPane.add(lblHasil);
		
		txthasil = new JTextField();
		txthasil.setEditable(false);
		txthasil.setHorizontalAlignment(SwingConstants.CENTER);
		txthasil.setColumns(10);
		txthasil.setBounds(65, 136, 169, 20);
		contentPane.add(txthasil);
		
		JComboBox datai = new JComboBox();
		datai.setModel(new DefaultComboBoxModel(new String[] {"---------Pilih Data---------", "TRUE", "FALSE"}));
		datai.setBounds(65, 54, 169, 21);
		contentPane.add(datai);
		
		JComboBox dataii = new JComboBox();
		dataii.setModel(new DefaultComboBoxModel(new String[] {"---------PIlih Data---------", "TRUE", "FALSE"}));
		dataii.setBounds(65, 83, 169, 21);
		contentPane.add(dataii);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"Pilih Operator","AND", "OR", "NOT"}));
		cbOperator.setBounds(65, 108, 97, 21);
		contentPane.add(cbOperator);
		
		JButton Hitung = new JButton("Hitung");
		Hitung.addActionListener(new ActionListener() {
			boolean hasil;
			public void actionPerformed(ActionEvent e) {
			    boolean hasil = false;
			    
			    int data1Index = datai.getSelectedIndex();
			    int data2Index = dataii.getSelectedIndex();
			    int operatorIndex = cbOperator.getSelectedIndex();
			    
			    if (operatorIndex == 0) {
			        pesanPeringatan("Pilih Operator!");
			        return;
			    }
			    
			    if (operatorIndex == 3) {
			        if (data1Index > 0 || data2Index > 0) {
			        	
			        } else {
			            pesanPeringatan("Pilih Data 1 atau Data 2 untuk operator NOT.");
			            return;
			        }
			    } 
			    else if (data1Index <= 0 || data2Index <= 0) {
			        pesanPeringatan("Pilih Data 1 dan Data 2 untuk operator AND/OR.");
			        return; 
			    }
			    
			    
			    try {
			        boolean a = (data1Index == 1); 
			        boolean b = (data2Index == 1);
			        
			        switch (operatorIndex) {
			            case 1: // AND
			                hasil = a && b;
			                break;
			                
			            case 2: // OR
			                hasil = a || b;
			                break;
			                
			            case 3: // NOT
			                if (data1Index > 0) {
			                	if (data2Index == 0) {
			                		hasil = !a;
			                	} else {
			                		pesanPeringatan("Hanya Data 1 atau Data 2 untuk operator NOT.");
			                	}
			                } 
			                else if (data2Index > 0) {
			                    hasil = !b;
			                }
			                break;
			                
			            default:
			                pesanError("Operator tidak dikenali.");
			                return;
			        }
			        
			        txthasil.setText(String.valueOf(hasil));
			        
			    } catch (Exception ex) {
			        pesanError("Terjadi kesalahan komputasi.");
			    }
			}
		});
		Hitung.setBounds(162, 107, 72, 23);
		contentPane.add(Hitung);
		

		

	}
}

