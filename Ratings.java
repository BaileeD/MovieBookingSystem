/*RATING enumerated	type*/

public enum Ratings {
	G(0), PG(12), M(16);
	private int minAge;
	
	/*constructor*/
	private Ratings(int minAge){
		this.minAge = minAge;
	}

	/*instance variable*/
	public int getMinAge() {
		return minAge;
	}
}
