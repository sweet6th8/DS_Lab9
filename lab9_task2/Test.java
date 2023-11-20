package lab9_task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Chapter c1 = new Chapter("chương 1", 5);
		Chapter c2 = new Chapter("chương 2", 2);
		Chapter c3 = new Chapter("chương 3", 3);
		List<Chapter> listC1 = new ArrayList<>();
		listC1.add(c1);
		listC1.add(c2);
		List<Chapter> listC2 = new ArrayList<>();
//		listC2.add(c1);
		listC2.add(c2);
		listC2.add(c3);
		Reference_books r1 = new Reference_books("C", 20, 2000, "Lang", 1, "Y học", listC1);
		Reference_books r2 = new Reference_books("B", 20, 2000, "Lang", 1, "Y học", listC2);

		Magazines m1 = new Magazines("C", 10, 2020, "Lang", 2, "m1");
		Magazines m2 = new Magazines("O", 10, 2011, "Thư", 2, "m2");
		Magazines m3 = new Magazines("E", 10, 2020, "Đạt", 2, "m3");

		List<Publications> listP1 = new ArrayList<>();
		listP1.add(r1);
		listP1.add(r2);
		listP1.add(m1);
		listP1.add(m2);
		listP1.add(m3);

		Bookstore b = new Bookstore(listP1);

//		System.out.println(listP1.get(0).type());

//		for (Publications p : listP1) {
//			System.out.println(p.getYear() +": "+ p.isMagazine10y());
//		}

//		System.out.println(listP1.get(0).sameAuthor(r2));
////
//		System.out.println(b.totalPrice());
//
//		System.out.println(b.rB_maxPagesOfChapter());
//
//		System.out.println(b.constainMagazine("m1"));
		
//		System.out.println(b.getMagazines1y(2020));
		
		System.out.println(b.statistical());
		
		System.out.println(b);
		System.out.println("---------");
		System.out.println(b.sort());
		System.out.println("---------");
		System.out.println(b);
		
	}
}
