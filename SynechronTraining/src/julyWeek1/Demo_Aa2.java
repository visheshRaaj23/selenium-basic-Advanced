package julyWeek1;

import java.util.ArrayList;
import java.util.List;

public class Demo_Aa2 {

	public static void main(String[] args) {
		useGenerics();

	}
	private static void start() {
		// LISTS RETAIN INSERTION ORDER
		// LISTS ALLOWS MULTIPLE NULLS
		List players = new ArrayList();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);
		System.out.println(players);

	}
	
	public static void useGenerics() {
		List<Player>  arrayLis = new ArrayList<Player>();
		Player player1 =new Player();
		player1.id=23;
		player1.name="Vishesh";
		arrayLis.add(player1);
		
		Player player2 =new Player();
		player2.id=04;
		player2.name="Supriya";
		arrayLis.add(player2);
		System.out.println(arrayLis);
		
		
	}

}

class Player{
	int id;
	String name;
	
	@Override
	public String toString() {
		return "Player [id = "+id+"] and ["+name+"]";
	}
}
