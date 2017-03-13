/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator.java
 * 
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 1700000, h = 3, mo = 1500;
		// TODO Auto-generated method stub
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",m) + "원");
		System.out.printf("점포 내 직원 수 : %d명\n",h);
		System.out.println("점포 수 : " + String.format("%,d",mo) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d",(long)m*12*mo*h) + "원");

	}

}
