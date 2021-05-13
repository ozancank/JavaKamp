package odev3.business.abstracts;

import odev3.entities.concretes.Gamer;

public interface GamerService {
	void addGamer(Gamer gamer);

	void updateGamer(Gamer gamer);

	void deleteGamer(Gamer gamer);
}
