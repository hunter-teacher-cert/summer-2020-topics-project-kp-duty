import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException; 

//Proof of Work Class
public class PoW {
	
	public static void main(String[] args) {
		String input = "pat";
		String nonce = "";
		System.out.println( calculateHash(input + nonce) );
	}
	
/*********** HASH CALCULATING BELOW - READ AT YOUR OWN RISK ***************/
	public static String calculateHash(String input) {
		try {
			return getSHA(input);
		}
		//For specifying wrong message digest algorithms  
        catch (NoSuchAlgorithmException e) {  
            System.out.println("Exception thrown for incorrect algorithm: " + e);  
        }
		return null;
	}
	
	
	/******* CODE BELOW IS FOR GENERATING SHA-256 HASH VALUE IN HEX *********/
	
	//sources: https://www.baeldung.com/sha-256-hashing-java
	// and https://www.geeksforgeeks.org/sha-256-hash-in-java/
	//MessageDigest is java's class for SHA-256 hashing
	public static String getSHA(String input) throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		byte[] encodedhash = md.digest(input.getBytes(StandardCharsets.UTF_8));
		
		return bytesToHex(encodedhash);
	}
	
	//source: https://www.baeldung.com/sha-256-hashing-java
	//bytesToHex converts a string of bytes to a string of hex
	private static String bytesToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if(hex.length() == 1) hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}

}//end of class