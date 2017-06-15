/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ ArakoMenu.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 15.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class ArakoMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))){
			
			String em;
			
			while((em = br.readLine())!=null){
				writer.write(em);
				writer.write("\n");
			}
			writer.flush();
			System.out.println("<<메뉴 출력>>");
			while((em = reader.readLine())!=null){
				System.out.println(em);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void flush() {
		// TODO Auto-generated method stub
		
	}

}
