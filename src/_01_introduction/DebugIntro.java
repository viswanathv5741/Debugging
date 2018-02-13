package _01_introduction;

import java.util.Random;

//1. Place breakpoints at different places in the code and see what 
//   the values of the member variables are using the debugger.

public class DebugIntro {
	private int memVar1 = 0;
	
	final double PI = 3.14159;
	
	public int x;
	
	public static void main(String[] args) {
		new DebugIntro().start();
	}
	
	public void start() {
		x = 73;
		method1();
	}
	
	public void method1() {
		
		for(int i = 0; i < 20000; i++) {
			x = new Random().nextInt();
		}	
		memVar1 = x;
	}
}
