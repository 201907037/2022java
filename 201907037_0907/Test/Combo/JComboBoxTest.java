package Test.Combo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame implements ItemListener {
	JComboBox<String> ComboMeal, ComboDrink; //필드 선언
	JLabel lblMeal,lblDrink;//ImageIcon을 설정할 라벨
	
	public JComboBoxTest() {
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel(new GridLayout(1,2,20,20));
		//pan2.setLayout(new GridLayout(1,2,20,20));
		
		JLabel jl1 = new JLabel("식사: ");//문자열 출력 라벨
		JLabel jl2 = new JLabel("음료: ");
		ImageIcon iconm = new ImageIcon("img/m0.jpg");//root가 프로젝트 생략
		ImageIcon icond = new ImageIcon("img/d0.jpg");
		lblMeal = new JLabel(iconm);
		lblDrink = new JLabel(icond);
		
		
		String[] itemM = {"갈비","삼겹살","목살","파스타"};
		String[] itemD = {"콜라","사이다","환타","스프라이트"};
		
		ComboMeal = new JComboBox<String>(itemM);
		ComboDrink = new JComboBox<String>(itemD);
		
		ComboMeal.addItemListener(this);
		ComboDrink.addItemListener(this);
		
		add("North",pan1);
		add("Center",pan2);
		
		pan1.add(jl1);pan1.add(ComboMeal);pan1.add(jl2);pan1.add(ComboDrink);
		pan2.add(lblMeal);pan2.add(lblDrink);
		
		
		setTitle("JComboBox연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 150, 500, 400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxTest();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int selectIndex=0;//if문에서만 ㄱㄴ
		ImageIcon icon=null;//if문에서만 ㄱㄴ
		JComboBox<String> combo = (JComboBox)e.getSource();
		//Object combo = e.getSource(); Object도 가능 
		if(combo == ComboMeal) {
			selectIndex = ComboMeal.getSelectedIndex();
			icon = new ImageIcon("img/m"+selectIndex+".jpg");
			lblMeal.setIcon(icon);
		}else {
			selectIndex = ComboDrink.getSelectedIndex();
			icon = new ImageIcon("img/d"+selectIndex+".jpg");
			lblDrink.setIcon(icon);
		}
		
		
	}

}
