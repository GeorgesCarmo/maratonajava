package IColecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(0);
		num.add(4);
		num.add(3);
		//(-(pontos de inserção)-1)
		//index 0,1,2,3
		//values 0,2,3,4
		Collections.sort(num);
		System.out.println(Collections.binarySearch(num, 2));

	}

}
