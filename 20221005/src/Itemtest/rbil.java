package Itemtest;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class rbil implements ItemListener {
	JRadioButton r1,r2;
	JLabel jl1;
	
	
	public rbil(JRadioButton r1, JRadioButton r2, JLabel jl1) {
		super();
		this.r1 = r1;
		this.r2 = r2;
		this.jl1 = jl1;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//isSelected()를 통해 구현
//		if(true==r1.isSelected()) {
//			jl.setText("일번 선택");
//		}
//		else {
//			jl.setText("이번 선택");
//		}
		//e.getSource()를 통해 구현
		if(r1==e.getSource())
		{
			jl1.setText("1번 선택");
		}
		else
		{
			jl1.setText("2번 선택");
		}
		
		
	}

}
