package odev3.business.concretes;

import odev3.business.abstracts.SaleService;
import odev3.dataAccess.abstracts.SaleDao;
import odev3.entities.concretes.Sale;

public class SaleManager implements SaleService {

	private SaleDao saleDao;

	public SaleManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	@Override
	public void DoSale(Sale sale) {
		if (CheckId(sale.getId()))
			return;
		double price = sale.getGame().getPrice();
		if (sale.getCampaign() != null) {
			price = price * (1.00 - (sale.getCampaign().getPriceRatio() / 100.00));
			price = round(price, 2);
		}
		String message = sale.getGamer().getNickname() + " isimli oyuncuya " + sale.getGame().getName() + " oyununu "
				+ price + " fiyatýna satýldý.";
		if (sale.getCampaign() != null) {
			message = message + " (" + sale.getCampaign().getCampaignName() + ")";
		}
		saleDao.add(sale, message);
	}

	private boolean CheckId(int id) {
		boolean result = false;
		if (id <= 0) {
			System.out.println("Oyuncu bulunamadý.");
			result = true;
		}
		return result;
	}

	private double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
}
