/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("IPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for (SmartPhone sm : s){
			System.out.println(sm);
			sm.turnOn();
			sm.pay();
			sm.useSpecialFunction();
			sm.turnoff();
			System.out.println("");
		}
		
	}

}
