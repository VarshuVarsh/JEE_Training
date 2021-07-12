package demo;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.java.trining.*;
import com.java.trining.CreditCard;
import com.java.trining.CreditCard;

public class StreamApplication {

	public static void main(String[] args) {

		List<CreditCard> cards = new ArrayList<CreditCard>();
		cards.add(new CreditCard(10233, "Varsh", 789, 80000));
		cards.add(new CreditCard(20233, "Mahi", 889, 70000));
		cards.add(new CreditCard(30233, "Varshu", 689, 60000));
		cards.add(new CreditCard(40233, "Vinay", 589, 40000));
		cards.add(new CreditCard(50233, "Vinu", 489, 50000));

		CreditCardService service = new CreditCardService(cards);
		service.usingFilterAndMap();
		service.findMinimumCreditLimit();
		service.findMaximumCreditLimit();
		service.collectingToUtilMap();
		service.usingFilterAndMap();
			
	}
}