package TugasBesar;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.GroupLayout.Alignment;



public class frame extends javax.swing.JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Kelas kls;
	CCTV cctv;
	
	kondisiruang kondisi = new kondisiruang();
	//Kelas kls = new Kelas();
	
	
	
	private JFrame frame;
	JPanel jp = new JPanel();
	
	JTextField jtf = new JTextField(30);
	
	JSpinner js = new JSpinner();
	JSpinner js2 = new JSpinner();
	
	JButton jb = new JButton("Analyze");
	private final JSpinner js3 = new JSpinner();
	private final JSpinner js4 = new JSpinner();
	private final JSpinner js5 = new JSpinner();
	private final JMenuBar menuBar = new JMenuBar();
	private final JLabel jl2 = new JLabel("Gedung");
	private final JLabel jl3 = new JLabel("Fakultas");
	private final JLabel jl4 = new JLabel("Panjang Ruang (Meter)");
	private final JLabel jl5 = new JLabel("Lebar Ruang (Meter)");
	private final JLabel jl6 = new JLabel("Jumlah Kursi");
	private final JLabel jl7 = new JLabel("Jumlah Pintu");
	private final JLabel jl8 = new JLabel("Jumlah Jendela");
	private final ButtonGroup jbg = new ButtonGroup();
	private final ButtonGroup jbg2 = new ButtonGroup();
	private final ButtonGroup jbg3 = new ButtonGroup();
	private final ButtonGroup jbg4 = new ButtonGroup();
	private final ButtonGroup jbg5 = new ButtonGroup();
	private final ButtonGroup jbg6 = new ButtonGroup();
	private final ButtonGroup jbg7 = new ButtonGroup();
	private final ButtonGroup jbg8 = new ButtonGroup();
	private final ButtonGroup jbg9 = new ButtonGroup();
	private final ButtonGroup jbg10 = new ButtonGroup();
	private final ButtonGroup jbg11 = new ButtonGroup();
	private final ButtonGroup jbg12 = new ButtonGroup();
	private final ButtonGroup jbg13 = new ButtonGroup();
	private final ButtonGroup jbg14 = new ButtonGroup();
	private final ButtonGroup jbg15 = new ButtonGroup();
	private final ButtonGroup jbg16 = new ButtonGroup();
	private final ButtonGroup jbg17 = new ButtonGroup();
	private final ButtonGroup jbg18 = new ButtonGroup();
	private final ButtonGroup jbg19 = new ButtonGroup();
	private final ButtonGroup jbg20 = new ButtonGroup();
	private final ButtonGroup jbg21 = new ButtonGroup();
	private final ButtonGroup jbg22 = new ButtonGroup();
	private final ButtonGroup jbg23 = new ButtonGroup();
	private final ButtonGroup jbg24 = new ButtonGroup();
	private final ButtonGroup jbg25 = new ButtonGroup();
	private final JRadioButton jrb = new JRadioButton("baik");
	private final JRadioButton jrb3 = new JRadioButton("baik");
	private final JRadioButton jrb5 = new JRadioButton("baik");
	private final JRadioButton jrb7 = new JRadioButton("baik");
	private final JRadioButton jrb9 = new JRadioButton("baik");
	private final JRadioButton jrb2 = new JRadioButton("buruk");
	private final JRadioButton jrb4 = new JRadioButton("buruk");
	private final JRadioButton jrb6 = new JRadioButton("buruk");
	private final JRadioButton jrb8 = new JRadioButton("buruk");
	private final JRadioButton jrb10 = new JRadioButton("buruk");
	private final JLabel lblKondisiLantai = new JLabel("Kondisi Lantai");
	private final JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
	private final JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
	private final JLabel lblKondisiPintu = new JLabel("Kondisi Pintu");
	private final JLabel jlsampah = new JLabel("");
	private final JLabel jlsampah2 = new JLabel("");
	private final JLabel jlsampah3 = new JLabel("");
	private final JLabel jlsampah4 = new JLabel("");
	private final JLabel jlsampah5 = new JLabel("");
	private final JLabel jlsampah6 = new JLabel("");
	private final JLabel jlsampah7 = new JLabel("");
	private final JLabel jlsampah8 = new JLabel("");
	private final JLabel jlsampah9 = new JLabel("");
	private final JLabel jlsampah10 = new JLabel("");
	private final JLabel jlsampah11 = new JLabel("");
	private final JLabel jlsampah12 = new JLabel("");
	private final JLabel jlsampah13 = new JLabel("");
	private final JLabel jlsampah14 = new JLabel("");
	private final JLabel jlsampah15 = new JLabel("");
	private final JLabel jlsampah16 = new JLabel("");
	private final JLabel jlsampah17 = new JLabel("");
	private final JLabel jlsampah18 = new JLabel("");
	private final JLabel jlsampah19 = new JLabel("");
	private final JLabel jlsampah20 = new JLabel("");
	private final JLabel jlsampah21 = new JLabel("");
	private final JLabel jlsampah22 = new JLabel("");
	private final JLabel jlsampah23 = new JLabel("");
	private final JLabel jlsampah24 = new JLabel("");
	private final JLabel jlsampah25 = new JLabel("");
	private final JLabel lblKondisiJendela = new JLabel("Kondisi Jendela");
	private final JRadioButton jrb11 = new JRadioButton("baik");
	private final JRadioButton jrb12 = new JRadioButton("buruk");
	private final JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara");
	private final JSpinner js7 = new JSpinner();
	private final JSpinner js8 = new JSpinner();
	private final JLabel lblIntensitasCahaya = new JLabel("Intensitas Cahaya");
	private final JLabel lblKelembapan = new JLabel("Kelembapan (%)");
	private final JLabel lblSuhu = new JLabel("Suhu (Celcius)");
	private final JRadioButton jrb13 = new JRadioButton("Bising");
	private final JRadioButton jrb14 = new JRadioButton("Tidak");
	private final JRadioButton jrb15 = new JRadioButton("Bau");
	private final JRadioButton jrb16 = new JRadioButton("Tidak");
	private final JRadioButton jrb17 = new JRadioButton("Bocor");
	private final JRadioButton jrb18 = new JRadioButton("Tidak");
	private final JRadioButton jrb19 = new JRadioButton("Rusak");
	private final JRadioButton jrb20 = new JRadioButton("Tidak");
	private final JRadioButton jrb21 = new JRadioButton("Aus");
	private final JRadioButton jrb22 = new JRadioButton("Tidak");
	private final JLabel lblKebisingan = new JLabel("Kebisingan");
	private final JLabel lblBau = new JLabel("Bau");
	private final JLabel lblKebocoran = new JLabel("Kebocoran");
	private final JLabel lblKerusakan = new JLabel("Kerusakan");
	private final JLabel lblKeausan = new JLabel("Keausan");
	private final JRadioButton jrb23 = new JRadioButton("Kokoh");
	private final JRadioButton jrb24 = new JRadioButton("Tidak");
	private final JRadioButton jrb25 = new JRadioButton("Ada");
	private final JRadioButton jrb26 = new JRadioButton("Tidak");
	private final JRadioButton jrb27 = new JRadioButton("Ada");
	private final JRadioButton jrb28 = new JRadioButton("Tidak");
	private final JRadioButton jrb29 = new JRadioButton("Aman");
	private final JRadioButton jrb30 = new JRadioButton("Tidak");
	private final JLabel lblKekokohan = new JLabel("Kekokohan");
	private final JLabel lblKunciPintu = new JLabel("Kunci Pintu");
	private final JLabel lblKunciJendela = new JLabel("Kunci Jendela");
	private final JLabel lblBahaya = new JLabel("Keamanan");
	private JScrollPane scrollPane = new JScrollPane();
	private final JPanel jp2 = new JPanel();
	private final JPanel jp3 = new JPanel();
	private final JRadioButton jrb32 = new JRadioButton("Lainnya");
	private final JRadioButton jrb31 = new JRadioButton("Pojok Ruang & Dekat Dosen");
	private final JLabel lblNewLabel = new JLabel("Jumlah");
	private final JLabel lblKondisiBaik = new JLabel("Kondisi Baik");
	private final JLabel lblPosisi = new JLabel("Posisi");
	private final JLabel lblLcd = new JLabel("LCD");
	private final JSpinner js11 = new JSpinner();
	private final JLabel label_1 = new JLabel("Jumlah");
	private final JLabel lblKondisi = new JLabel("Kondisi");
	private final JRadioButton jrb33 = new JRadioButton("Berfungsi");
	private final JRadioButton jrb34 = new JRadioButton("Rusak");
	private final JLabel label_2 = new JLabel("Posisi");
	private final JRadioButton jrb35 = new JRadioButton("Dekat Dosen");
	private final JRadioButton jrb36 = new JRadioButton("Lainnya");
	private final JLabel lblLampu = new JLabel("Lampu");
	private final JLabel label_3 = new JLabel("Jumlah");
	private final JLabel label_4 = new JLabel("Kondisi Baik");
	private final JLabel label_5 = new JLabel("Posisi");
	private final JSpinner js12 = new JSpinner();
	private final JSpinner js13 = new JSpinner();
	private final JRadioButton jrb37 = new JRadioButton("Atap Ruangan");
	private final JRadioButton jrb38 = new JRadioButton("Lainnya");
	private final JLabel lblKipasAngin = new JLabel("Kipas Angin");
	private final JSpinner js14 = new JSpinner();
	private final JLabel label_6 = new JLabel("Jumlah");
	private final JLabel label_7 = new JLabel("Kondisi Baik");
	private final JSpinner js15 = new JSpinner();
	private final JLabel label_8 = new JLabel("Posisi");
	private final JRadioButton jrb39 = new JRadioButton("Atap Ruangan");
	private final JRadioButton jrb40 = new JRadioButton("Lainnya");
	private final JSpinner js16 = new JSpinner();
	private final JRadioButton jrb41 = new JRadioButton("Berfungsi");
	private final JLabel label_9 = new JLabel("Jumlah");
	private final JLabel lblAc = new JLabel("AC");
	private final JLabel label_11 = new JLabel("Kondisi");
	private final JLabel label_12 = new JLabel("Posisi");
	private final JRadioButton jrb43 = new JRadioButton("Dibelakang / Disamping");
	private final JRadioButton jrb42 = new JRadioButton("Rusak");
	private final JRadioButton jrb44 = new JRadioButton("Lainnya");
	private final JLabel lblCctv = new JLabel("CCTV");
	private final JLabel label_13 = new JLabel("Jumlah");
	private final JLabel label_14 = new JLabel("Kondisi Baik");
	private final JLabel label_15 = new JLabel("Posisi");
	private final JSpinner js17 = new JSpinner();
	private final JSpinner js18 = new JSpinner();
	private final JRadioButton jrb45 = new JRadioButton("Depan & Belakang");
	private final JRadioButton jrb46 = new JRadioButton("Lainnya");
	private final JLabel lblInternet = new JLabel("Internet");
	private final JLabel lblSsid = new JLabel("SSID");
	private final JRadioButton jrb47 = new JRadioButton("UMM Hotspot");
	private final JRadioButton jrb48 = new JRadioButton("Lainnya");
	private final JLabel lblBisaLogin = new JLabel("Bisa Login ?");
	private final JRadioButton jrb49 = new JRadioButton("Ya");
	private final JRadioButton jrb50 = new JRadioButton("Tidak");
	private final JScrollPane scrollPane2 = new JScrollPane();
	
	
	public frame() 
	{
		
		//cctv.proc();
		//cctv.result
		setResizable(false);
		initialize();
		setTitle("Room Analyst V 1.0.00");
		setVisible(true);
		setSize(950, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getContentPane().add(jp);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 35, 573, 240);
		
		//jrb.addActionListener((ActionListener) this);
		//jrb2.addActionListener((ActionListener) this);
		
		TextArea jta = new TextArea();
		jta.setBounds(605, 94, 311, 360);
		jp.setLayout(null);
		jp2.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(jp2);
		jp3.setBackground(Color.LIGHT_GRAY);
		scrollPane2.setViewportView(jp3);
		jp2.setBounds(10, 0, 564, 572);
		
		js.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		js2.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		js3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js4.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js5.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		
		JComboBox jcb = new JComboBox();
		jcb.setModel(new DefaultComboBoxModel(new String[] {"GKB 1", "GKB 2", "GKB 3"}));
		
		JComboBox jcb2 = new JComboBox();
		jcb2.setModel(new DefaultComboBoxModel(new String[] {"Teknik", "Hukum", "Pertanian dan Peternakan", "Agama Islam", "Ilmu Sosial dan Politik", "Keguruan & Ilmu Pendidikan", "Psikologi", "Ekonomi dan Bisnis"}));
		
		JLabel lblNamaRuang = new JLabel("Nama Ruang");
		
		jbg.add(jrb);
		jbg.add(jrb2);
		
		jbg2.add(jrb3);
		jbg2.add(jrb4);
		
		jbg3.add(jrb5);
		jbg3.add(jrb6);
		
		jbg4.add(jrb7);
		jbg4.add(jrb8);
		
		jbg5.add(jrb9);
		jbg5.add(jrb10);
		
		jbg6.add(jrb11);
		jbg6.add(jrb12);
		
		jbg7.add(jrb13);
		jbg7.add(jrb14);
		
		jbg8.add(jrb15);
		jbg8.add(jrb16);
		
		jbg9.add(jrb17);
		jbg9.add(jrb18);
		
		jbg10.add(jrb19);
		jbg10.add(jrb20);
		
		jbg11.add(jrb21);
		jbg11.add(jrb22);
		
		jbg12.add(jrb23);
		jbg12.add(jrb24);
		
		jbg13.add(jrb25);
		jbg13.add(jrb26);
		
		jbg14.add(jrb27);
		jbg14.add(jrb28);
		
		jbg15.add(jrb29);
		jbg15.add(jrb30);
		
		jbg16.add(jrb31);
		jbg16.add(jrb32);
		
		jbg17.add(jrb33);
		jbg17.add(jrb34);
		
		jbg18.add(jrb35);
		jbg18.add(jrb36);
		
		jbg19.add(jrb37);
		jbg19.add(jrb38);
		
		jbg20.add(jrb39);
		jbg20.add(jrb40);
		
		jbg21.add(jrb41);
		jbg21.add(jrb42);
		
		jbg22.add(jrb43);
		jbg22.add(jrb44);
		
		jbg23.add(jrb45);
		jbg23.add(jrb46);
		
		jbg24.add(jrb47);
		jbg24.add(jrb48);
		
		jp3.setBounds(20, 296, 573, 725);
		
		Label label = new Label("Stop Kontak");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JSpinner js9 = new JSpinner();
		js9.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		
		JSpinner js10 = new JSpinner();
		js10.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		lblLcd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLampu.setFont(new Font("Tahoma", Font.BOLD, 11));
		js12.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js13.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		lblKipasAngin.setFont(new Font("Tahoma", Font.BOLD, 11));
		js14.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js15.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js16.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		lblAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCctv.setFont(new Font("Tahoma", Font.BOLD, 11));
		js17.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		js18.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		lblInternet.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_jp3 = new GroupLayout(jp3);
		gl_jp3.setHorizontalGroup(
			gl_jp3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(219)
							.addComponent(lblLcd, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(js9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(162)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(js11, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKondisiBaik, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPosisi, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(js10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb32, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb31, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKondisi, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jp3.createSequentialGroup()
									.addComponent(jrb33, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(jrb34, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(jrb36, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb35, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(lblLampu, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(275)
							.addComponent(lblKipasAngin, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(js12, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(162)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(js14, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(js13, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(162)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(88)
									.addComponent(js15, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(65)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(jrb37, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb38, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(jrb40, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb39, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(lblAc, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(275)
							.addComponent(lblCctv, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(js16, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(162)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(js17, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(jrb41, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb44, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb43, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(85)
									.addComponent(jrb42, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
							.addGap(32)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(88)
									.addComponent(js18, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jp3.createSequentialGroup()
									.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(42)
									.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
										.addComponent(jrb46, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
										.addComponent(jrb45, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(lblInternet, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(lblSsid, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(jrb47, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(jrb48, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblBisaLogin, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(jrb49, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(jrb50, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
		);
		gl_jp3.setVerticalGroup(
			gl_jp3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLcd))
					.addGap(19)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel))
						.addComponent(js9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_1))
						.addComponent(js11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKondisiBaik)
							.addGap(18)
							.addComponent(lblPosisi))
						.addGroup(gl_jp3.createSequentialGroup()
							.addComponent(js10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(jrb32, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKondisi)
							.addGap(15)
							.addComponent(label_2))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addComponent(jrb33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(jrb34, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(jrb36, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(26)
							.addComponent(jrb35, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLampu)
						.addComponent(lblKipasAngin))
					.addGap(25)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_3))
						.addComponent(js12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_6))
						.addComponent(js14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_4))
						.addComponent(js13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(js15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_7)))
					.addGap(3)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(10)
							.addComponent(label_5))
						.addComponent(jrb37, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(24)
							.addComponent(jrb38, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(10)
							.addComponent(label_8))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(24)
							.addComponent(jrb40, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(jrb39, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAc)
						.addComponent(lblCctv))
					.addGap(25)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(6)
							.addComponent(label_9))
						.addComponent(js16, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(4)
							.addComponent(label_13))
						.addComponent(js17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(6)
							.addComponent(label_11)
							.addGap(15)
							.addComponent(label_12))
						.addComponent(jrb41, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(50)
							.addComponent(jrb44, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(26)
							.addComponent(jrb43, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(jrb42, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(4)
									.addComponent(label_14))
								.addComponent(js18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(3)
							.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(10)
									.addComponent(label_15))
								.addGroup(gl_jp3.createSequentialGroup()
									.addGap(24)
									.addComponent(jrb46, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(jrb45, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addGap(36)
					.addComponent(lblInternet)
					.addGap(13)
					.addGroup(gl_jp3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(7)
							.addComponent(lblSsid))
						.addComponent(jrb47, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb48, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp3.createSequentialGroup()
							.addGap(7)
							.addComponent(lblBisaLogin))
						.addComponent(jrb49, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb50, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_jp3.createSequentialGroup()
					.addGap(111)
					.addComponent(jrb31, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
		);
		jp3.setLayout(gl_jp3);
		
		JSpinner js6 = new JSpinner();
		js6.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		GroupLayout gl_jp2 = new GroupLayout(jp2);
		gl_jp2.setHorizontalGroup(
			gl_jp2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNamaRuang, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(jtf, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(jl4, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(js, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(jl2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(jcb, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(jl5, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(js2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(jl3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(jcb2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(jl6, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(js3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(335)
					.addComponent(jl7, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(js4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(335)
					.addComponent(jl8, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(js5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKondisiLantai, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(jrb, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(lblSirkulasiUdara, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(jrb11, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb12, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKondisiDinding, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKondisiAtap, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKondisiPintu, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addComponent(jrb3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb7, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addComponent(jrb4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(jrb8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIntensitasCahaya, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKelembapan, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addComponent(js6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(js7, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKondisiJendela, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(jrb9, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb10, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(lblSuhu, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(js8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKebisingan, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb13, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb14, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblKekokohan, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb23, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb24, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblBau, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb15, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb16, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblKunciPintu, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb25, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb26, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKebocoran, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb17, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb18, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblKunciJendela, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb27, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb28, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKerusakan, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb19, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb20, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblBahaya, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb29, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb30, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(20)
					.addComponent(lblKeausan, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(jrb21, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(jrb22, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
		);
		gl_jp2.setVerticalGroup(
			gl_jp2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp2.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNamaRuang))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(jtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl4))
						.addComponent(js, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl2))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(1)
							.addComponent(jcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl5))
						.addComponent(js2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl3))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(1)
							.addComponent(jcb2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl6))
						.addComponent(js3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl7))
						.addComponent(js4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(7)
							.addComponent(jl8))
						.addComponent(js5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKondisiLantai))
						.addComponent(jrb)
						.addComponent(jrb2)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblSirkulasiUdara))
						.addComponent(jrb11)
						.addComponent(jrb12))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKondisiDinding)
							.addGap(12)
							.addComponent(lblKondisiAtap)
							.addGap(12)
							.addComponent(lblKondisiPintu))
						.addGroup(gl_jp2.createSequentialGroup()
							.addComponent(jrb3)
							.addGap(3)
							.addComponent(jrb5)
							.addGap(3)
							.addComponent(jrb7))
						.addGroup(gl_jp2.createSequentialGroup()
							.addComponent(jrb4)
							.addGap(3)
							.addComponent(jrb6)
							.addGap(3)
							.addComponent(jrb8))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(8)
							.addComponent(lblIntensitasCahaya)
							.addGap(25)
							.addComponent(lblKelembapan))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(js6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(16)
							.addComponent(js7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKondisiJendela))
						.addComponent(jrb9)
						.addComponent(jrb10)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(8)
							.addComponent(lblSuhu))
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(js8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(43)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKebisingan))
						.addComponent(jrb13)
						.addComponent(jrb14)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKekokohan))
						.addComponent(jrb23)
						.addComponent(jrb24))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblBau))
						.addComponent(jrb15)
						.addComponent(jrb16)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKunciPintu))
						.addComponent(jrb25)
						.addComponent(jrb26))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKebocoran))
						.addComponent(jrb17)
						.addComponent(jrb18)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKunciJendela))
						.addComponent(jrb27)
						.addComponent(jrb28))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKerusakan))
						.addComponent(jrb19)
						.addComponent(jrb20)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblBahaya))
						.addComponent(jrb29)
						.addComponent(jrb30))
					.addGap(3)
					.addGroup(gl_jp2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblKeausan))
						.addComponent(jrb21)
						.addComponent(jrb22))
					.addGap(149))
		);
		jp2.setLayout(gl_jp2);
		
		jp.add(scrollPane);
		scrollPane2.setBounds(10, 297, 573, 208);
		
		jp.add(scrollPane2);
		jp.add(jta);
		jb.setBounds(604, 35, 71, 23);
		jp.add(jb);
		
		jb.addActionListener(new ActionListener()
		{		
			@Override
			public void actionPerformed(ActionEvent alfad) {
				
				//kls.getJumlahac().equals(js17.getValue());
				//cctv.getResult();
				
				
				Object obj = alfad.getSource();
				if (jrb.isSelected())
				{
					jlsampah.setText("Baik");
					//jlsampah.setIcon(new ImageIcon("C:\\Users\\mus_mus\\git\\Tugas-Besar-Java-PBO-C\\centang.png"));
				}
				if (jrb2.isSelected())
				{
					jlsampah.setText("Buruk");
				}
				if (jrb3.isSelected())
				{
					jlsampah2.setText("Baik");
				}
				if (jrb4.isSelected())
				{
					jlsampah2.setText("Buruk");
				}
				if (jrb5.isSelected())
				{
					jlsampah3.setText("Baik");
				}
				if (jrb6.isSelected())
				{
					jlsampah3.setText("Buruk");
				}
				if (jrb7.isSelected())
				{
					jlsampah4.setText("Baik");
				}
				if (jrb8.isSelected())
				{
					jlsampah4.setText("Buruk");
				}
				if (jrb9.isSelected())
				{
					jlsampah5.setText("Baik");
				}
				if (jrb10.isSelected())
				{
					jlsampah5.setText("Buruk");
				}
				if (jrb11.isSelected())
				{
					jlsampah6.setText("Baik");
				}
				if (jrb12.isSelected())
				{
					jlsampah6.setText("Buruk");
				}
				if (jrb13.isSelected())
				{
					jlsampah7.setText("Bising");
				}
				if (jrb14.isSelected())
				{
					jlsampah7.setText("Tidak Bising");
				}
				if (jrb15.isSelected())
				{
					jlsampah8.setText("Bau");
				}
				if (jrb16.isSelected())
				{
					jlsampah8.setText("Tidak Bau");
				}
				if (jrb17.isSelected())
				{
					jlsampah9.setText("Bocor");
				}
				if (jrb18.isSelected())
				{
					jlsampah9.setText("Tidak Bocor");
				}
				if (jrb19.isSelected())
				{
					jlsampah10.setText("Rusak");
				}
				if (jrb20.isSelected())
				{
					jlsampah10.setText("Tidak Rusak");
				}
				if (jrb21.isSelected())
				{
					jlsampah11.setText("Aus");
				}
				if (jrb22.isSelected())
				{
					jlsampah11.setText("Tidak Aus");
				}
				if (jrb23.isSelected())
				{
					jlsampah12.setText("Kokoh");
				}
				if (jrb24.isSelected())
				{
					jlsampah12.setText("Tidak Kokoh");
				}
				if (jrb25.isSelected())
				{
					jlsampah13.setText("Ada");
				}
				if (jrb26.isSelected())
				{
					jlsampah13.setText("Tidak Ada");
				}
				if (jrb27.isSelected())
				{
					jlsampah14.setText("Ada");
				}
				if (jrb28.isSelected())
				{
					jlsampah14.setText("Tidak Ada");
				}
				if (jrb29.isSelected())
				{
					jlsampah15.setText("Aman");
				}
				if (jrb30.isSelected())
				{
					jlsampah15.setText("Tidak Aman");
				}
				if (jrb31.isSelected())
				{
					jlsampah16.setText("Pojok Ruangan & Dekat Dosen");
				}
				if (jrb32.isSelected())
				{
					jlsampah16.setText("Lainnya");
				}
				if (jrb33.isSelected())
				{
					jlsampah17.setText("Berfungsi");
				}
				if (jrb34.isSelected())
				{
					jlsampah17.setText("Rusak");
				}
				if (jrb35.isSelected())
				{
					jlsampah18.setText("Dekat Dosen");
				}
				if (jrb36.isSelected())
				{
					jlsampah18.setText("Lainnya");
				}
				if (jrb37.isSelected())
				{
					jlsampah19.setText("Atap Ruangan");
				}
				if (jrb38.isSelected())
				{
					jlsampah19.setText("Lainnya");
				}
				if (jrb39.isSelected())
				{
					jlsampah20.setText("Atap Ruangan");
				}
				if (jrb40.isSelected())
				{
					jlsampah20.setText("Lainnya");
				}
				if (jrb41.isSelected())
				{
					jlsampah21.setText("Berfungsi");
				}
				if (jrb42.isSelected())
				{
					jlsampah21.setText("Rusak");
				}
				if (jrb43.isSelected())
				{
					jlsampah22.setText("Dibelakang / Disamping");
				}
				if (jrb44.isSelected())
				{
					jlsampah22.setText("Lainnya");
				}
				if (jrb45.isSelected())
				{
					jlsampah23.setText("Depan & Belakang");
				}
				if (jrb46.isSelected())
				{
					jlsampah23.setText("Lainnya");
				}
				if (jrb47.isSelected())
				{
					jlsampah24.setText("UMM Hotspot");
				}
				if (jrb48.isSelected())
				{
					jlsampah24.setText("Lainnya");
				}
				if (jrb49.isSelected())
				{
					jlsampah25.setText("Ya");
				}
				if (jrb50.isSelected())
				{
					jlsampah25.setText("Tidak");
				}
				
				//cctv.proc();
				
				
				
				
				jta.setText( "Nama Ruang : " +jtf.getText() + "\n\n" +
							"Gedung : " +jcb.getSelectedItem() + "\n\n" +
							"Fakultas : " +jcb2.getSelectedItem() + "\n\n" +
							"Panjang Ruang : " +js.getValue() +  "\n\n" + 
							"Lebar Ruang : " +js2.getValue() + "\n\n" +
							"Jumlah Kursi : " +js3.getValue() + "\n\n" +
							"Jumlah Pintu : " +js4.getValue() + "\n\n" +
							"Jumlah Jendela : " +js5.getValue() + "\n\n" +
							"Kondisi Lantai : " + jlsampah.getText() +"\n\n" +
							"Kondisi Dinding : " + jlsampah2.getText() +"\n\n" +
							"Kondisi Atap : " + jlsampah3.getText() +"\n\n" +
							"Kondisi Pintu : " + jlsampah4.getText() +"\n\n" +
							"Kondisi Jendela : " + jlsampah5.getText() +"\n\n" +
							"Sirkulasi Udara : " + jlsampah6.getText() +"\n\n" +
							"Nilai Pencahayaan : " +js6.getValue() + "\n\n" +
							"Kelembapan : " +js7.getValue() + " %" + "\n\n" +
							"Suhu : " +js8.getValue() + " Celcius" + "\n\n" +
							"Kebisingan : " + jlsampah7.getText() +"\n\n" +
							"Bau : " + jlsampah8.getText() +"\n\n" +
							"Kebocoran : " + jlsampah9.getText() +"\n\n" +
							"Kerusakan : " + jlsampah10.getText() +"\n\n" +
							"Keausan : " + jlsampah11.getText() +"\n\n" +
							"Kekokohan : " + jlsampah12.getText() +"\n\n" +
							"Kunci Pintu : " + jlsampah13.getText() +"\n\n" +
							"Kunci Jendela : " + jlsampah14.getText() +"\n\n" +
							"Keamanan : " + jlsampah15.getText() +"\n\n" +
							"Jumlah Stop Kontak : " +js9.getValue() + "\n\n" +
							"Stop Kontak Kondisi Baik : " +js10.getValue() + "\n\n" +
							"posisi Stop Kontak : " + jlsampah16.getText() +"\n\n" +
							"Jumlah Kabel LCD : " +js11.getValue() + "\n\n" +
							"Kondisi Kabel LCD : " + jlsampah17.getText() +"\n\n" +
							"Posisi Kabel LCD : " + jlsampah18.getText() +"\n\n" +
							"Jumlah Lampu : " +js12.getValue() + "\n\n" +
							"Kondisi Lampu : " +js13.getValue() + "\n\n" +
							"Posisi Lampu : " + jlsampah19.getText() +"\n\n" +
							"Jumlah Kipas Angin : " +js14.getValue() + "\n\n" +
							"Kipas Angin Kondisi Baik : " +js15.getValue() + "\n\n" +
							"Posisi Kipas Angin : " + jlsampah20.getText() +"\n\n" +
							"Jumlah AC : " +js16.getValue() + "\n\n" +
							"Kondisi AC : " + jlsampah21.getText() +"\n\n" +
							"Posisi AC : " + jlsampah22.getText() +"\n\n" +
							"Jumlah CCTV : " +js17.getValue() + "\n\n" +
							"CCTV Kondisi Baik : " +js18.getValue() +"\n\n" +
							"Posisi CCTV : " + jlsampah23.getText() +"\n\n" +
							"SSID : " + jlsampah24.getText() +"\n\n" +
							"Bisa Login / Tidak : " + jlsampah25.getText()
						);
				
				
				
				
				
			}
		});
		
		
		
		/*jp.add(jlsampah);
		jp.add(jlsampah2);
		jp.add(jlsampah3);
		jp.add(jlsampah4);
		jp.add(jlsampah5);*/
		
		jlsampah.setBounds(0, 0, 46, 14);
		jlsampah2.setBounds(0, 0, 46, 14);
		jlsampah3.setBounds(0, 0, 46, 14);
		jlsampah4.setBounds(0, 0, 46, 14);
		jlsampah5.setBounds(0, 0, 46, 14);
		
		
		
		jlsampah.setForeground(SystemColor.control);
		jlsampah2.setForeground(SystemColor.control);
		jlsampah3.setForeground(SystemColor.control);
		jlsampah4.setForeground(SystemColor.control);
		jlsampah5.setForeground(SystemColor.control);
		
		
		
		
		
		setJMenuBar(menuBar);
		
		JButton jblogout = new JButton("New button");
		jblogout.addActionListener(new ActionListener() {
			
			
			
		public void actionPerformed(ActionEvent mustofa) {
			this.setVisible(false); 
			new Login().setVisible(true);
		     javax.swing.JOptionPane.showMessageDialog(null, "Anda Telah Keluar, Silahkan Login Kembali untuk menggunakan");	
		
		}

		private void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

		

		
		});
		menuBar.add(jblogout);
		
		
		
		
		/*jb.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String inputspinner2 = "";
				 Double myDouble2 = (Double) js2.getValue();
				 inputspinner2 = myDouble2.toString();
				 jta2.setText(inputspinner2);
			}	
		});
		
		jb.addActionListener(new ActionListener()
		{				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String inputspinner3 = "";
				 Integer myDouble3 = (Integer) js3.getValue();
				 inputspinner3 = myDouble3.toString();
				 jta3.setText(inputspinner3);
			}
		});
		
		jb.addActionListener(new ActionListener()
		{				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String inputspinner4 = "";
				 Integer myDouble4 = (Integer) js4.getValue();
				 inputspinner4 = myDouble4.toString();
				 jta4.setText(inputspinner4);
			}
		});
		
		jb.addActionListener(new ActionListener()
		{				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String inputspinner5 = "";
				 Integer myDouble5 = (Integer) js5.getValue();
				 inputspinner5 = myDouble5.toString();
				 jta5.setText(inputspinner5);
			}
		});
		
		//jb.addActionListener(new ActionListener()
		//{				
			//public void actionPerformed(ActionEvent e) {
				// String inputteksfield5 = jtf5.getText();
				 //jta5.setText(inputteksfield5);
			//}
		//});
		 */
		
		
		
		
	}	





public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame window = new frame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
}
