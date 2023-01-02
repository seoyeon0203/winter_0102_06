package vendingmachine.controller;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vendingmachine.view.ProductView;
import vendingmachine.vo.ProductDAO;
import vendingmachine.vo.ProductVO;

public class ProductController extends JFrame{
	public static final int STOP =0;
	ArrayList<ProductVO> productList;
	
	public ProductController() {
	//자판기 화면 출력
		ProductView view = new ProductView();
		fullProduct();
		view.setProductList(productList);
		JPanel panC = view.displayProducts(this);
		JPanel panS = view.inputPurchase();
		add(panC, "Center");
		add(panS, "South");
		
		
		setTitle("음료자판기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	//	setLocation(100, 50);
	//	setSize(600, 600);
		setBounds(100, 50, 600, 700);
		setVisible(true);
		setResizable(false);
	
		
	}
	
	public void fullProduct() {
		// 자판기에 제품 채우기
				ProductDAO dao = new ProductDAO();
				String [] names = {"사이다", "콜라", "오렌지웰치스", "포도웰치스", "제로콜라", "초록매실",
						"오렌지쥬스", "비락식혜", "비타500"};
				int [] prices = {800, 900, 1100, 1100, 1500, 1600, 2000, 1000, 700};
				ProductVO vo = null;
				
				productList = dao.select();
				for(int i=0; i <  names.length; i++) {
					vo = new ProductVO();
					vo.setName(names[i]);
					vo.setPrice(prices[i]);
					vo.setProductNum(i);
					vo.setStockNum(10);
					vo.setImageNames("drink0"+ (i+1));
					productList.add(vo);
				}
	}
	
	public static void main(String[] args) {
		new ProductController();
		

	}

}
