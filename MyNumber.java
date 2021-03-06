package InterfaceProcessing;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyNumber {
	//Định nghĩa thuộc tính
	public int[] Numbers;
	
	//Khởi tạo giá trị cho thuộc tính Numbers
	public MyNumber(int[] numbers){
		this.Numbers = numbers;

	}
	//Viết phương thức GetPrime check sô nguyên tố từ mảng Numbers
	public ArrayList<Integer> GetPrime(){
		ArrayList<Integer> IsPrime = new ArrayList<Integer>();
		for (int i = 0; i < Numbers.length; i++) {
			int currentNumber = Numbers[i];
			boolean SNT = true;
		    for (int k = 2; k < currentNumber; k++) {
		    	if (currentNumber % k == 0) {
		    		SNT = false;
		    		break;
		    	}
		    }
		    if (SNT == true) {
		    	IsPrime.add(currentNumber);

		    }
		}
		return IsPrime;
	}
	//Trả ra những giá trị là số nguyên tố và không bị trùng trong mảng Numbers
	public ArrayList<Integer> GetMyNumber() {
		ArrayList<Integer> ListNT = this.GetPrime();
		for (int i = 0; i < ListNT.size(); i++){
			boolean isDupplicate = false;
			int number = this.Numbers[i];
			for(int j = 0; j< this.Numbers.length; j++) {
				int checkNumber = this.Numbers[i];
				if(number == checkNumber && i!=j) {
					isDupplicate = true;
					break;
				}
			}
			if(isDupplicate==false) {
				ListNT.add(number);
			}
		}
		return ListNT;
	}
	
	//Trả ra tổng tất cả các giá trị số nguyên tố chẵn
	public int GetTotal() {
		ArrayList<Integer> TSC  = this.GetMyNumber();
		int Sum = 0;
		for (int i = 0; i < TSC.size(); i++) {
			if(i % 2 == 0) {
				Sum++;
			}
		}
		return Sum;
	}
	 //Tìm số nguyên tố nào trong mảng Numbers có giá trị bằng tổng 02 số nt liền trước
	public ArrayList<Integer> GetLuckyNumber(){
		ArrayList<Integer> Lucky = this.GetPrime();
		for (int i = 0; i < Lucky.size(); i++) {
			if(Lucky.get(i)== Lucky.get(i-1)+ Lucky.get(i-2)) {
				Lucky.add(i);
			}
		}
		return Lucky;
		
		
	}

}


//Test
@Test
public void Check_GetMyNumber() {
	//Arrange
	int[] Numbers = {1,2,3,4,5,6,7,5};
	MyNumber MyNum = new MyNumber(Numbers);
	
	//Action
	ArrayList<Integer> ListMyNum = MyNum.GetMyNumber();
	
	//Assert
	Assert.assertEquals(5, ListMyNum.size());
	
}
@Test
public void Check_GetTotal() {
	//Arrange
	int [] Numbers = {1,2,3,4,5,6,7,5};
	MyNumber Sum = new MyNumber(Numbers);
	
	//Action
	int Tong = Sum.GetTotal();
	
	//Assertion
	Assert.assertEquals(2,Tong);
}

@Test
public void Check_GetLuckyNumber() {
	//Arrange
	int [] Numbers = {1,2,3,4,5,6,7,5};
	MyNumber SLK = new MyNumber(Numbers);
	
	//Action
    ArrayList<Integer> ListLK = SLK.GetLuckyNumber();
	
	//Assert
	Assert.assertEquals(5, ListLK.size());
}
