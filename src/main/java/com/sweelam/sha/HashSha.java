package com.sweelam.sha;

import org.apache.commons.codec.digest.DigestUtils;

public class HashSha implements ISha {

	/**
	 * Type : SHA 1 , SHA 2 or SHA3
	 * 
	 */
	public String generateUsingSHA(String value, String type) {

		if (type == null || type.trim().length() == 0)
			return "";

		if (type == "SHA1")
			return hash160(value);
		else if (type == "SHA2")
			return hash256(value);
		else
			return hash512(value);
	}

	/**
	 * Applying SHA 1 algorithm , not recommended .
	 * 
	 * @param value
	 * @return
	 */
	private String hash160(String value) {
		return value != null ? DigestUtils.sha1Hex(value).toString() : "";
	}

	/**
	 * Applying SHA 2 algorithm , not recommended .
	 * 
	 * @param value
	 * @return
	 */
	private String hash256(String value) {
		return value != null ? DigestUtils.sha256Hex(value).toString() : "";
	}

	/**
	 * Applying SHA 3 algorithm , good but not powerful today .
	 * 
	 * @param value
	 * @return
	 */
	private String hash512(String value) {
		return value != null ? DigestUtils.sha512Hex(value).toString() : "";
	}

}
