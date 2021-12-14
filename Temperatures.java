package ogalagu_hilary;



import ogalagu_hilary.CollectionProperties;
import ogalagu_hilary.DataCollection;

public class Temperatures extends DataCollection implements CollectionProperties {
	public Temperatures(int[] data) {
		super(data);
	}

	@Override
	public int max() {
		int max = 0;
		int[] data = super.getData();
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	@Override
	public double mean() {
		int sum = 0;
		int[] data = super.getData();
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / super.numberOfValues();
	}

}
