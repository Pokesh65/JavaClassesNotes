package OwnPracticeCode;

public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Box[] = { 2, 3, 4, 5, 6, 7, 4, 5, 8  };
		int n = Box.length;
		int count = 0;
		int cand = 0;

		for (int i = 0; i < n; i++) {
			if(cand==0) {
				cand=Box[i];
			}
			if(cand==Box[i]) {
				count++;
			}else {
				count--;
			}
		}System.out.println("The Majority Elements Is :"+cand);

	}

}
