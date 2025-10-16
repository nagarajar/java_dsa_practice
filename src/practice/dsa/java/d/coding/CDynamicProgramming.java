package practice.dsa.java.d.coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class CDynamicProgramming {

	static int countNormal = 0;
	static int countDynamic = 0;
	static Map<String, Integer> map = new LinkedHashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Try with Fibbonacci series
		// 1. Find the nth fibbonacci num
		// Using RecursiveNormal
		int n = 20;
		System.out.println("RecursiveNormal = " + recursiveNormal(n));
		System.out.println("RecursiveNormal Count = " + countNormal);

		// Using RecursiveDynamic
		System.out.println("RecursiveDynamic = " + recursiveDynamic(n));
		System.out.println("RecursiveDynamic Count = " + countDynamic);
		System.out.println("RecursiveDynamic map = " + map);

	}

	public static int recursiveNormal(int n) {
		countNormal++;
		if (n == 0 || n == 1) {
			return n;
		}
		return recursiveNormal(n - 1) + recursiveNormal(n - 2);
	}

	public static int recursiveDynamic(int n) {
		countDynamic++;
		if (map.containsKey("f" + n)) {
			return map.get("f" + n);
		}
		if (n == 0 || n == 1) {
			map.put("f" + n, n);
			return n;
		} else {

			int sum = recursiveDynamic(n - 1) + recursiveDynamic(n - 2);
			map.put("f" + n, sum);
			return sum;
		}

	}

}
