import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class MyNumber1 {
	//Định nghĩa cho thuộc tính
	public int[] ListNumber;
	
	//Khởi tạo giá trị cho thuộc tính ListNumber
	public MyNumber1(int[] number) {
		this.ListNumber = number;
	}
	
	//Trả ra giá trị nhỏ nhất trong ListNumber
	public int GetMinNumber() {
		int MinNumber = ListNumber[0];
		for (int i=0; i < ListNumber.length; i++) {
			if(MinNumber > ListNumber[i]) {
				MinNumber = ListNumber[i];
			}
		}
		return MinNumber;
		
	}
	
	//Trả ra giá trị lớn nhất trong ListNumber
	public int GetMaxNumber() {
		int MaxNumber = ListNumber[0];
		for (int i=0; i < ListNumber.length; i++) {
			if(MaxNumber < ListNumber[i]) {
				MaxNumber = ListNumber[i];
			}
		}
		return MaxNumber;
		
	}
	
	//Đưa ra các số nằm giữa Min và Max
	public ArrayList<Integer> GetDistanceMinMax() {
		int Max = this.GetMaxNumber();
		int Min = this.GetMinNumber();
		ArrayList<Integer> DistanceMinMax = new ArrayList<Integer>();
		for (int i=0; i < ListNumber.length; i++) {
			boolean Distan = false;
			int Num = this.ListNumber[i];
			for(int j=0; j < ListNumber.length; j++) {
				int checkNumber = this.ListNumber[j];
				if( Num == checkNumber && j > Min && j < Max  ) {
					Distan = true;
					break;
				}
			}
			
			if(Distan==false) {
				DistanceMinMax.add(Num);
			}
			
		}
		return DistanceMinMax;
		
	}

}

//Test
@Test
public void Check_GetMinNumber() {
	//Arrange
	int[] ListNumber = {1,2,3,4,5,6,7,8};
	MyNumber1 Min = new MyNumber1(ListNumber);
	
	//Action
	int ListMin = Min.GetMinNumber();
	
	//Assert
	Assert.assertEquals(1, ListMin);
	
}

@Test
public void Check_GetMaxNumber() {
	//Arrange
	int[] ListNumber = {1,2,3,4,5,6,7,8};
	MyNumber1 Max = new MyNumber1(ListNumber);
	
	//Action
	int ListMax = Max.GetMaxNumber();
	
	//Assert
	Assert.assertEquals(8, ListMax);
	
}

@Test
public void Check_GetDistanceMinMax() {
	//Arrange
	int[] ListNumber = {1,2,3,4,5,6,7,8};
	MyNumber1 DistanceMinMax = new MyNumber1(ListNumber);
	
	//Action
	ArrayList<Integer> ListDistanceMinMax = DistanceMinMax.GetDistanceMinMax();
	
	//Assert
	Assert.assertEquals(6, ListDistanceMinMax.size());
}
	