package Date2272020;

public class numberWithoutDividedBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				continue;
			}else {
					System.out.println(i);
			}
		}
	}

}
