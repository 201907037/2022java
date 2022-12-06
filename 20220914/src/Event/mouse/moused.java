package Event.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class moused implements MouseMotionListener {
	JLabel jl;
	
	
	

	public moused(JLabel jl) {
		
		this.jl = jl;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		jl.setText("마우스 드래그"+e.getX()+","+e.getY()+"하였다");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		jl.setText("마우스 움직였다"+e.getX()+","+e.getY()+"로");
	}

}
