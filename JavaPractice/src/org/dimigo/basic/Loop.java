/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ch, hp = 100;
		String[] ca = {"마법사","영주","기사","농민"};
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("----------------");
			System.out.printf("메뉴 입력 => ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				hp += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + hp); // +10
				break;
			case 2:
				hp -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + hp); // -10
				break;
			case 3:
				System.out.println(ca[new Random().nextInt(ca.length)] + "(으)로 설정되었습니다."); // 마법사, 영주, 기사, 농민
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		} while (ch != 9);
	}

}
