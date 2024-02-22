package the_bloater.long_method;

public class MethodObject {
	class Account {
		private int delta() {
			return 10;
		}

		// TODO: replace this gamma method with method object (make a class for the
		// gamma logic)
		public int gamma(int inputVal, int quantity, int yearToDate) {
			int importantValue1 = (inputVal * quantity) + delta();
			int importantValue2 = (inputVal * yearToDate) + 100;
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			int importantValue3 = importantValue2 * 7;
			// and so on…
			return importantValue3 - 2 * importantValue1;
		}

	}

	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15, 10, 2010));

	}

	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}

}