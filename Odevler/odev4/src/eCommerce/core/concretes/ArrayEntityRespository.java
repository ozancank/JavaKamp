package eCommerce.core.concretes;

import java.util.ArrayList;

import eCommerce.core.abstracts.Entity;
import eCommerce.core.abstracts.EntityRepository;

public class ArrayEntityRespository<T extends Entity, ID> implements EntityRepository<T, ID> {

	private ArrayList<T> list;

	public ArrayEntityRespository(ArrayList<T> list) {
		super();
		this.list = list;
	}

	@Override
	public T getById(ID id) {
		try {
			for (T entity : list) {
				if (entity.getClass().getMethod("getId").invoke(entity, null).toString().equals(id.toString())) {
					return entity;
				}
			}
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public Iterable<T> getAll() {
		return list;
	}

	@Override
	public void add(T entity, String message) {
		list.add(entity);
		System.out.println(message);
	}

	@Override
	public void update(T entity, String message) {
		try {
			ID id = (ID) entity.getClass().getMethod("getId").invoke(entity, null).toString();
			T exists = getById(id);
			int index = list.indexOf(exists);
			list.set(index, entity);
			System.out.println(message);
		} catch (Exception e) {
		}
	}

	@Override
	public void delete(T entity, String message) {
		list.remove(entity);
		System.out.println(message);
	}
}
