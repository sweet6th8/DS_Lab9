package lab9_task2;

import java.util.List;

public class Reference_books extends Publications {
	private String field;
	private List<Chapter> chapters;

	public Reference_books(String title, int numOfPages, int year, String author, double price, String field,
			List<Chapter> chapters) {
		super(title, numOfPages, year, author, price);
		this.field = field;
		this.chapters = chapters;
	}
	

	@Override
	public String toString() {
		return "Reference_books [field=" + field + ", chapters=" + chapters + ", getTitle()=" + getTitle()
				+ ", getNumOfPages()=" + getNumOfPages() + ", getYear()=" + getYear() + ", getAuthor()=" + getAuthor()
				+ ", getPrice()=" + getPrice() + "]";
	}


	public Reference_books() {

	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public boolean isReferenceBook() {
		return true;
	}

	@Override
	public Type type() {
		return Type.REFERENCE_BOOK;
	}

	@Override
	public boolean isMagazine10y() {
		return false;
	}

	@Override
	public int maxPagesOfChapter() {
		int max = 0;

		for (Chapter chapter : chapters) {
			max = Math.max(max, chapter.getNumOfPages());
		}
		return max;
	}

	@Override
	public boolean constainMagazine(String nameOther) {
		return false;
	}

}
