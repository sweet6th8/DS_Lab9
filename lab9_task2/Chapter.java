package lab9_task2;

public class Chapter {
	private String title;
	private int numOfPages;

	public Chapter(String title, int numOfPages) {
		super();
		this.title = title;
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return "Chapter [title=" + title + ", numOfPages=" + numOfPages + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	

	
}
