
public interface Action {
	Object apply (Object state);
	int getCostPerAction();

}
