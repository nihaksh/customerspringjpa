
package org.cap.apps.customerjpa.util;

import org.cap.apps.customerjpa.exceptions.InvalidIdException;
import org.cap.apps.customerjpa.exceptions.InvalidNameException;

public class ValidationUtil {

	public static void checkIdNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidIdException("Id can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException("name is not valid");
		}

	}


}
