package keyLisenerTest;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class keyadt extends KeyAdapter {
	JLabel jl;
	
	

	public keyadt(JLabel jl) {
		this.jl = jl;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		jl.setText("문자 키가 눌렸습니다:"+e.getKeyChar());
	}

//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		jl.setText("키가 눌렸습니다:"+e.getKeyText(e.getKeyCode()));
//	}

//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		jl.setText("키가 해제 됬습니다:"+e.getKeyText(e.getKeyCode()));
//	}

}
