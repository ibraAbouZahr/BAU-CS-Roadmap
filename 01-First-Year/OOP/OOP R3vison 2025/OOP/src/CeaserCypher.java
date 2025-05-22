import java.util.*;

public class CeaserCypher {

	private static final String alpha = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

	}

	public static String Encrypt(String s, int k) {
		String enc = " ";
		s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char c = ' ';
			if (c == ' ') {
				enc += " ";
			}

			else {
				enc += alpha.charAt((alpha.indexOf(c) + k) % alpha.length());
			}
		}

		return enc;

	}

	public static String Decrypt(String s, int k) {

		String dec = " ";

		for (int i = 0; i < s.length(); i++) {
			char c = ' ';
			if (c == ' ') {
				dec += " ";
			} else {
				dec += alpha.charAt((alpha.indexOf(c) - k + 26) % 26);
			}
		}
		return dec;

	}

}
