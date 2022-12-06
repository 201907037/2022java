package keyLisenerTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class evenmove extends JFrame implements KeyListener{
	JLabel jl;
	int x=framedimension.FW/2-W,y=framedimension.FW/2-H;
	public static final int W=60;
	public static final int H=70;
	ImageIcon imageL,imageR,imageU,imageD;
	
	public evenmove() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		// TODO Auto-generated constructor stub
		setLayout(null);
		imageL = new ImageIcon("imgs/walk1.jpg");
		imageR = new ImageIcon("imgs/walk2.jpg");
		imageU = new ImageIcon("imgs/walkU.jpg");
		imageD = new ImageIcon("imgs/walkD.jpg");
		jl=new JLabel(imageL);
		jl.setBounds(x, y, W,H );
		add(jl);
		addKeyListener(this);
		
		
		
		setTitle("KeyListenerTest1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(framedimension.FX, framedimension.FY,framedimension.FW, framedimension.FH);
		setVisible(true);
		requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new evenmove();
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			jl.setIcon(imageU);
			if (y>0) {
				x=jl.getX();
				y=jl.getY()-10;	
				
			}
			else {
				break;
			}
			break;
		case KeyEvent.VK_DOWN:
			jl.setIcon(imageD);
			if (y<framedimension.FH-jl.getHeight()-40) {
				x=jl.getX();
				y=jl.getY()+10;
			}
			else {
				break;
			}
			break;	
		case KeyEvent.VK_RIGHT:
			jl.setIcon(imageR);
			if (x<framedimension.FW-jl.getWidth()-10) {
				x=jl.getX()+10;
				y=jl.getY();
			}
			else {
				break;
			}
			
			break;	
		case KeyEvent.VK_LEFT:
			jl.setIcon(imageL);
			if (x>0) {
				x=jl.getX()-10;
				y=jl.getY();
			}
			else {
				break;
			}
			
			break;	
		default:
			break;
		}
		jl.setLocation(x, y);	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
