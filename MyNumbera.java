package InterfaceProcessing;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import javabasic.MyNumber;

public class MyNumbera {
	// Định nghĩa thuộc tính
	public int number;

	// Khởi tạo cho thuộc tính number
	public MyNumbera(int n) {
		this.number = n;

	}

	// Trả ra danh sách các số chẵn nhỏ hơn number
	public ArrayList GetSochan() {
		ArrayList ListSochan = new ArrayList();
		for (int i = 0; i < number; i++) {
			if (number % 2 == 0){
				ListSochan.add(i);
			}
		}
		return ListSochan;
	}

	// Trả ra danh sách các số lẻ nhỏ hơn number
	public ArrayList GetSole() {
		ArrayList ListSole = new ArrayList();
		for (int i = 0; i < number; i++) {
			if (number % 2 != 0){
				ListSole.add(i);
			}
		}
		return ListSole;
	}

	// Trả ra danh sách tổng các số chẵn lẻ ở vị trí tương ứng
	public ArrayList Get_Sotonghop() {
		ArrayList LSochan = new ArrayList();
		LSochan = GetSochan();

		ArrayList LSole = new ArrayList();
		LSole = GetSole();

		ArrayList ListSotonghop = new ArrayList();
		for (int i = 0; i < LSochan.size(); i++ ) {
			if (LSole.size()<=i) {
				LSochan.get(i);
			}
			else if (LSochan.size()<=i) {
				LSole.get(i);
			}
			else {(LSochan.get(i) + LSole.get(i))}
				
		}
		return ListSotonghop();

	}
}




// Test
	@Test
	public void Test_GetSochan() {
		// Arrange
		int[] originalNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		MyNumbera TSC = new MyNumbera(originalNumber);

		// Action
		ArrayList val = TSC.GetSochan();
		for (int i = 0; i < number; i++) {
			
			System.out.println(val.get(i));
		}
		// Assert
		Assert.assertEquals(result.size(), 4);
		Assert.assertEquals(result.get(0), 2);
		Assert.assertEquals(result.get(1), 4);
		Assert.assertEquals(result.get(2), 6);
		Assert.assertEquals(result.get(3), 8);
	}

@Test
public void Test_GetSole() {
	////Arrange
	int[]originalNumber = {1, 2, 3, 4, 5, 6, 7, 8};
	MyNumbera TSC = new MyNumbera(originalNumber);
	
	//Action
	ArrayList val = TSC.GetSole();
	for (int i = 0; i < number; i++) {
		
		System.out.println(val.get(i));
	}
	//Assert
	Assert.assertEquals(result.size(), 4);
	Assert.assertEquals(result.get(0), 1);
	Assert.assertEquals(result.get(1), 3);
	Assert.assertEquals(result.get(2), 5);
	Assert.assertEquals(result.get(3), 7);
}
