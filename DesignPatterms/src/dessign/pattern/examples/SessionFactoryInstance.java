package dessign.pattern.examples;

public class SessionFactoryInstance {

	// if u create private constructor then no one can create instance
	// of class out side of class

	public static SessionFactoryInstance s = null;

	private SessionFactoryInstance() {
	}

	public static synchronized SessionFactoryInstance getInstance() {
		if (s == null) {
			s = new SessionFactoryInstance();
		}
		return s;
	}
}
 // 50%
// 1] create private constructor
// 2] take static property & static factory method to create object , inside that write logic
// 3] stop multiple thread entry inside factory method.



