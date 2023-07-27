package w17d4proveMattina2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import w17d4proveMattina2.entities.User;
import w17d4proveMattina2.exceptions.ItemNotFoundException;

@Service
@Slf4j
public class UsersService implements IUsersDao {

	@Autowired
	private UsersRepository usersRepo;

	public void save(User user) {
		usersRepo.save(user);
		log.info(user.getName() + " Salvato!");
	}

	public List<User> findAll() {
		return usersRepo.findAll();

	}

	public User findById(int id) throws ItemNotFoundException {
		// PRIMO METODO + PIU' LUNGO MA ESPLICATIVO

//		Optional<User> user = usersRepo.findById(id);
//		if (user.isPresent()) {
//			return user.get();
//
//		} else {
//			throw new ItemNotFoundException(id);
//		}

		// SECONDO METODO + PIU' VELOCE E CONSIGLIABILE

		return usersRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));

	}

	public void findByIdAndUpdate(int id, User user) throws ItemNotFoundException {
		User found = this.findById(id);
		found.setId(id);
		found.setName(user.getName());
		found.setSurname(user.getSurname());
		found.setEmail(user.getEmail());
		usersRepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemNotFoundException {
		User found = this.findById(id);

		usersRepo.delete(found);
	}

	public long count() {
		return usersRepo.count();

	}

	public List<User> findByPartialNameIgnoreCase(String name) {
		return usersRepo.findByNameStartingWithIgnoreCase(name);
	}

}
