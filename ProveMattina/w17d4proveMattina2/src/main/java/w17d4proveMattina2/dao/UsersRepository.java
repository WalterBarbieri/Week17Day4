package w17d4proveMattina2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import w17d4proveMattina2.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

	Optional<User> findByName(String name);

	List<User> findByNameAndSurname(String name, String surname);

	List<User> findByNameStartingWithIgnoreCase(String name);

}
