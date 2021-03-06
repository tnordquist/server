package edu.cnm.deepdive.lightbulb.model.repository;

import edu.cnm.deepdive.lightbulb.model.entity.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


/***
 * This interface extends comment repository to jpa repository.
 */
public interface UserRepository extends JpaRepository<User, UUID> {

  Optional<User> findFirstByOauthKey(String key);

  Iterable<User> getAllByOrderByCreatedDesc();

  Iterable<User> getAllByDisplayNameContainsOrderByDisplayName(String fragment);

  default User findOrFail(UUID id) {
    return findById(id).get();
  }
}
