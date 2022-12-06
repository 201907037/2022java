package keyTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class keytest2 extends JFrame implements KeyListener{
	public static final int wx=200;
	public static final int wy=200;
	public static final int wW=1000;
	public static final int wH=700;
	int x,y;
	JLabel jl;
	Button btn;
	
	public keytest2() {
		setLayout(null);
		// TODO Auto-generated constructor stub
		btn = new Button();
		jl=new JLabel("키 입력하세요.");
		btn.setSize(100, 70);
		btn.setLocation(0, 0);
		btn.setBackground(Color.green);
		jl.setLocation(50, 50);
		jl.setSize(80, 80);
		add(btn);
		add(jl);
		addKeyListener(this);
		
		
		
		
		setTitle("key리스너 테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(wx, wy, wW, wH);
		setVisible(true);
		requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new keytest2();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
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
			if (y<wH) {
				x=btn.getX();
				y=btn.getY()+10;
			}else {
				break;
			}
			
			break;
		case KeyEvent.VK_RIGHT:
			if (x<wW) {
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
			}else {
				break;
			}
			
			break;

		default:
			break;
		}
		btn.setLocation(x, y);
		jl.setText(btn.getX()+","+btn.getY());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
