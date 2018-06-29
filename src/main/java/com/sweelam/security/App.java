package com.sweelam.security;

import com.sweelam.bcrypt.HashBCrypt;
import com.sweelam.sha.HashSha;
import com.sweelam.sha.ISha;
import com.sweelam.sha.ShaAlgorithms;

/**
 * SHA Family vs BCrypt!
 *
 */
public class App {
	public static void main(String[] args) {

		ISha iSha = new HashSha();

		String hash = iSha.generateUsingSHA("Mohamed Sweelam", ShaAlgorithms.SHA1.toString());
		System.out.println("Hashing using 160 bits \n \t" + hash);
		System.out.println("------------------------------------------------------------------------------------------");
		
		hash = iSha.generateUsingSHA("Mohamed Sweelam", ShaAlgorithms.SHA2.toString());
		System.out.println("Hashing using 256 bits \n \t" + hash);
		
		System.out.println("------------------------------------------------------------------------------------------");
		hash = iSha.generateUsingSHA("Mohamed Sweelam", ShaAlgorithms.SHA3.toString());
		System.out.println("Hashing using 512 bits \n \t" + hash);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Hashing using BCrypt \n \t" + HashBCrypt.hashWithBCrypt("Mohamed Sweelam"));
	}
}
