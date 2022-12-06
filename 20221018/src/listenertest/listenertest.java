package listenertest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class listenertest extends JFrame implements ItemListener{
	JButton jb1,jb2,jb3;
	JLabel jl;
	JTextField jt1,jt2,jt3,jt4;
	JTextArea jta;
	JButton[] btn;
	JMenuItem[] jmi;
	JCheckBox[] cb;
	String[] jcstr= {"확인","가능","불가능","연체"};
	String[] jlstr = {"선택","ㄱ","ㄴ","ㄷ"};
	JComboBox<String> jcb;
	JRadioButton[] jrb;
	JList<String> jli;
	
	public listenertest() {
		// TODO Auto-generated constructor stub
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel(new GridLayout(3,4));
		
		
		pan.setBackground(Color.blue);
		pan2.setBackground(Color.yellow);
		pan3.setBackground(Color.cyan);
		
		
		JToolBar tool = new JToolBar();
		getContentPane().add("North",tool);
//		getContentPane().setBackground(Color.blue);
		String[] bstr = {"도구","삭제","삽입"};
		btn = new JButton[bstr.length];
		for(int i=0;i<bstr.length;i++) {
			btn[i] = new JButton(bstr[i]);
			tool.add(btn[i]);
			btn[i].addActionListener(new ac());
		}
		
		JMenuBar bar = new JMenuBar();
		JMenu me1 = new JMenu("파일");
		JMenu me2 = new JMenu("help");
		String[] mstr = {"저장하기","열기","닫기","도움말 열기"};
		jmi = new JMenuItem[mstr.length];
		for(int i=0;i<mstr.length;i++) {
			jmi[i] = new JMenuItem(mstr[i]);
			if(i<3) {
				me1.add(jmi[i]);
			}
			else
				me2.add(jmi[i]);
			jmi[i].addActionListener(new ac());
		}
		bar.add(me1);bar.add(me2);
		String[] rbstr = {"남성","여성","둘다아님","나도모름"};
		jrb = new JRadioButton[rbstr.length];
		ButtonGroup bg = new ButtonGroup();
		for(int i =0;i<rbstr.length;i++) {
			jrb[i] = new JRadioButton(rbstr[i]);
			bg.add(jrb[i]);
			pan3.add(jrb[i]);
			jrb[i].addItemListener(this);
		}
		
		String[] chstr = {"바나나","사과","키위","배"};
		cb = new JCheckBox[chstr.length];
		for(int i = 0;i<chstr.length;i++) {
			cb[i] = new JCheckBox(chstr[i]);
			pan3.add(cb[i]);
			cb[i].addItemListener(this);
		}
		Font font = new Font(Font.SERIF, Font.ITALIC, 30);
		jcb = new JComboBox<String>(jcstr);
		jli = new JList<String>(jlstr);
//		jb1 = new JButton("버튼1");
//		jb2 = new JButton("버튼2");
//		jb3 = new JButton("버튼3");
		jl = new JLabel("ㅎㅇ");
		jt1 = new JTextField(15);
		jt2 = new JTextField(15);
		jt4 = new JTextField(15);
		jt3 = new JTextField(15);
		jta = new JTextArea(40,10);
		
		jl.setBackground(Color.green);
		jl.setOpaque(true);
		jl.setForeground(Color.red);
		jl.setFont(font);
		
//		jb1.addMouseListener(new acl());
//		jb2.addActionListener(new mal(jb2,jl));
		addKeyListener(keyadp);
		jcb.addItemListener(this);
		jli.addMouseListener(new acl());
		addMouseMotionListener(new mmo(jl));
//		jb3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				jt3.setText("버튼3 이 눌렸음");
//			}
//			
//		});
		
//		pan.add(jb1);pan.add(jb2);pan.add(jb3);
		pan2.add(jt1);pan2.add(jt2);pan2.add(jt3);pan2.add(jt4);
		setJMenuBar(bar);
		pan3.add(jcb);pan3.add(jli);
		
//		add(BorderLayout.NORTH,pan);
		add("Center",pan2);
		add("West",pan3);
		add(BorderLayout.EAST,jta);
		add(BorderLayout.SOUTH,jl);
		
		setTitle("연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,300,1500,500);
		setVisible(true);
		requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new listenertest();
	}
	
	
	KeyAdapter keyadp = new KeyAdapter() {
		public void keyPressed(java.awt.event.KeyEvent e) {
			jt1.setText(e.getKeyText(e.getKeyCode())+"가 눌렸습니다.");
		};
		public void keyTyped(java.awt.event.KeyEvent e) {
			jt1.setText(e.getKeyChar()+"");
		};
	
	};
	
	class ac implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jt2.setText(e.getActionCommand());
		}
		
	}
		
	
	class acl implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jb1)
				jl.setText("버튼 눌림");
			else if(e.getSource()==jli) {
				int selectitem = jli.getSelectedIndex();
				jl.setText(jlstr[selectitem]);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource()==cb[0]) {
//			jt4.setText(cb[0].getText()+"가 선택됨");
//		}
//		else if(e.getSource()==cb[1]) {
//			jt4.setText(cb[1].getText()+"가 선택됨");
//		}
//		else if(e.getSource()==cb[2]) {
//			jt4.setText(cb[2].getText()+"가 선택됨");
//		}
//		else {
//			jt4.setText(cb[3].getText()+"가 선택됨");
//		}
		requestFocus();
		jta.setText("");
		for(JCheckBox jcb: cb) {
			if(jcb.isSelected()==true) {
				jta.append(">>"+jcb.getText()+">>");
			}
		}
		
		if(e.getSource()==jcb) {
			jt1.setText(jcstr[jcb.getSelectedIndex()]+"");
		}
		else {
			if(jrb[0].isSelected()) {
				jt1.setText(jrb[0].getText());
			}
			else if(jrb[1].isSelected()) {
				jt1.setText(jrb[1].getText());
			}
			else if(jrb[2].isSelected()) {
				jt1.setText(jrb[2].getText());
			}
			else {
				jt1.setText(jrb[3].getText());
			}
		}
		
		
	}
}
