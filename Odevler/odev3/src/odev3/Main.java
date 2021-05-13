package odev3;

import odev3.business.abstracts.CampaignService;
import odev3.business.abstracts.GameService;
import odev3.business.abstracts.GamerService;
import odev3.business.abstracts.SaleService;
import odev3.business.concretes.CampaignManager;
import odev3.business.concretes.GameManager;
import odev3.business.concretes.GamerManager;
import odev3.business.concretes.SaleManager;
import odev3.core.concretes.MernisServiceAdapter;
import odev3.dataAccess.concretes.DbCampaignDao;
import odev3.dataAccess.concretes.DbGameDao;
import odev3.dataAccess.concretes.DbGamerDao;
import odev3.dataAccess.concretes.DbSaleDao;
import odev3.entities.concretes.Campaign;
import odev3.entities.concretes.Game;
import odev3.entities.concretes.Gamer;
import odev3.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		GamerService gamerService = new GamerManager(new DbGamerDao(), new MernisServiceAdapter());
		GameService gameService = new GameManager(new DbGameDao());
		CampaignService campaignService = new CampaignManager(new DbCampaignDao());
		SaleService saleService = new SaleManager(new DbSaleDao());

		Game game1 = new Game(1, "Red Alert", 200.00);
		gameService.addGame(game1);
		Game game2 = new Game(1, "Red Alert 2", 300.00);
		gameService.addGame(game2);

		Campaign campaing1 = new Campaign(1, "Yaz kampanyasý", 50.02);
		campaignService.addCampaign(campaing1);

		Gamer gamer1 = new Gamer(1, "nickname", "isim", "soyisim", "TC NO", 1000, "mail");
		gamerService.addGamer(gamer1);

		Sale sale1 = new Sale(1, game1, gamer1, campaing1);
		saleService.DoSale(sale1);

		gamer1.setNickname("ozancan");
		gamerService.updateGamer(gamer1);

		Sale sale2 = new Sale(2, game2, gamer1);
		saleService.DoSale(sale2);

		gamerService.deleteGamer(gamer1);
	}
}
