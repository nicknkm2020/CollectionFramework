package TreeMapExampleDescendingCountryCodeComparator;

import java.util.Comparator;

public class DescendingCountryCodeComparator implements Comparator<String> {

	/*
	 * This method is used to arrange the CountryCodes in descending order.
	 */
	@Override
	public int compare(String countryCode1, String countryCode2) {
		return countryCode2.compareTo(countryCode1);
	}

}
