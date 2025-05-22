
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	public Date() {
		dMonth = 0;
		dDay = 0;
		dYear = 0;
		
	}
public Date(int m, int d, int y) {
	this.dMonth = m;
	this.dDay = d;
	this.dYear = y;
}
public void setDate(int mm, int dd, int yy) {
	this.dMonth = mm;
	this.dDay = dd;
	this.dYear = yy;
}
public int getdMonth() {
	return dMonth;
}

public int getdDay() {
	return dDay;
}

public int getdYear() {
	return dYear;
}
public String returnDate() {
	return dMonth + "-" + dDay + "-" + dYear;
}


}
