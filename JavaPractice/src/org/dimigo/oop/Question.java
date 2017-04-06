/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] q= {"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"};
		String[] an={"Pentatonix","없음","응용프로그래밍"};
		System.out.println(q[0]);
		Scanner scanner = new Scanner(System.in);
		if(an[0].equals(scanner.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		
		System.out.println(q[1]);
		if(an[1].equals(scanner.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		
		System.out.println(q[2]);
		if(an[2].equals(scanner.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		
		System.out.println("<<결과 출력>>");
		for(int i = 0;i< 3; i++){
			StringBuilder sb = new StringBuilder("가장 좋아하는");
			
			sb.append(q[i]).append(an[i]).append("입니다");
			System.out.println(sb);
		}
	}

}
