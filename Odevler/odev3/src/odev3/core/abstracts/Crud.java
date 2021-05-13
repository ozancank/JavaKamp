package odev3.core.abstracts;

public interface Crud<T extends Entity> {

	void add(T entity, String message);

	void update(T entity, String message);

	void delete(T entity, String message);
}
