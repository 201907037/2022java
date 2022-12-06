package mousetest;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class madapter extends JFrame {
	JLabel jl;
	
	public madapter() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		pan.setBackground(Color.CYAN);
		jl = new JLabel("마우스 adapter");
		Font font = new Font("맑은 고딕",Font.ITALIC|Font.BOLD,25);
		jl.setFont(font);
		jl.setForeground(Color.gray);
		
		pan.add(jl);
		add("North",pan);
		addMouseListener(ma);
		addMouseListener(new madapt());
		addMouseListener(new MouseAdapter(){
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				jl.setText("마우스 나감");
				super.mouseExited(e);
			}
		});
		addMouseMotionListener(new madp(jl));
		
		
		
		setTitle("마우스리스너");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 400, 600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new madapter();
	}
	
	MouseAdapter ma = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 클릭");
			super.mouseClicked(e);
		}
	};
	
	class madapt extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			jl.setText("마우스 down");
			super.mousePressed(e);
		}
	}
}
