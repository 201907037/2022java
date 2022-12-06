package toolbartest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class tooltest extends JFrame implements ActionListener{
	JButton[] jb;
	String[] bstr = {"십자 드라이버","전동드릴","일자 드라이버","장도리"};
	JMenuItem[] jmi;
	JLabel jl;
	public tooltest() {
		// TODO Auto-generated constructor stub
		JMenuBar bar = new JMenuBar();
		
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("관리");
		
		String[] mstr = {"저장","열기","닫기","보내기"};
		jmi = new JMenuItem[mstr.length];
		for(int a=0;a<mstr.length;a++) {
			jmi[a] = new JMenuItem(mstr[a]);
			if(a<2)
				menu1.add(jmi[a]);
			else
				menu2.add(jmi[a]);
			jmi[a].addActionListener(this);
		}
		bar.add(menu1);
		bar.add(menu2);
		
		setJMenuBar(bar);
		
		
		JToolBar tool = new JToolBar();
		jl = new JLabel("툴 선택");
		
		jb = new JButton[bstr.length];
		
		for(int i=0;i<bstr.length;i++) {
			jb[i] = new JButton(bstr[i]);
			tool.add(jb[i]);
			jb[i].addActionListener(this);
		}
		getContentPane().add(tool,"North");
		
		add(BorderLayout.SOUTH,jl);
		
		setTitle("tool test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,300,400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new tooltest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		Object ob = e.getSource();
		String str = e.getActionCommand();
		if(e.getSource()==jb[0]) {
			jl.setText(e.getActionCommand()+"이(가) 완료됬습니다.");
		}
		else if(e.getSource()==jb[1]){
			jl.setText(e.getActionCommand()+"이(가) 완료됬습니다.");
		}
		else if(e.getSource()==jb[1]){
			jl.setText(e.getActionCommand()+"이(가) 완료됬습니다.");
		}
		else{
			jl.setText(e.getActionCommand()+"이(가) 완료됬습니다.");
		}
		
		switch (e.getActionCommand()) {
		case "십자 드라이버":
			jl.setText(str+"가 선택됬습니다.");
			break;
		case "전동드릴":
			jl.setText(str+"가 선택됬습니다.");
			break;
		case "일자 드라이버":
			jl.setText(str+"가 선택됬습니다.");
			break;
		case "장도리":
			jl.setText(str+"가 선택됬습니다.");
			break;
		default:
			break;
		}
	}

}
