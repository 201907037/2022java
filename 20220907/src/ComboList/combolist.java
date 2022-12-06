package ComboList;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class combolist extends JFrame {

	
	public combolist() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		String[] str = {"사과","배","치킨","피자"};
		JList<String> jl = new JList<String>(str);
		JComboBox<String> jcb = new JComboBox<String>(str);
		
		pan.add(jl);pan.add(jcb);
		
		add(BorderLayout.NORTH,pan);
		
		
		setTitle("콤보 리스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,300,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new combolist();
	}

}
