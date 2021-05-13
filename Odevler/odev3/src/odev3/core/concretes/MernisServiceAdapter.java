package odev3.core.concretes;

import odev3.core.abstracts.NviService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements NviService {

	@Override
	public boolean checkRealPerson(String nationalityNumber, String firstName, String lastName, int yearOfBirth) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(nationalityNumber),
					firstName.toUpperCase().trim(), lastName.toUpperCase().trim(), yearOfBirth);
		} catch (Exception e) {
			System.out.println("Servise baðlanýlamadý.");
		}
		return result;
	}
}
