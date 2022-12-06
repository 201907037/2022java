package keyLisenerTest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenertest2 extends JFrame implements KeyListener {
	JLabel jl;
	
	
	public KeyListenertest2() {
		// TODO Auto-generated constructor stub
		jl = new JLabel("key를 눌러주세요.");
		add("North",jl);
		addKeyListener(this);
		
		
		setTitle("KeyListenerTest1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(framedimension.FX, framedimension.FX,framedimension.FW, framedimension.FH);
		setVisible(true);
		requestFocus();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenertest2();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("문자 키가 눌렸습니다:"+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("키가 눌렸습니다:"+e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("키가 해제 됬습니다:"+e.getKeyText(e.getKeyCode()));
	}

}
