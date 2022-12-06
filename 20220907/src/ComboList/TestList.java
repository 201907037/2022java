package ComboList;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.ImageGraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestList extends JFrame implements ItemListener{
	JComboBox<String> bre,dri;
	JLabel img1,img2;
	ImageIcon meal,drink;
	
	public TestList() {
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(1, 2, 20, 20));
		
		JLabel lblm = new JLabel("음료:");
		JLabel lbld = new JLabel("빵");
		meal = new ImageIcon("img/m0.jpg");
		drink = new ImageIcon("img/d0.jpg");
		img1 = new JLabel(meal);
		img2 = new JLabel(drink);
		
		
		
		String[] Str= {"사이다","콜라","환타","밀키스"};
		String[] Strd= {"식빵","소보로빵","바나나빵","메론빵"};
		
		bre = new JComboBox<String>(Strd);
		dri = new JComboBox<String>(Str);
		bre.addItemListener(this);
		dri.addItemListener(this);
		
		add("North",pan);
		add("Center",pan2);
		
		pan.add(lbld);pan.add(bre);pan.add(lblm);pan.add(dri);
		pan2.add(img1);pan2.add(img2);
		
		
		setTitle("JList연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 300, 600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestList();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox<String> combo = (JComboBox) e.getSource();
//		Object combo = e.getSource();
		if (combo==bre) {
			int i=bre.getSelectedIndex();
			meal = new ImageIcon("img/m"+i+".jpg");
			img1.setIcon(meal);
		}else {
			int i=dri.getSelectedIndex();
			drink = new ImageIcon("img/d"+i+".jpg");
			img2.setIcon(drink);
			
		}
		
		
	}

}
