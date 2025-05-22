
public class LinkedList {

	public static boolean searchingLinkedList(LsiteNode temp, int item) {
		if (temp == null) {
			return false;
		} else if (temp.data == item) {
			return true;
		} else {
			return searchingLinkedList(temp.next, item);
		}
	}

	public static int insertItemLinkedList(LsiteNode temp, int item) {
		if (temp == null) {
			LsiteNode t1 = new LsiteNode(item);
			t1.next = temp;
			temp = t1;
		} else {
			return insertItemLinkedList(temp.next, item);
		}
		return 0;

	}

	public static int printLinkedListForward(LsiteNode temp) {
		if (temp == null) {
			return 0;
		} else {
			System.out.println(temp.data);
			return printLinkedListForward(temp.next);
		}
	}
	public static int printLinkedListReverse(LsiteNode temp) {
		if (temp == null) {
			return 0;
		} else {
			

			printLinkedListReverse(temp.next);
			System.out.println(temp.data);
		}
		return 0;
	}
	public static int sumOfOddELementLinkedList(LsiteNode temp) { 
		if(temp == null) {
			return 0;
		}
		else if(temp.data%2 != 0) {
			return temp.data + sumOfOddELementLinkedList(temp.next);
		}
		return 0;
	}
	public static int sumOfEvenELementLinkedList(LsiteNode temp) { 
		if(temp == null) {
			return 0;
		}
		else if(temp.data%2 == 0) {
			return temp.data + sumOfEvenELementLinkedList(temp.next);
		}
		return 0;
	}
	

}
