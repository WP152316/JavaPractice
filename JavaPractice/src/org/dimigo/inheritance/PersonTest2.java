/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] pa = {
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		for (Person pp : pa){
			greeting(pp);
		}
		
	}
	private static void greeting(Person ab){
		System.out.println(ab);
		ab.sayHello();
		ab.sayBye();
		System.out.println("");
	}

}
