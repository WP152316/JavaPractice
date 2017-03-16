/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int na = 25;
		double ki = 161.8, mo = 44.3;
		String a = "A", name = "아이유", b = "여자";
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + b);
		System.out.println("나이 : " + na + "세");
		System.out.println("키 : " + ki + "cm");
		System.out.println("몸무게 : " + mo + "kg");
		System.out.println("혈액형" + a + "형");
	}

}
