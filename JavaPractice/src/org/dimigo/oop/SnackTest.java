/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hap=0;
		Snack[] a = { new Snack("새우깡", "농심", 1100, 2), new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4) };
		for (Snack s : a) {
			System.out.println("이름 : " + s.getName());
			System.out.println("제조사 : " + s.getCompany());
			System.out.println("가격 : " + String.format("%,d", s.getPrice()) + "원");
			System.out.println("개수 : " + s.getNumber() + "개");
			System.out.println("");
			hap +=s.getPrice()*s.getNumber();
		} 
		System.out.println("총 구매 금액 : " + String.format("%,d",hap) + "원");
	}

}
