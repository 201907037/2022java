package keyTest;

import java.awt.Button;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class keytest1 extends JFrame implements KeyListener{
	public static final int wx=400;
	public static final int wy=400;
	public static final int wW=800;
	public static final int wH=700;
	int x,y;
	JLabel jl;
	Button btn;
	
	public keytest1() {
		// TODO Auto-generated constructor stub
		btn = new Button("버튼");
		jl=new JLabel("키 입력하세요.");
		add("North",jl);
		addKeyListener(this);
		
		
		
		
		setTitle("key리스너 테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(wx, wy, wW, wH);
		setVisible(true);
		requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new keytest1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("키:"+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("키를 눌렀다"+e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("키를 땠다"+e.getKeyText(e.getKeyCode()));
	}

}
