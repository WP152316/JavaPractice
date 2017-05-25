/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ DBTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<변경 전>>");
		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(s);
		System.out.println();
		System.out.println("<<변경 후>>");
		IDBManager o =IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(o);
	}	
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
		
	}

}
