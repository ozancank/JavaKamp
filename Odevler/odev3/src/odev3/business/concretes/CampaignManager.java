package odev3.business.concretes;

import odev3.business.abstracts.CampaignService;
import odev3.dataAccess.abstracts.CampaignDao;
import odev3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	private CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void addCampaign(Campaign campaign) {
		if (CheckEmpty(campaign))
			return;
		campaignDao.add(campaign, "Kampanya eklendi: " + campaign.getCampaignName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		if (CheckId(campaign.getId()) || CheckEmpty(campaign))
			return;
		campaignDao.update(campaign, "Kampanya güncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		if (CheckId(campaign.getId()))
			return;
		campaignDao.delete(campaign, "Kampanya silindi: " + campaign.getCampaignName());
	}

	private boolean CheckId(int id) {
		boolean result = false;
		if (id <= 0) {
			System.out.println("Kampanya bulunamadý.");
			result = true;
		}
		return result;
	}

	private boolean CheckEmpty(Campaign campaign) {
		boolean result = false;
		if (campaign.getId() <= 0 || campaign.getCampaignName() == "" || campaign.getPriceRatio() <= 0.1
				|| campaign.getPriceRatio() > 100.00) {
			System.out.println("Tüm alanlar doldurulmalýdýr. Ýndirim oraný % 0.1 - 100 arasýnda olmalýdýr.");
			result = true;
		}
		return result;
	}
}
