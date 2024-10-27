package ComparableNDComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Comparator: Comparator is an interface.using which is we can specicy ur own
//   logic for sorting.
public class Demo {
	public static void main(String[] args) {
//		Comparator<Integer> com=new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer i, Integer j) {
//				if(i%10>j%10)
//				{
//					return 1;// sorted order
//				}
//				else {
//					return -1;// not sorted order
//				}
//			}
//		};
		
		//using lomda expression 
		Comparator<Integer> com=(i,j)->i%10>j%10?1:-1;
		List<Integer> num = new ArrayList<>();
		num.add(43);
		num.add(31);
		num.add(72);
		num.add(29);
		
		Collections.sort(num);//[29, 31, 43, 72]
		//but i want second digit wise 31,72,43,29
		// if u want own logic the use Comparator. 
		Collections.sort(num,com);
		System.out.println(num);

	}

}
