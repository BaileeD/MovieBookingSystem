/*Film class*/

public class Film {
	private String title;
	private Ratings aRating;
	
	/*constructor*/
	public Film(String name, Ratings aRating){
		this.title = name;
		this.aRating = aRating;
	}
	
	/*default constructor*/
	public Film(){
		this.title = "Unknown";
		this.aRating = Ratings.G;
	}
	
	/*data encapsulation*/
	public Ratings getaRating() {
		return aRating;
	}

	public void setaRating(Ratings aRating) {
		this.aRating = aRating;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	/*toString method*/
	public String toString(){
		return this.title+" ("+this.aRating+")";
	}
	
	
}
