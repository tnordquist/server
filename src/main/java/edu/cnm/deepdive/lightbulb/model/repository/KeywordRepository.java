package edu.cnm.deepdive.lightbulb.model.repository;

import edu.cnm.deepdive.lightbulb.model.entity.Keyword;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * This interface extends comment repository to jpa repository.
 */
public interface KeywordRepository extends JpaRepository<Keyword, UUID> {

  Optional<Keyword> findFirstByName(String name);

  Iterable<Keyword> getAllByOrderByCreatedDesc();

  Iterable<Keyword> getAllByNameContainsOrderByNameAsc(String fragment);

  default Keyword findOrFail(UUID id) {
    return findById(id).get();
  }
}
