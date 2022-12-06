package testest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class jcrolltest extends JFrame {

	public jcrolltest() {
		// TODO Auto-generated constructor stub
		JTextField jtf = new JTextField("ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t"+"ㅇ"+"\t");
	JScrollPane scroll = new JScrollPane(jtf);
	
	add(scroll);
	
	setTitle("그없");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(300, 300, 300, 300);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jcrolltest();
	}	

}
