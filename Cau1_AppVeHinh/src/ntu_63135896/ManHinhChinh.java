package ntu_63135896;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	}

}
