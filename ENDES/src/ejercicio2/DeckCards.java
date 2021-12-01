package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		//Creamos dos arrays para generar los palos (suits) y los números de carta(values)
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };												
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();

		//Con este for generamos y añadimos cada carta de la baraja
		for (int i = 0; i < suits.length; i++) {		
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		//Utlizamos el siguiente for para mezclar las cartas de manera aleatoria
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		//Imprimimos las cinco primeras cartas de la baraja
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
