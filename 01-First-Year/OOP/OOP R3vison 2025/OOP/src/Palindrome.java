
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
		public boolean isPalindrome(String s) {

			for (int i = 0; i < s.length() / 2; i++) {
				int j = s.length() - 1 - i;

				if (s.charAt(i) != s.charAt(j)) {
					return false;
				}

			}
			return true;

		}
	}

	class Solution2 {
		public boolean isPalindrome(String s) {

			StringBuilder s1 = new StringBuilder();

			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetterOrDigit(s.charAt(i))) {
					s1.append(Character.toLowerCase(s.charAt(i)));
				}
			}
			
			String normalized = s1.toString();

			int left = 0;
			int right = normalized.length() - 1;

			while (left < right) {

				if (normalized.charAt(left) != normalized.charAt(right)) {
					return false;
				}
				left++;
				right--;

			}
			return true;

		}

	}

}
