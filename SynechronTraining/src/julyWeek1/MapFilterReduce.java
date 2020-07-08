package julyWeek1;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapFilterReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oldStyleOperation();
	}
	
	public static void oldStyleOperation() {
		String[] players = new String[] {"Vishesh","Supriya","Anuraaga","Prajna"};
		System.out.println(players.length);
		Stream<String> playerStream = Arrays.stream(players);
		Stream<String> x = playerStream.map(player -> player.toUpperCase());
		System.out.println(x);
	}

}
