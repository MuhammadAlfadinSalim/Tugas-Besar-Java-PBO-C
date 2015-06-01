package TugasBesar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
		setTitle("Room Analyst V 1.0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 337, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblGkb = new JLabel("GKB");
		lblGkb.setBounds(10, 53, 46, 14);
		panel.add(lblGkb);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(105, 50, 222, 20);
		panel.add(comboBox);
		
		JLabel lblLantai = new JLabel("Lantai");
		lblLantai.setBounds(10, 89, 46, 14);
		panel.add(lblLantai);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(105, 86, 222, 20);
		panel.add(comboBox_1);
		
		JLabel lblRuang = new JLabel("Ruang");
		lblRuang.setBounds(10, 128, 46, 14);
		panel.add(lblRuang);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(105, 125, 222, 20);
		panel.add(comboBox_2);
		
		JLabel lblFakultas = new JLabel("Fakultas");
		lblFakultas.setBounds(10, 170, 85, 14);
		panel.add(lblFakultas);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(105, 167, 222, 20);
		panel.add(comboBox_3);
		
		JLabel lblIdentitasRuang = new JLabel("Identitas Ruang");
		lblIdentitasRuang.setBounds(10, 11, 106, 14);
		panel.add(lblIdentitasRuang);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 337, 214);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblKondisiRuang = new JLabel("Kondisi Ruang");
		lblKondisiRuang.setBounds(0, 11, 126, 14);
		panel_1.add(lblKondisiRuang);
		
		JLabel lblPanjangRuang = new JLabel("Panjang Ruang (m)");
		lblPanjangRuang.setBounds(0, 48, 111, 14);
		panel_1.add(lblPanjangRuang);
		
		textField = new JTextField();
		textField.setBounds(121, 42, 206, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblLebarRuang = new JLabel("Lebar Ruang (m)");
		lblLebarRuang.setBounds(0, 82, 98, 14);
		panel_1.add(lblLebarRuang);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 76, 206, 27);
		panel_1.add(textField_1);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setBounds(0, 152, 85, 14);
		panel_1.add(lblJumlahPintu);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 112, 206, 27);
		panel_1.add(textField_2);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setBounds(0, 118, 75, 14);
		panel_1.add(lblJumlahKursi);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 146, 206, 27);
		panel_1.add(textField_3);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setBounds(0, 189, 98, 14);
		panel_1.add(lblJumlahJendela);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(121, 183, 206, 27);
		panel_1.add(textField_4);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(149, 264, 89, 23);
		contentPane.add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(247, 264, 89, 23);
		contentPane.add(btnNext);
	}
}
