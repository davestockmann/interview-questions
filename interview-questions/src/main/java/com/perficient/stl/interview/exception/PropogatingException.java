package com.perficient.stl.interview.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PropogatingException {

	public void doSomething() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			sdf.parse("13/11/2013");
		} catch (ParseException e) {
			// Which of these is correct and why is it better?

			throw new RuntimeException();
			// throw new RuntimeException(e.toString());
			// throw new RuntimeException(e.getMessage());
			// throw new RuntimeException(e);
			// throw new RuntimeException(e.getMessage(), e);
		}
	}

}
