package com.fullstack.problem1.main;

import java.util.LinkedList;

import com.fullstack.problem1.util.Helper;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Helper helper = new Helper();

		LinkedList<String> dayTaskList = helper.getInput();

		for (int i = 0; i < dayTaskList.size(); i++) {
			System.out.println("Day " + (i+1) + ":" + dayTaskList.get(i));
		}

	}

}
