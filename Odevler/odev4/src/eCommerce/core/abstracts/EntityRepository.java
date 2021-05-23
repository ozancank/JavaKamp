package eCommerce.core.abstracts;

public interface EntityRepository<T extends Entity, ID> {

	T getById(ID id);

	Iterable<T> getAll();

	void add(T entity, String message);

	void update(T entity, String message);

	void delete(T entity, String message);
}
