package TreeMapExampleAscendingCountryCodeComparator;

import java.util.Comparator;

public class AscendingCountryCodeComparator implements Comparator<String> {

	/*
	 * This method is used to arrange the CountryCodes in Ascending order.
	 */
	@Override
	public int compare(String countryCode1, String countryCode2) {
		return countryCode1.compareTo(countryCode2);
	}

}
