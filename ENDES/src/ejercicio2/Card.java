package ejercicio2;

//Definimos nuestra clase "carta"
public class Card {

	//Definimos que nuestra clase necesitará un palo(suit) y un número(value)
	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	//Con este método conseguiremos un string tomando el valor del palo y número de la carta
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
