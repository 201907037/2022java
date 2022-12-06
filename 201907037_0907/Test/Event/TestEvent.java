package Test.Event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestEvent extends JFrame implements MouseListener,KeyListener{
	JTextField t1 = new JTextField();
	JButton btn = new JButton("버튼");
	JLabel lbl = new JLabel();
	
	
	
	public TestEvent() {
		// TODO Auto-generated constructor stub
		
		btn.addMouseListener(this);
		t1.addKeyListener(this);
		add("North",t1);
		add("South",btn);
		add("Center",lbl);
		
		setTitle("EventTest연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 500, 400);
		setVisible(true);
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestEvent();
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("텍스트 필드에 키가 눌렸다.");
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("버튼이 클릭 되었습니다.");
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("커서가 버튼 내부로 들어왔다.");
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		lbl.setText("커서가 버튼 외부로 나갔다");
	}

}
