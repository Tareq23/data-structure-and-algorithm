package interview_practice.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(3);
		set.add(6);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set.size());
		
		for(Integer val: set)
		{
			System.out.print(val+", ");
		}

	}

}
