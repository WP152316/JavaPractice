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
public class Chinese extends Person{

	public Chinese(String name) {
		super(name);
	}
	
	public void sayHello(){
		System.out.println("니하오");
	}
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	
}
