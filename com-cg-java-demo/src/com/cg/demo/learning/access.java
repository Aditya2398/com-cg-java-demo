package com.cg.demo.learning;

class aditya {
public int x = 5;
private int y = 6;
int z = 19;
protected int d = 23;
public void meth() {
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(d);
}
}

public class access {
public static void main(String[] args) {
aditya c = new aditya();
c.meth();

                            System.out.println(c.d);
                            System.out.println(c.x);
                            System.out.println(c.z);
                            
}
}