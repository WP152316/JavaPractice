/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember fm1 = new FamilyMember("아빠");
		FamilyMember fm2 = new FamilyMember("엄마");
		FamilyMember fm3 = new FamilyMember("나");
		FamilyMember fm4 = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(fm1,10000);
		PiggyBank.putMoney(fm2,5000);
		PiggyBank.putMoney(fm3,2000);
		PiggyBank.putMoney(fm4,1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(fm2,1000);
		PiggyBank.printBalance();
	}

}
