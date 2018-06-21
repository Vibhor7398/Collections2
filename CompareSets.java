package collections2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompareSets {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 elements for set 1: ");
		for(int i = 0; i<5 ; i++) {
			int x = s.nextInt();
			a.add(x);
		}
		
		System.out.println("Enter 5 elements for set 2: ");
		for(int i = 0; i<5 ; i++) {
			int x = s.nextInt();
			b.add(x);
		}
		a.retainAll(b);
		System.out.println("Elements same in both sets are: " + a);
	}

}
