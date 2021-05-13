package odev3.core.concretes;

import odev3.core.abstracts.Crud;
import odev3.core.abstracts.Entity;

public class BaseCrud<T extends Entity> implements Crud<T> {

	@Override
	public void add(T entity, String message) {
		System.out.println(message);
	}

	@Override
	public void update(T entity, String message) {
		System.out.println(message);
	}

	@Override
	public void delete(T entity, String message) {
		System.out.println(message);
	}

}
