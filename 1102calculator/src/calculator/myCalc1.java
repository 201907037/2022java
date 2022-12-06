package calculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myCalc1 extends JFrame implements KeyListener{
	JLabel jl;
	JButton result;
	JButton[] numpad;
	int flag,flagpoint,cflag;
	String a="";
	String b="";
	Double f,s,r;
	
	
	public myCalc1() {
		// TODO Auto-generated constructor stub
		flag=0;
		flagpoint=0;
		jl = new JLabel(" ");
		JPanel gridpan = new JPanel(new GridLayout(4, 4));
		result = new JButton("=");
		
		Font font = new Font(null, 0, 25);
		Font font1 = new Font(null, 0, 35);
		
		jl.setFont(font1);
		jl.setHorizontalAlignment(JLabel.RIGHT);
		
		result.setFont(font1);
		
		add(jl,BorderLayout.NORTH);
		add(gridpan,"Center");
		add(result,"South");
		
		String[] numstr = {"1","2","3","4","5","6","7","8","9","0",".","C","+","-","*","/"};
		numpad = new JButton[numstr.length];
		for(int i=0;i<numstr.length;i++) {
			numpad[i] = new JButton(numstr[i]);
			numpad[i].setFont(font);
			gridpan.add(numpad[i]);
			numpad[i].addActionListener(acl);
		}
		result.addActionListener(acl);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				Component con = (Component)e.getSource();
				con.setFocusable(true);
				con.requestFocus();
				super.mouseClicked(e);
			}
		});
		addKeyListener(this);
		
		
		setTitle("계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 400, 500);
		setVisible(true);
		setFocusable(true);
		requestFocus();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myCalc1();
	}

	ActionListener acl = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			
			switch (e.getActionCommand()) {
			case "1":{
				if(flag==0) {
					a+=1;
					jl.setText(a);
				}else {
					b+=1;
					jl.setText(b);
				}
			}
				break;
			case "2":{
				if(flag==0) {
					a+=2;
					jl.setText(a);
				}else {
					b+=2;
					jl.setText(b);
				}
			}
				break;
			case "3":{
				if(flag==0) {
					a+=3;
					jl.setText(a);
				}else {
					b+=3;
					jl.setText(b);
				}
			}
				break;
			case "4":{
				if(flag==0) {
					a+=4;
					jl.setText(a);
				}else {
					b+=4;
					jl.setText(b);
				}
			}
				break;
			case "5":{
				if(flag==0) {
					a+=5;
					jl.setText(a);
				}else {
					b+=5;
					jl.setText(b);
				}
			}
				break;
			case "6":{
				if(flag==0) {
					a+=6;
					jl.setText(a);
				}else {
					b+=6;
					jl.setText(b);
				}
			}
				break;
			case "7":{
				if(flag==0) {
					a+=7;
					jl.setText(a);
				}else {
					b+=7;
					jl.setText(b);
				}
			}
				break;
			case "8":{
				if(flag==0) {
					a+=8;
					jl.setText(a);
				}else {
					b+=8;
					jl.setText(b);
				}
			}
				break;
			case "9":{
				if(flag==0) {
					a+=9;
					jl.setText(a);
				}else {
					b+=9;
					jl.setText(b);
				}
			}
				break;
			case "0":{
				if(flag==0) {
					a+=0;
					jl.setText(a);
				}else {
					b+=0;
					jl.setText(b);
				}
			}
				break;
			case ".":{
			
				if(flag==0) {
					if(flagpoint==1)
						break;
					else {
						flagpoint=1;
						a+=".";
						jl.setText(a);
					}
				}
				else {
					if(flagpoint==1)
						break;
					else {
						flagpoint=1;
						b+=".";
						jl.setText(b);
					}
				}
				
			}
				break;
			case "C":{
				a="";
				b="";
				jl.setText(" ");
				flag=0;
				flagpoint=0;
			}
				break;
			case "+":{
				f=Double.parseDouble(a);
				cflag=1;
				flag=1;
				flagpoint=0;
				jl.setText(" ");
			}
				break;
			case "-":{
				f=Double.parseDouble(a);
				cflag=2;
				flag=1;
				flagpoint=0;
				jl.setText(" ");
			}
				break;
			case "*":{
				f=Double.parseDouble(a);
				cflag=3;
				flag=1;
				flagpoint=0;
				jl.setText(" ");
			}
				break;
			case "/":{
				f=Double.parseDouble(a);
				cflag=4;
				flag=1;
				flagpoint=0;
				jl.setText(" ");
			}
				break;
			case "=":
			{
				s=Double.parseDouble(b);
				switch (cflag) {
				case 1:{
					r=f+s;
					jl.setText(r+"");
				}
					break;
				case 2:{
					r=f-s;
					jl.setText(r+"");
				}
					break;
				case 3:{
					r=f*s;
					jl.setText(r+"");
				}
					break;
				case 4:{
					if(s==0) {
						jl.setText("0으로 나눌 수 없습니다.");
						break;
					}
					else {
						r=f/s;
						jl.setText(r+"");
					}
				}
					break;

				default:
					break;
				}
			}
				break;
			default:
				break;
			}
		}
	};


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_NUMPAD0:{
			if(flag==0) {
			a+=0;
			jl.setText(a);
			}
			else {
				b+=0;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD1:{
			if(flag==0) {
				a+=1;
				jl.setText(a);
			}
			else {
				b+=1;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD2:{
			if(flag==0) {
				a+=2;
				jl.setText(a);
			}
			else {
				b+=2;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD3:{
			if(flag==0) {
				a+=3;
				jl.setText(a);
			}
			else {
				b+=3;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD4:{
			if(flag==0) {
				a+=4;
				jl.setText(a);
			}
			else {
				b+=4;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD5:{
			if(flag==0) {
				a+=5;
				jl.setText(a);
			}
			else {
				b+=5;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD6:{
			if(flag==0) {
				a+=6;
				jl.setText(a);
			}
			else {
				b+=6;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD7:{
			if(flag==0) {
				a+=7;
				jl.setText(a);
			}
			else {
				b+=7;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD8:{
			if(flag==0) {
				a+=8;
				jl.setText(a);
			}
			else {
				b+=8;
				jl.setText(b);
			}
		}
			break;
		case KeyEvent.VK_NUMPAD9:{
			if(flag==0) {
				a+=9;
				jl.setText(a);
			}
			else {
				b+=9;
				jl.setText(b);
			}
		}
			break;
		case 107:
		{
			f=Double.parseDouble(a);
			cflag=1;
			flag=1;
			flagpoint=0;
			jl.setText(" ");
		}
			break;
		case 109:
		{
			f=Double.parseDouble(a);
			cflag=2;
			flag=1;
			flagpoint=0;
			jl.setText(" ");
		}
			break;
		case 106:
		{
			f=Double.parseDouble(a);
			cflag=3;
			flag=1;
			flagpoint=0;
			jl.setText(" ");
		}
			break;
		case 111:
		{
			f=Double.parseDouble(a);
			cflag=4;
			flag=1;
			flagpoint=0;
			jl.setText(" ");
		}
			break;
		case 110:
		{
			if(flag==0) {
				if(flagpoint==1)
					break;
				else {
					flagpoint=1;
					a+=".";
					jl.setText(a);
				}
			}
			else {
				if(flagpoint==1)
					break;
				else {
					flagpoint=1;
					b+=".";
					jl.setText(b);
				}
			}
		}
			break;
		case 27:
		{
			a="";
			b="";
			jl.setText(" ");
			flag=0;
			flagpoint=0;
		}
			break;
		case 10:
		{
			s=Double.parseDouble(b);
			switch (cflag) {
			case 1:{
				r=f+s;
				jl.setText(r+"");
			}
				break;
			case 2:{
				r=f-s;
				jl.setText(r+"");
			}
				break;
			case 3:{
				r=f*s;
				jl.setText(r+"");
			}
				break;
			case 4:{
				if(s==0) {
					jl.setText("0으로 나눌 수 없습니다.");
					break;
				}
				else {
					r=f/s;
					jl.setText(r+"");
				}
			}
			break;
		default:
			break;
					}
				}
			}
		}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
