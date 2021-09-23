package dao;

import java.util.List;
import java.util.Optional;

public interface Dao <T> {
    T get(int id);

    List<T> getAll();

    boolean save(T t);

    boolean update(int id, T t);

    boolean delete(int id);
}
