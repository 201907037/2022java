package Test.List;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListTest extends JFrame {
	
	public JListTest() {
		setLayout(new FlowLayout());
		
		String[] items = {"사과","배","참외","포도"};
		JLabel lbl = new JLabel("과일 선택:");
		JList<String> jl = new JList<String>(items);
		
		add(lbl);
		add(jl);
		
		setTitle("JList연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150 , 300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListTest();
	}

}
