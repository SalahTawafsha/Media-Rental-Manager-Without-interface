
public class Game extends Media {
	double weight;

	public Game(String title, int numOfCopies, double weight) {
		super(title, numOfCopies);
		setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws IllegalArgumentException {
		if(weight>0)
			this.weight = weight;
		else
			throw new IllegalArgumentException("weight can't be less than or equal zero!!");
	}

	@Override
	public String toString() {
		return String.format("%-10s|%-30s|%-20s|Weight: %.2f\n", "Game", "Title: " + getTitle(),
				"Num Of Copeis: " + getNumOfCopies(), weight);
	}

}
