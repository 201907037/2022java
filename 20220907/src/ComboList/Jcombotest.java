package ComboList;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jcombotest extends JFrame {
	
	public Jcombotest() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		JLabel jl = new JLabel();
		JTextField jf = new JTextField(10);
		String[] str = {"과자","사과","배"};
		JComboBox<String> jc = new JComboBox<String>(str);
		jl.setText("목록: ");
		setLayout(new FlowLayout());
		add(pan);
		pan.add(jl);pan.add(jc);pan.add(jf);
		
		
		
		
		
		
		setTitle("JList연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 300, 600, 600);
		setVisible(true);
	
	
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jcombotest();
	}

}
