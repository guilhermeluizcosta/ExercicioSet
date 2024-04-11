package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A: ");
		int n = sc.nextInt();
		Set<Course> set = new HashSet<>();
		
		for(int i = 0 ; i<n;i++) {
			int code = sc.nextInt();
			Course aux = new Course(code);
			set.add(aux);
		}
		
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		for(int i = 0 ; i<n;i++) {
			int code = sc.nextInt();
			Course aux = new Course(code);
			set.add(aux);
		}
		
		System.out.print("How many students for course C: ");
		n = sc.nextInt();
		for(int i = 0 ; i<n;i++) {
			int code = sc.nextInt();
			Course aux = new Course(code);
			set.add(aux);
		}
		
		System.out.println("Total students:" + set.size());
		
		
		
		
		sc.close();
	}

}
