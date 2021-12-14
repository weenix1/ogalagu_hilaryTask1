package ogalagu_hilary;

public class DataCollection {
	private int[] data;

	public DataCollection(int[] data) {
		this.data = data;
	}

	public int numberOfValues() {
		return getData().length;

	}

	public int get(int index) {
		return getData()[index];
	}

	public int[] getData() {
		return data;
	}
}
