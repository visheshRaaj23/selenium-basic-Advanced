package comparatorNComparable;

public class Movie implements Comparable<Movie> {

	private  int yearOfRelease;
	private  String movieName;
	private  double ImdbRating;

	@Override
	public int compareTo(Movie m) {
		System.out.println(this.yearOfRelease);
		System.out.println(m.yearOfRelease);
		System.out.println(this.yearOfRelease - m.yearOfRelease);
		return (int)(this.yearOfRelease-m.yearOfRelease);
	}

	public Movie(String movie, double rating, int release) {
		this.movieName = movie;
		this.yearOfRelease = release;
		this.ImdbRating = rating;
	}

	public String getMovie() {
		return movieName;
	}

	public double getRating() {
		return ImdbRating;
	}

	public int getYearOfReleaase() {
		return yearOfRelease;
	}

}

