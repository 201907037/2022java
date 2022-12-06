package listenertest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class mal implements ActionListener {
	JButton jb2;
	JLabel jl;
	
	

	public mal(JButton jb2, JLabel jl) {
		super();
		this.jb2 = jb2;
		this.jl = jl;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str="";
		str = jb2.getText();
		jl.setText(str);
		
	}	

}
