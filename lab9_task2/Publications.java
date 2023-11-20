package lab9_task2;

public abstract class Publications{
	// title, page number, year of publication, Author, price.
	private String title;
	private int numOfPages;
	private int year;
	private String author;
	private double price;

	public Publications(String title, int numOfPages, int year, String author, double price) {
		super();
		this.title = title;
		this.numOfPages = numOfPages;
		this.year = year;
		this.author = author;
		this.price = price;
	}
	public Publications() {
		
	}
	
	public enum Type{
		REFERENCE_BOOK, MAGAZINE, PUBLICATION
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Publications [title=" + title + ", numOfPages=" + numOfPages + ", year=" + year + ", author=" + author
				+ ", price=" + price + "]";
	}

	// 6) Phương thức xác định loại của ấn phẩm (Tạp chí hay Sách tham khảo)
	public abstract Type type();

	// 7)Phương thức kiểm tra ấn phẩm là tạp chí và có thời gian xuất bản cách đây
	// (2021) 10 năm hay không
	public abstract boolean isMagazine10y();

	// 8) Phương thức kiểm tra hai ấn phẩm có cùng loại và cùng tác giả hay không
	public boolean sameAuthor(Publications o) {
		return (this.type()==o.type() && this.getAuthor().equals(o.getAuthor()));
	}
	
	// 10)Tìm quyển sách tham khảo có chương sách nhiều trang nhất
		public abstract int maxPagesOfChapter() ;


	// 11)Tìm xem trong danh sách các ấn phẩm có chứa một tạp chí có tên cho trước
	// hay không?
	public abstract boolean constainMagazine(String nameOther);

}
