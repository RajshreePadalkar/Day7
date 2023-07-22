package com.gurukul.day6;

public class InterchangeSmall {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int a[] = { 10, 11, 12, 20, 21, 22 };
	int max = 0, min = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] > a[max])
		max = i;
	    if (a[i] < a[min])
		min = i;

	}
	int t = a[max];
	a[max] = a[min];
	a[min] = t;

	for (int i = 0; i < a.length; i++)
	    System.out.print(" " + a[i]);

    }

}
