package odev3.entities.concretes;

import odev3.core.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private double priceRatio;

	public Campaign() {
	}

	public Campaign(int id, String campaignName, double priceRatio) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.priceRatio = priceRatio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		if (campaignName == null)
			campaignName = "";
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getPriceRatio() {
		return priceRatio;
	}

	public void setPriceRatio(double priceRatio) {
		this.priceRatio = priceRatio;
	}
}
