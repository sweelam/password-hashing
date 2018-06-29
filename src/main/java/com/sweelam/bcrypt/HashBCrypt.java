package com.sweelam.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

public class HashBCrypt {
	
	/**
	 * This method is slower than SHA , but for the powerful mechanism it is using .
	 * @param value
	 * @return
	 */
	public static String hashWithBCrypt(String value) {
		return BCrypt.hashpw(value, BCrypt.gensalt());
	}
}
