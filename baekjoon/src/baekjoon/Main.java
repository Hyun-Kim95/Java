package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextDouble();
		Arrays.sort(a);
		double m = a[n - 1];
		double sum = 0;
		for (int j = 0; j < n; j++)
			sum += (a[j] / m * 100);
		System.out.println(sum / (double) n);
	}
}