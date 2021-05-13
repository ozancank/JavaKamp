package odev3.dataAccess.concretes;

import odev3.core.concretes.BaseCrud;
import odev3.dataAccess.abstracts.GameDao;
import odev3.entities.concretes.Game;

public class DbGameDao extends BaseCrud<Game> implements GameDao {
}
