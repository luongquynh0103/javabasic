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
	public ArrayList<Integer> GetMinNumber() {
		ArrayList<Integer> MinNumber = new ArrayList<Integer>();
		for (int i=0; i < ListNumber.length; i++) {
			if(MinNumber.get(i)> ListNumber[i]) {
				MinNumber.add(i);
			}
		}
		return MinNumber;
	}
	
	//Trả ra giá trị lớn nhất trong ListNumber
	public ArrayList<Integer> GetMaxNumber() {
		ArrayList<Integer> MaxNumber = new ArrayList<Integer>();
		for (int i=0; i < ListNumber.length; i++) {
			if(MaxNumber.get(i)< ListNumber[i]) {
				MaxNumber.add(i);
			}
		}
		return MaxNumber;
	}
	
	//Đưa ra các số nằm giữa Min và Max
	public ArrayList<Integer> GetDistanceMinMax() {
		ArrayList<Integer> Max = this.GetMaxNumber();
		ArrayList<Integer> Min = this.GetMinNumber();
		ArrayList<Integer> DistanceMinMax = new ArrayList<Integer>();
		for (int i=0; i < ListNumber.length; i++) {
			if(DistanceMinMax.get(i) > Min.get(i) && DistanceMinMax.get(i) < Max.get(i));{
				DistanceMinMax.add(i);
			}
		}
		return DistanceMinMax;
	}

}

//Test
@Test
public void Check_GetMinNumber() {
	//Arrange
	int[] ListNumber = {1,1,2,3,4,5,6,7,8,8};
	MyNumber1 Min = new MyNumber1(ListNumber);
	
	//Action
	ArrayList<Integer> ListMin = Min.GetMinNumber();
	
	//Assert
	Assert.assertEquals(2, ListMin.size());
	
}

@Test
public void Check_GetMaxNumber() {
	//Arrange
	int[] ListNumber = {1,1,2,3,4,5,6,7,8,8};
	MyNumber1 Max = new MyNumber1(ListNumber);
	
	//Action
	ArrayList<Integer> ListMax = Max.GetMaxNumber();
	
	//Assert
	Assert.assertEquals(2, ListMax.size());
	
}

@Test
public void Check_GetDistanceMinMax() {
	//Arrange
	int[] ListNumber = {1,1,2,3,4,5,6,7,8,8};
	MyNumber1 DistanceMinMax = new MyNumber1(ListNumber);
	
	//Action
	ArrayList<Integer> ListDistanceMinMax = DistanceMinMax.GetDistanceMinMax();
	
	//Assert
	Assert.assertEquals(6, ListDistanceMinMax.size());
}
	