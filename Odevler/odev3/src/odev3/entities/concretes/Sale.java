package odev3.entities.concretes;

import odev3.core.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private Game game;
	private Gamer gamer;
	private Campaign campaign;

	public Sale() {
	}

	public Sale(int id, Game game, Gamer gamer) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
	}

	public Sale(int id, Game game, Gamer gamer, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
