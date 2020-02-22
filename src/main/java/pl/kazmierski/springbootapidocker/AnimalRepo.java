package pl.kazmierski.springbootapidocker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepo extends CrudRepository<Animal, Long> {
}
