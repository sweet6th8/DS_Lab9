package lab9_task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lab9_task2.Publications.Type;

public class Bookstore {
	private List<Publications> publications;

	public Bookstore(List<Publications> publications) {
		super();
		this.publications = publications;
	}

	public List<Publications> getPublications() {
		return publications;
	}

	public void setPublications(List<Publications> publications) {
		this.publications = publications;
	}

	@Override
	public String toString() {
		return "Bookstore [publications=" + publications + "]";
	}

	// 9) Tính tổng tiền của tất các ấn phẩm trong nhà sách
	public double totalPrice() {
		int sum = 0;

		for (Publications p : publications) {
			sum += p.getPrice();
		}
		return sum;
	}

	// 10)Tìm quyển sách tham khảo có chương sách nhiều trang nhất
	public Reference_books rB_maxPagesOfChapter() {

		Publications result = null;
		for (Publications p : publications) {

			if (p.type() == Type.REFERENCE_BOOK) {
				if (result == null) {
					result = p;
				} else {
					if (p.maxPagesOfChapter() > result.maxPagesOfChapter()) {
						result = p;
					}
				}
			}
		}
		return (Reference_books) result;
	}

	// 11)Tìm xem trong danh sách các ấn phẩm có chứa một tạp chí có tên cho trước
	// hay không?
	public boolean constainMagazine(String nameOther) {
		for (Publications p : publications) {
			if (p.type()==Type.MAGAZINE && p.constainMagazine(nameOther))
				return true;
		}
		return false;
	}

//	12)Lấy ra danh sách các tạp chí được xuất bản vào 1 năm cho trước
	public List<Publications> getMagazines1y(int year) {
		List<Publications> list = new ArrayList<>();
		for (Publications p : publications) {
			if (p.type() == Type.MAGAZINE && p.getYear()==year) {
				list.add(p);
			}
		}
		return list;
	}

//	13)Sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản (sử 
//	dụng interface Comparable hoặc Comparator)
	public List<Publications> sort() {
		List<Publications> result = new ArrayList<>(publications);
		result.sort(new Comparator<Publications>() {

			@Override
			public int compare(Publications o1, Publications o2) {
				int byTitle = o1.getTitle().compareTo(o2.getTitle());
				int byYear = o2.getYear() - o1.getYear();
				return byTitle == 0 ? byYear : byTitle;
			}
		});

		return result;
	}

//	14)Thống kê số lượng ấn phẩm theo năm xuất bản. Ví dụ 2020: 5, 2021: 10, … 
//	năm 2020 có 5 ấn phẩm, năm 2021 có 10 ấn phẩm
	public Map<Integer, Integer> statistical() {
		Map<Integer, Integer> map = new HashMap<>();
		for (Publications p : publications) {
			int val = map.getOrDefault(p.getYear(), 0) + 1;
			map.put(p.getYear(), val);
		}
		return map;
	}

}
