package test;

import org.tinylog.Logger;

import test.a.A;
import test.b.B;

public class LogTest {
	public static void main(String[] args) {
		Logger.info("in main()");
		Logger.debug("in main()");
		Logger.trace("in main()");
		A.a();
		B.b();
	}
}
