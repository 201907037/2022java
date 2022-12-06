package mousetest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class madp extends MouseAdapter {
	JLabel jl;
	
	public madp(JLabel jl) {
		super();
		this.jl = jl;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		jl.setText("좌표:"+e.getX()+","+e.getY());
		super.mouseMoved(e);
	}
}
