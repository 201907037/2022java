package keyLisenerTest;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class keycodeTest2 extends JFrame implements KeyListener{
	int keycode,x,y;
	JButton btn;
	public static final int W=100; //상수
	public static final int H=50;
	
	public keycodeTest2() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		btn = new JButton("버튼");
		btn.setLocation(x, y);
		btn.setSize(W, H);
		add(btn);
		addKeyListener(this);
		
		setTitle("KeyListenerTest1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(framedimension.FX, framedimension.FY,framedimension.FW, framedimension.FH);
		setVisible(true);
		requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new keycodeTest2();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			if (y>0) {
				x=btn.getX();
				y=btn.getY()-10;	
				
			}
			else {
				break;
			}
			break;
		case KeyEvent.VK_DOWN:
			if (y<framedimension.FH-btn.getHeight()-40) {
				x=btn.getX();
				y=btn.getY()+10;
			}
			else {
				break;
			}
			break;	
		case KeyEvent.VK_RIGHT:
			if (x<framedimension.FW-btn.getWidth()-10) {
				x=btn.getX()+10;
				y=btn.getY();
			}
			else {
				break;
			}
			
			break;	
		case KeyEvent.VK_LEFT:
			if (x>0) {
				x=btn.getX()-10;
				y=btn.getY();
			}
			else {
				break;
			}
			
			break;	
		case KeyEvent.VK_F1:
			btn.setBackground(Color.gray);
			break;	
		case KeyEvent.VK_F2:
			btn.setBackground(Color.red);
			break;	
		default:
			break;
		}
		btn.setLocation(x, y);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
