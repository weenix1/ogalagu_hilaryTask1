package ogalagu_hilary;

import ogalagu_hilary.Main;
import ogalagu_hilary.Temperatures;

public class Main {
	Temperatures temp;

	public Main(int[] data) {
		temp = new Temperatures(data);
	}

	public static void main(String[] args) {
		int[] data = { 3, 4, 6, 4, 3 };
		Main m = new Main(data);
		System.out.println("Max:" + m.getMax());
		System.out.println();
		System.out.println("Mean:" + m.getMean());

	}

	public int getMax() {
		int max = temp.max();

		return max;
	}

	public double getMean() {
		double mean = temp.mean();
		return mean;
	}
}
