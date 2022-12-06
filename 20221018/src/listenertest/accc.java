package listenertest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class accc implements ActionListener {
	JTextField jt3;
	
	
	public accc(JTextField jt3) {
		super();
		this.jt3 = jt3;
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jt3.setText(e.getActionCommand());
	}

}
