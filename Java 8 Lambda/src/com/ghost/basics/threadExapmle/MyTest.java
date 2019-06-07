package com.ghost.basics.threadExapmle;

public class MyTest {

	/*
	 * this method is making use of funcational interface so what i have to do is
	 * provide the implimetaion in the method
	 *
	 */
	static void testMyThread(Runnable runner) {
		runner.run();
	}

	public static void main(String[] args) {

		/*
		 * one way to run a thread
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("i am no " + (i + 1));
				}

			}
		};
		runnable.run();

		/*
		 * 2nd way to run a thread
		 */

		testMyThread(() -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("in form 2nd method i am no >" + (i + 1));
			}
		});

		/*
		 * or we can use like
		 */
		
		Thread myThread = new Thread(()->{System.out.println("i am form myThread"); });
		myThread.run();
	}

}
