package OwnPracticeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTpic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(4);
		li.add(46);
		li.add(23);
		li.add(4);

//		map
		List<Integer> result = li.stream().map(e -> e + 5).collect(Collectors.toList());
		System.out.println("map->  "+result);

	}

}
