package lap14_1;

public class MyDate {
	int day,month,year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print () {
		System.out.format("day :%d\nmonth :%d\nyear :%d\n",day,month,year);
	}
	
}
