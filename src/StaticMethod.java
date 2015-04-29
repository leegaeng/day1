public class StaticMethod {

	int n;
	static int m;

	void f1(int x) {
		n = x;
	}

	void f2(int x) {
		m = x;
	}

	static void s1(int x) {
		// n = x; static에서는 인스턴스변수 접근x
	}

	static void s2(int x) {
		// f1(3); static에 그냥 메서드 접근x
	}

	static void s3(int x) {
		m = x;
	}

	static void s4(int x) {
		s3(3);
	}

}
