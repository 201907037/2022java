package Itemtest;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class itemtest extends JFrame {
	JLabel jl;
	JRadioButton[] rb;
	JTextArea ta;
	
	
	public itemtest() {
		// TODO Auto-generated constructor stub
		Font font = new Font(null,Font.CENTER_BASELINE,25);
		ButtonGroup bg = new ButtonGroup();
		JPanel pan = new JPanel();
		
		
		jl = new JLabel("과일 선택");
		jl.setFont(font);
		jl.setForeground(Color.gray);
		jl.setBackground(Color.white);
		jl.setOpaque(true);
		
		String[] str = {"사과","포도","배"};
		rb = new JRadioButton[str.length];
		ta = new JTextArea();
		for(int i=0;i<str.length;i++) {
			rb[i] = new JRadioButton(str[i]);
			bg.add(rb[i]);
			pan.add(rb[i]);
			rb[i].addItemListener(il);
		}
		add("North",jl);
		add("Center",ta);
		add("South",pan);
		
		
		
		setTitle("아이템 리스너");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		setVisible(true);
	}
	
	ItemListener il = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			ta.setText("");
			for(JRadioButton radio:rb) {
				if(radio.isSelected()) {
					ta.append("<<"+radio.getText()+">>\n");
				}
			}
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new itemtest();
	}
	
}
