public class Unbounded {


    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int algo(int i, int capacity, int [] value , int [] w) {

        if(i == value.length ) {
            return 0;
        }
        int take = 0;

        if(w[i] <= capacity) {

            take = value[i] + algo(i,capacity - w[i],value,w);

        }

        noTake = algo(i + 1, capacity , value, w);

        return Math.max(take, noTake);


    }

    public static int last ( int capacity, int [] value, int w) {
        return algo(0, capacity, value, w); 
    }

    
}
