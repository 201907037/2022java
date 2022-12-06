package Event.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mousetest extends JFrame{
		JLabel jl = new JLabel("시작");
		JButton jb = new JButton("버튼");
	public mousetest() {
		JPanel jp = new JPanel();
		add("North",jp);
		jp.add(jl);
		jp.add(jb);
		addMouseMotionListener(new MouseMotionListener() {
			
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
				
			
		});
		jb.addMouseListener(new mouseli());
		// TODO Auto-generated constructor stub
		
		setTitle("이벤트 드리븐 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 150, 400, 150);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mousetest();
	}

	class mouseli implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			jb.setText("클릭");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			jb.setText("누름");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
	
			jb.setText("제거");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		
			jb.setText("들감");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
			jb.setText("나감");
		}
		
	}


}
