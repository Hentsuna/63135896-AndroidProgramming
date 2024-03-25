package ntu_63135896;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private final ButtonGroup b = new ButtonGroup();
	

	/**
	 * Create the frame.
	 */
	public ManHinhChinh() {
		setTitle("App Vẽ Hình");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton nutA = new JRadioButton("Hình vuông");
		b.add(nutA);
		nutA.setBounds(71, 0, 96, 43);
		contentPane.add(nutA);
		
		JRadioButton nutB = new JRadioButton("Hình tròn");
		b.add(nutB);
		nutB.setBounds(169, 0, 96, 43);
		contentPane.add(nutB);
		
		JRadioButton nutC = new JRadioButton("Hình elip");
		b.add(nutC);
		nutC.setBounds(267, 5, 86, 33);
		contentPane.add(nutC);
		
		JLabel lblNewLabel = new JLabel("Độ dài:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(36, 46, 56, 24);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(102, 50, 96, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblRng = new JLabel("Độ rộng:");
		lblRng.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRng.setBounds(25, 73, 81, 30);
		contentPane.add(lblRng);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(102, 81, 96, 20);
		contentPane.add(txt2);
		
		JButton btnA = new JButton("Vẽ");
		btnA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Lấy giá trị độ dài độ rộng
				int soA = Integer.parseInt(txt1.getText());
				int soB = Integer.parseInt(txt2.getText());
				//class để vẽ hình học
				Graphics g = contentPane.getGraphics();
				//Xoá hình cũ khi vẽ hình mới
				g.clearRect(130, 130, 500, 500);
				//Xử lí chọn vẽ hình nào
				if(nutA.isSelected()) {
					g.drawRect(150, 150, soA, soB);
				}
				if(nutB.isSelected() && soA == soB) {
					g.drawOval(150, 150, soA, soB);
				}
				if(nutC.isSelected()){
					g.drawOval(150, 150, soA, soB);
				}
				
			}
			
		});
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnA.setBounds(287, 78, 103, 43);
		contentPane.add(btnA);
		
		JLabel lblNewLabel_1 = new JLabel("Ghi chú: Độ dài, rộng 50 bằng 1cm");
		lblNewLabel_1.setBounds(25, 108, 233, 24);
		contentPane.add(lblNewLabel_1);
	}
}
