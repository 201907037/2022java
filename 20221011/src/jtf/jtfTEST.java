package jtf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jtfTEST extends JFrame implements KeyListener {
	JTextField jf1 , jf2;
	JLabel jl;
	int c;
	String u;
	
	
	public jtfTEST() {
		// TODO Auto-generated constructor stub
		JPanel pan1 = new JPanel();
		JLabel s1 = new JLabel("수1 : ");
		JLabel s2 = new JLabel("수2 : ");
		JButton btn = new JButton("입력 완료");
		jl = new JLabel("답 : ");
		jf1 = new JTextField(15);
		jf2 = new JTextField(15);
		
		addKeyListener(this);
		btn.addActionListener(new acl());
		
		pan1.add(s1);pan1.add(jf1);pan1.add(s2);pan1.add(jf2);
		
		add("North",pan1);
		add("Center",btn);
		add("South",jl);
	
		setTitle("jtfTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(dimensofjtf.x, dimensofjtf.y, dimensofjtf.w, dimensofjtf.h);
		setVisible(true);
		requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jtfTEST();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int a,b;
		
		a=Integer.parseInt(jf1.getText());
		b=Integer.parseInt(jf2.getText());
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
//		case KeyEvent.VK_ENTER:{
//			jl.setText(a+u+b+"="+c);
//		}
//			break;
		case KeyEvent.VK_PLUS:
		{	u=" + ";
			c=a+b;
			jl.setText(a+u+b+"="+c);
		}
			break;
		case KeyEvent.VK_MINUS:
		{
			u=" - ";
			c=a-b;
			jl.setText(a+u+b+"="+c);
		}
			break;
		case KeyEvent.VK_MULTIPLY:
		{
			u=" X ";
			c=a*b;
			jl.setText(a+u+b+"="+c);
		}
			break;
		case KeyEvent.VK_A:
		{
			if(b!=0) {
				u="/";
				c=a/b;
				jl.setText(a+u+b+"="+c);
			}
			else
				jl.setText("0으로 나눌 수 없습니다.");
		}
			break;
		default:
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	ActionListener acl = new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			requestFocus();
//		}
//	};
	
	class acl implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		requestFocus();
	}
		
	}

}
