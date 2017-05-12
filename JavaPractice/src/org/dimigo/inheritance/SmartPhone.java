/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class SmartPhone {
	public String model, company;
	public int price;
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	public void turnoff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	public void pay(){
		
	}
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone)phone).useAirDrop();
		}
		if(phone instanceof Galaxy){
			((Galaxy)phone).useWirelessCharging();
		}
	}
	public String toString(){
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d",price)+"원";
	}
}
