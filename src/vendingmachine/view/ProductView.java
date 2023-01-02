package vendingmachine.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vendingmachine.vo.ProductVO;

public class ProductView {
	ArrayList<ProductVO> productList;
	ArrayList<JLabel> lblList = new ArrayList<JLabel>();
	JTextField insertTf = new JTextField(15);
	JLabel lblResult = new JLabel("제품이 나오는 곳");
	
	
	//메서드 
	public JPanel displayProducts() {
		//패널 생성
		JPanel panC = new JPanel(new GridLayout(3,3));
		for (ProductVO vo : productList ) {
			ImageIcon icon = new ImageIcon("images/"+vo.getImageNames()+".jpg");
			JLabel lbl = new JLabel(icon);
			lblList.add(lbl);
			panC.add(lbl);
		}
		return panC;
	}
	
	public JPanel inputPurchase() {
		JPanel panS = new JPanel();
		
		return panS;
	}
	
	
	public void setProductList(ArrayList<ProductVO> productList) {
		this.productList = productList;
	}

}
