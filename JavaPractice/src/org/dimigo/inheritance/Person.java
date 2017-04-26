/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Person.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Person {
	public String name;
	public Person(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
	public void sayBye(){
		System.out.println("Bye");
	}
	public String toString(){
		return "제 이름은 " + name + "입니다";
	}
}
