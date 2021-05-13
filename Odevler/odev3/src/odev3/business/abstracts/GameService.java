package odev3.business.abstracts;

import odev3.entities.concretes.Game;

public interface GameService {
	void addGame(Game game);

	void updateGame(Game game);

	void deleteGame(Game game);
}
