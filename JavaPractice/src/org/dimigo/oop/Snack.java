/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author : zip_s
 * @version : 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;

	public Snack() {

	}

	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int calcPrice() {
		return this.price * this.number;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Snack [name=" + name + ", company=" + company + ", price=" + price + ", number=" + number + "]";
	}

}
