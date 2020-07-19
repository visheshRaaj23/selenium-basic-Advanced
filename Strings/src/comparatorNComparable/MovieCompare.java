package comparatorNComparable;

import java.util.Comparator;

public class MovieCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getMovie().compareTo(o2.getMovie());
	}

}
