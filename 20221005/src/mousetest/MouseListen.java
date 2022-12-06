package mousetest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListen extends JFrame {
	JLabel jl;
	public MouseListen() {
		// TODO Auto-generated constructor stub
		jl = new JLabel("마우스 리스너");
		add("North",jl);
		addMouseListener(ml);
		
		setTitle("마우스리스너");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 400, 600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListen();
	}

	MouseListener ml = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 off");
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 눌림");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 나감");
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 들어감");
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 클릭");
		}
	};
}
