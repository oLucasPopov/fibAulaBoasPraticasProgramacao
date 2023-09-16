import java.util.Map;
import static java.util.Map.entry;

public class Conversor {

	public Map<String, Integer> listValidCards() {
		return Map.ofEntries(
				entry("A", 1),
				entry("2", 2),
				entry("3", 3),
				entry("4", 4),
				entry("5", 5),
				entry("6", 6),
				entry("7", 7),
				entry("8", 8),
				entry("9", 9),
				entry("10", 10),
				entry("J", 11),
				entry("Q", 12),
				entry("K", 13));
	}

	public int getCardNumber(String card){
		Map<String, Integer> cartas = listValidCards();
		return cartas.get(card.toUpperCase());
	}

	public int converteCartaParaInt(String carta) {
		return getCardNumber(carta);
	}
}