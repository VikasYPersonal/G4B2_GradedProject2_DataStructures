package com.fullstack.problem1.util;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Helper {

	static Scanner scanner = new Scanner(System.in);

	public LinkedList<String> getInput() {

		System.out.println("Enter Total no. of Floors to be build:");
		int floorCount = scanner.nextInt();
		int floorNumber;

		Stack<Integer> floorStack = new Stack<Integer>();
		LinkedList<String> dayTaskList = new LinkedList<String>();
		int eligibalFloor = floorCount;

		for (int i = 1; i <= floorCount; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			floorNumber = scanner.nextInt();

			if (floorNumber != eligibalFloor) {
				floorStack.push(floorNumber);
				dayTaskList.add("");
			} else if (floorNumber == eligibalFloor) {
				floorStack.push(floorNumber);
				StringBuffer strBuffer = new StringBuffer();
				while (floorStack.isEmpty() != true) {
					if (floorStack.peek() == eligibalFloor) {
						strBuffer.append(Integer.toString(floorStack.pop()) + " ");
						eligibalFloor--;
					} else {
						break;
					}
				}
				dayTaskList.add(strBuffer.toString());
			}
		}
		
		//Additional steps to empty the stack of floors if anything still present
		StringBuffer strBuffer = new StringBuffer();
		if (floorStack.isEmpty() != true) {
			strBuffer.append(dayTaskList.get(floorCount-1));
			while (floorStack.isEmpty() != true) {
				strBuffer.append(Integer.toString(floorStack.pop()) + " ");
			}
			dayTaskList.set(floorCount-1, strBuffer.toString());
		}

		return dayTaskList;
	}

}
