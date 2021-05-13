package odev3.business.concretes;

import odev3.business.abstracts.GamerService;
import odev3.core.abstracts.NviService;
import odev3.dataAccess.abstracts.GamerDao;
import odev3.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	private NviService nviService;

	public GamerManager(GamerDao gamerDao, NviService nviService) {
		super();
		this.gamerDao = gamerDao;
		this.nviService = nviService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (CheckEmpty(gamer) || CheckNationalityNumber(gamer))
			return;
		gamerDao.add(gamer, "Oyuncu eklendi: " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void updateGamer(Gamer gamer) {
		if (CheckId(gamer.getId()) || CheckEmpty(gamer) || CheckNationalityNumber(gamer))
			return;
		gamerDao.update(gamer, "Oyuncu güncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		if (CheckId(gamer.getId()))
			return;
		gamerDao.delete(gamer, "Oyuncu silindi: " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	private boolean CheckId(int id) {
		boolean result = false;
		if (id <= 0) {
			System.out.println("Oyuncu bulunamadý.");
			result = true;
		}
		return result;
	}

	private boolean CheckEmpty(Gamer gamer) {
		boolean result = false;
		if (gamer.getId() <= 0 || gamer.getFirstName() == "" || gamer.getLastName() == "" || gamer.getEmail() == ""
				|| gamer.getNickname() == "" || gamer.getNationalityNumber() == "" || gamer.getYearOfBirth() <= 0) {
			System.out.println("Tüm alanlar doldurulmalýdýr.");
			result = true;
		}
		return result;
	}

	private boolean CheckNationalityNumber(Gamer gamer) {
		boolean result = false;
		if (!nviService.checkRealPerson(gamer.getNationalityNumber(), gamer.getFirstName(), gamer.getLastName(),
				gamer.getYearOfBirth())) {
			System.out.println("TC kimlik no doðrulanamadý. Bilgileri kontrol ediniz.");
			result = true;
		}
		return result;
	}
}
