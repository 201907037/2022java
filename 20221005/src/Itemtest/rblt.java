package Itemtest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class rblt extends JFrame implements KeyListener{
	JRadioButton r1,r2;
	JLabel jl1;
	JLabel jl2;

	public rblt() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		JPanel pan1 = new JPanel();
		jl1 = new JLabel("ㅎㅇ");
		jl2 = new JLabel("아아아");
		r1 = new JRadioButton("일번");
		r2 = new JRadioButton("이번");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);bg.add(r2);
		pan.add(r1);pan.add(r2);
		pan1.add(jl1);pan1.add(jl2);
		
		r1.addItemListener(new rbil(r1, r2, jl1));
		r2.addItemListener(new rbil(r1, r2, jl1));
		addKeyListener(this);
		
		add("North",pan1);
		add("Center",pan);
		
		
		setTitle("TEST");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 400, 300, 300);
		setVisible(true);
		requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new rblt();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		jl2.setText("눌린 키는 "+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		jl2.setText("눌린 키는 "+e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		jl2.setText("제거된 키는 "+e.getKeyText(e.getKeyCode()));
	}

}
