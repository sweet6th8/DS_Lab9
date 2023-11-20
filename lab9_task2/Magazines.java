package lab9_task2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Magazines extends Publications {
	private String name;

	public Magazines(String title, int pageNumber, int year, String author, double price, String name) {
		super(title, pageNumber, year, author, price);
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Magazines [name=" + name + ", getTitle()=" + getTitle() + ", getNumOfPages()=" + getNumOfPages()
				+ ", getYear()=" + getYear() + ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isMagazine() {
		return true;
	}

	@Override
	public Type type() {
		return Type.MAGAZINE;
	}

	@Override
	public boolean isMagazine10y() {
		LocalDate now =  LocalDate.now();
		if (this.getYear() == now.getYear()-12) {
			return true;
		}
		return false;
	}





	@Override
	public boolean constainMagazine(String nameOther) {
		if(this.getName().equals(nameOther)) {
			return true;
		}
		return false;
	}


	@Override
	public int maxPagesOfChapter() {
		return 0;
	}

	

}
