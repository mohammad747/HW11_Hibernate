package ir.maktabsharif.BaseDao;

import java.io.Serializable;

/**
 * CRUD Interface
 *
 * @param <E>
 * @author Mohammad hashemi
 */
public interface BaseDAO<E extends Serializable> {

    void create(E e);

    E read(Serializable id);

    E update(E e);

    void delete(Serializable id);
}
