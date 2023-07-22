package com.gurukul.day6;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	double sum = 0, avg = 0, sd, xn = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the size :");
	int n = sc.nextInt();
	double x[] = new double[n];
	for (int i = 0; i < x.length; i++) {
	    System.out.println("enter the values :");
	    x[i] = sc.nextDouble();
	    sum = sum + x[i];
	}
	avg = sum / n;
	for (int i = 0; i < x.length; i++) {
	    xn = xn + Math.pow((x[i] - avg), 2);
	}
	xn = xn / n;
	sd = Math.sqrt(xn);

	System.out.println("Sum :" + sum);
	System.out.println("Avarage :" + avg);
	System.out.println("Variance :" + xn);
	System.out.println("SD :" + sd);

    }
}