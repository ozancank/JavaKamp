package odev3.business.concretes;

import odev3.business.abstracts.GameService;
import odev3.dataAccess.abstracts.GameDao;
import odev3.entities.concretes.Game;

public class GameManager implements GameService {

	private GameDao gameDao;

	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void addGame(Game game) {
		if (CheckEmpty(game))
			return;
		gameDao.add(game, "Oyun eklendi: " + game.getName());
	}

	@Override
	public void updateGame(Game game) {
		if (CheckId(game.getId()) || CheckEmpty(game))
			return;
		gameDao.update(game, "Oyun güncellendi: " + game.getName());
	}

	@Override
	public void deleteGame(Game game) {
		if (CheckId(game.getId()))
			return;
		gameDao.delete(game, "Oyun silindi: " + game.getName());
	}

	private boolean CheckId(int id) {
		boolean result = false;
		if (id <= 0) {
			System.out.println("Oyun bulunamadý.");
			result = true;
		}
		return result;
	}

	private boolean CheckEmpty(Game game) {
		boolean result = false;
		if (game.getId() <= 0 || game.getName() == "" || game.getPrice() <= 0) {
			System.out.println("Tüm alanlar doldurulmalýdýr.");
			result = true;
		}
		return result;
	}
}
