/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Korean.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Korean extends Person{

	public Korean(String name) {
		super(name);
	}
	
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}
	
}
