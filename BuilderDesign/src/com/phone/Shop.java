package com.phone;

public class Shop {
public static void main(String[] args) {
	
	//Phone p =new Phone("Android", "Qualcom", 5.5, 1200, 64);
	
	Phone p = new PhoneBuilder().setOs("Androide").setProcessor("1.4").getPhone();
	System.out.println(p);
}
}
