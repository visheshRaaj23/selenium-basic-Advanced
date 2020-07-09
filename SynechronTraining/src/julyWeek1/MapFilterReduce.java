package julyWeek1;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapFilterReduce {

	public static void main(String[] args) {
		//map_Operation();
		//filter_Operation();
		reductionOperation();
	}
	
	public static void map_Operation() {
		String[] players = new String[] {"Vishesh","Supriya","Anuraaga","Prajna"};
		System.out.println(players.length);
		Stream<String> playerStream = Arrays.stream(players);
		Stream<String> upperCaseStream = playerStream.map(player -> player.toUpperCase());
		String[] newPlayers = upperCaseStream.toArray(String[]::new);
		for(String player:newPlayers) {
			System.out.println(player);
		}
	}
	public static void filter_Operation() {
		String[] players = new String[] {"Vishesh","Supriya","Anuraaga","Prajna"};
		System.out.println(players.length);
		Stream<String> playerStream = Arrays.stream(players);
		Stream<String> upperCaseStream = playerStream.filter(player -> player.length()<=7);
		String[] newPlayers = upperCaseStream.toArray(String[]::new);
		for(String player:newPlayers) {
			System.out.println(player);
		}
	}
	
	public static void reductionOperation() {
		long[] playersSalary = {230,245,156,456,186,187,190};
		System.out.println(Arrays.stream(playersSalary).sum());
		System.out.println(Arrays.stream(playersSalary).min());
		System.out.println(Arrays.stream(playersSalary).max());
		long number = Arrays.stream(playersSalary).max().getAsLong();
		System.out.println(number);
		System.out.println(Arrays.stream(playersSalary).count());
	}

}
