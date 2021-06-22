package com.cg.encap;

//inheritance

class Phone {

	void call() {
		System.out.println("calling....");
	}

	void sms() {
		System.out.println("Sending sms....");
	}

}

class FeaturePhone extends Phone {

	void music() {
		System.out.println("plaing music...");

	}
}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();

		phone.sms();
		phone.call();
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.sms();

	}
}
