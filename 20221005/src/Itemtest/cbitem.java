package Itemtest;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cbitem extends JFrame {
	JLabel jl;
	JCheckBox cb1,cb2,cb3;
	
	public cbitem() {
		// TODO Auto-generated constructor stub
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		JPanel p2 = new JPanel();
		jl = new JLabel("책을 선택");
		jl.setBackground(Color.yellow);
		jl.setForeground(Color.blue);
		jl.setOpaque(true);
		
		cb1 = new JCheckBox("책");
		cb2 = new JCheckBox("북");
		cb3 = new JCheckBox("아악");
		cb1.addItemListener(new il());
		cb2.addItemListener(new il());
		cb3.addItemListener(new il());
		
		p1.add(jl);
		p2.add(cb1);p2.add(cb2);p2.add(cb3);
		
		add("North",p1);
		add("South",p2);
		
		setTitle("che");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400,400,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new cbitem();
	}
	
	class il implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==cb1) {
				if(cb1.isSelected()==false)
					jl.setText("책 해제");
				else
					jl.setText("책이 선택");
			}
			else if(e.getSource()==cb2) {
				if(cb2.isSelected()==false)
					jl.setText("북 해제");
				else
					jl.setText("북 선택");
				
			}
			else {
				if(cb3.isSelected()==false)
					jl.setText("아악 해제");
				else
					jl.setText("아악");
			}
		}
		
	}

}
