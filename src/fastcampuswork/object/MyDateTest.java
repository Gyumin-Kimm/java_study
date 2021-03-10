package fastcampuswork.object;

import java.sql.Date;

class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date_tmp = (MyDate) obj;
			if (date_tmp.day == this.day && date_tmp.month == this.month && date_tmp.year == this.year) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day*2+month*3+year*4;
	}

}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(20, 12, 2020);
		MyDate date2 = new MyDate(20, 12, 2020);

		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode() == date2.hashCode());
	}

}
