package com.JavaBasics.MethodsDemo;
import java.util.Scanner;


public class BoxVolume {
	
	public int boxVolume()
	{
		int l, b, h;
		int volume;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length, breadth and height of box");
		
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		volume = l * b * h;
		System.out.println("Volume of Box is:" +volume);
		
		return volume;
		
	}
	public static void main(String args[])
	{
		BoxVolume b = new BoxVolume();
		b.boxVolume();
	}

}
