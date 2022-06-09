
public abstract class Media implements Comparable<Media> { // implements comparable here is better than implements in
															// each subclass
	private String title;
	int numOfCopies;
	// title and number of copies is for all media so I declare it here

	public Media(String title, int numOfCopies) {
		super();
		setTitle(title);
		setNumOfCopies(numOfCopies);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) throws IllegalArgumentException {
		if (numOfCopies >= 0)
			this.numOfCopies = numOfCopies;
		else
			throw new IllegalArgumentException("number of copies can't be negative!!");
	}

	@Override
	public int compareTo(Media o) {
		return title.compareToIgnoreCase(o.getTitle());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Media)
			return title.equalsIgnoreCase(((Media) obj).getTitle()); // add equals here is more good than add in each
																		// subclass
		else
			return super.equals(obj);
	}
}
