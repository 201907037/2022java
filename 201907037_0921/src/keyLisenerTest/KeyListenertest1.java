package keyLisenerTest;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenertest1 extends JFrame{
	JLabel jl;
	
	
	public KeyListenertest1() {
		// TODO Auto-generated constructor stub
		jl = new JLabel("key를 눌러주세요.");
		add("North",jl);
		addKeyListener(new keyadp());
		
		
		setTitle("KeyListenerTest1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(framedimension.FX, framedimension.FX,framedimension.FW, framedimension.FH);
		setVisible(true);
		requestFocus();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenertest1();
	}

	
	class keyadp extends KeyAdapter{
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			jl.setText("문자 키가 눌렸습니다:"+e.getKeyChar());
		}
	}
	

}
