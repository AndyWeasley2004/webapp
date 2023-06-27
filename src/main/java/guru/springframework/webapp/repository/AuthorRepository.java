package guru.springframework.webapp.repository;

import guru.springframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { //CurdRepository(T, ID) -> type and id

}
