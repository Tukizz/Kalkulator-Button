import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ngitung extends JFrame {

	private JPanel contentPane;
	private JTextField angka1;
	private JTextField angka2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ngitung frame = new ngitung();
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
	public ngitung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka 1");
		lblAngka.setBounds(10, 56, 46, 14);
		contentPane.add(lblAngka);
		
		angka1 = new JTextField();
		angka1.setBounds(66, 53, 86, 20);
		contentPane.add(angka1);
		angka1.setColumns(10);
		
		angka2 = new JTextField();
		angka2.setText("");
		angka2.setBounds(66, 97, 86, 20);
		contentPane.add(angka2);
		angka2.setColumns(10);
		
		JLabel lblAngka_1 = new JLabel("Angka 2");
		lblAngka_1.setBounds(10, 100, 46, 14);
		contentPane.add(lblAngka_1);
		
		JRadioButton rdbtnTambah = new JRadioButton("Tambah");
		rdbtnTambah.setBounds(10, 151, 109, 23);
		contentPane.add(rdbtnTambah);
		
		JRadioButton rdbtnKurang = new JRadioButton("Kurang");
		rdbtnKurang.setBounds(126, 151, 109, 23);
		contentPane.add(rdbtnKurang);
		
		JRadioButton rdbtnKali = new JRadioButton("kali");
		rdbtnKali.setBounds(10, 185, 109, 23);
		contentPane.add(rdbtnKali);
		
		JRadioButton rdbtnBagi = new JRadioButton("bagi");
		rdbtnBagi.setBounds(126, 185, 109, 23);
		contentPane.add(rdbtnBagi);
		
		JButton btnSumbit = new JButton("sumbit");
		btnSumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String angka11 = angka1.getText();
				String angka22 = angka2.getText();
				
				int nilai111 = Integer.parseInt(angka11);
				int nilai222 = Integer.parseInt(angka22);
				
				int nilai;
				String keterangan;
				
				if(rdbtnTambah.isSelected()){
					 nilai = nilai111 + nilai222 ;
					 keterangan = "tambah";
				}else if(rdbtnKurang.isSelected()){
					nilai = nilai111 - nilai222;
					keterangan = "kurang";
				}else if(rdbtnKali.isSelected()){
					nilai = nilai111 * nilai222 ;
					keterangan = "kali";
				}else{
					nilai = nilai111 / nilai222;
					keterangan = "bagi";
				}
				
				JOptionPane.showMessageDialog(null, angka11+ " " + keterangan + " "  + angka22 + "= " + nilai);
			}
		});
		btnSumbit.setBounds(66, 215, 89, 23);
		contentPane.add(btnSumbit);
	}
}
