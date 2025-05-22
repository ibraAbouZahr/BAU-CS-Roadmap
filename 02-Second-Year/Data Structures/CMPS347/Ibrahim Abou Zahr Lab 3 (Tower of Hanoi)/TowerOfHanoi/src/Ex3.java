
public class Ex3 {
	
	public static void TowerOfHanoi(int n, char target, char source, char aux) {
		
		if(n == 1) {
			System.out.println("Move the disk from " + source + " to " + target);
		}
		else {
			TowerOfHanoi(n-1, source, aux, target);
			
			TowerOfHanoi(n - 1, aux, target, source);
		}
	}

}
