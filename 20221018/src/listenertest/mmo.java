package listenertest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class mmo implements MouseMotionListener {
	JLabel jl;
	public mmo(JLabel jl) {
		super();
		this.jl = jl;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		jl.setText("좌표("+e.getX()+","+e.getY()+")");
	}

}
