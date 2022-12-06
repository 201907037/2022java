package ActionListener;



import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class ActionListenerTest extends JFrame implements ActionListener{
	JLabel jl;
	TextField t1,t2;
	JLabel jl1;
	JButton btn1,btn2;
	Font f;
	
	public ActionListenerTest() {
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		jp3.setLayout(new GridLayout(1, 2));
		jl = new JLabel("String Connection");
		jl1 = new JLabel("키보드 입력 확인");
		f = jl.getFont();
		btn1 = new JButton("합성");
		btn2 = new JButton("리셋");
		t1 = new TextField(20);
		t2 = new TextField(20);
		
		
		jp1.add(btn1);jp1.add(btn2);
		jp2.add(t1);jp2.add(t2);
		jp3.add(jl);jp3.add(jl1);	
		add("North",jp1);
		add("Center",jp2);
		add("South",jp3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		addKeyListener(new keyadapt());
		
		setTitle("0928연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,300,700,700);
		setVisible(true);
		requestFocus();
		
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionListenerTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1) {
			String a,b ;
			a= t1.getText();
			b= t2.getText();
			Font font = new Font("맑은 고딕",Font.BOLD,15);
			jl.setFont(font);
			jl.setForeground(Color.WHITE);
			jl.setBackground(Color.black);
			jl.setOpaque(true);
			jl.setText("합친 결과는 "+a+b+"입니다.");
			requestFocus();
		}
		else
		{
			t1.setText("");
			t2.setText("");
			jl.setFont(f);
			jl.setForeground(Color.black);
			jl.setBackground(Color(238,238,238));;
			jl.setOpaque(true);
			jl.setText("String Connect");
			jl1.setBackground(Color(238,238,238));
			jl1.setForeground(Color.black);
			jl1.setText("키보드 입력 확인");
			requestFocus();
		}
	}

	
	private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}


	class keyadapt extends KeyAdapter{
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			jl1.setText("키"+e.getKeyChar()+"가 눌렸습니다.");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			switch (e.getKeyCode()) {
			case KeyEvent.VK_F1:
				jl1.setForeground(Color.red);
				jl1.setBackground(Color.green);
				jl1.setOpaque(true);
				break;
			case KeyEvent.VK_F2:
				jl1.setForeground(Color.blue);
				jl1.setBackground(Color.yellow);
				jl1.setOpaque(true);
			default:
				break;
			}
			jl1.setText("키:"+e.getKeyText(e.getKeyCode())+"눌렸습니다.");
		}

	}
	
	
}
