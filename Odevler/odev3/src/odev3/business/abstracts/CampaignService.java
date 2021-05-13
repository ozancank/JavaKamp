package odev3.business.abstracts;

import odev3.entities.concretes.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);

	void updateCampaign(Campaign campaign);

	void deleteCampaign(Campaign campaign);
}
