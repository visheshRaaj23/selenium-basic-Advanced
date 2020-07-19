package comparatorNComparable;	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	class Driver {
		public static void main(String[] args) {
			ArrayList<Movie> movieDetails = new ArrayList<Movie>();
			movieDetails.add(new Movie("Dil Bechara", 9.5, 2020));
			movieDetails.add(new Movie("Bajirao Mastani", 8.1, 2017));
			movieDetails.add(new Movie("Padmaavat", 8.9, 2019));
			movieDetails.add(new Movie("MS Dhoni-The Untold story", 9.1, 2016));	
			System.out.println("Before Sorting");
			System.out.println(movieDetails);
			for (Movie movie : movieDetails) {
				System.out.println(movie.getMovie() + "," + movie.getYearOfReleaase() + "," + movie.getRating());
			}
			System.out.println("After Sorting");
			Collections.sort(movieDetails);
			for (Movie movie : movieDetails) {
				System.out.println(movie.getMovie() + "," + movie.getYearOfReleaase() + "," + movie.getRating());
			}
		}
	}


