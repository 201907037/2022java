package Test1;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FinalTest extends JFrame {
	
	public FinalTest() {
		String[] un = {"이름:","비밀번호:","성별:","취미:"};
		String[] pann = {"North","Center","South"};
		String[] hob = {"축구","농구","야구"};
		String[] gen = {"남성","여성"};
		JLabel[] jb = new JLabel[un.length];
		JPanel[] pan = new JPanel[pann.length];
		JRadioButton[] rb = new JRadioButton[gen.length];
		ButtonGroup bg = new ButtonGroup();
		JCheckBox[] jc = new JCheckBox[hob.length];
		JTextField t1 = new JTextField(10);
		JPasswordField t2 = new JPasswordField(10);
		
		for (int i = 0; i < pann.length; i++) {
			pan[i]= new JPanel();
			add(pann[i],pan[i]);
			jc[i]= new JCheckBox(hob[i]);
		}
		for (int i = 0; i < un.length; i++) {
			jb[i]= new JLabel(un[i]);
		}
		for (int i = 0; i < gen.length; i++) {
			rb[i] = new JRadioButton(gen[i]);
			bg.add(rb[i]);
		}
		
		pan[0].add(jb[0]);pan[0].add(t1);pan[0].add(jb[1]);pan[0].add(t2);
		pan[1].add(jb[2]);pan[1].add(rb[0]);pan[1].add(rb[1]);
		pan[2].add(jb[3]);pan[2].add(jc[0]);pan[2].add(jc[1]);pan[2].add(jc[2]);
		
		
		setTitle("FinalTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 150, 400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new FinalTest();
	}

}
