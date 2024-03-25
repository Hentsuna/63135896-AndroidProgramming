package ntu_63135896;

import java.awt.EventQueue;
import java.awt.Font;
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
		lblNewLabel.setBounds(36, 56, 56, 24);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(102, 60, 96, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblRng = new JLabel("Độ rộng:");
		lblRng.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRng.setBounds(36, 91, 81, 30);
		contentPane.add(lblRng);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(102, 98, 96, 20);
		contentPane.add(txt2);
		
		JButton btnA = new JButton("Vẽ");
		btnA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnA.setBounds(288, 60, 103, 43);
		contentPane.add(btnA);
	}

}
