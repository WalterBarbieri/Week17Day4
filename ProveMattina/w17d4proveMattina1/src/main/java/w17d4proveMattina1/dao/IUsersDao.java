package w17d4proveMattina1.dao;

import java.util.List;

import w17d4proveMattina1.entities.User;

public interface IUsersDao {
	public void save(User user);

	public int findByIdAndUpdate(int id, User user);

	public int findByIdAndDelete(int id);

	public User findById(int id);

	public List<User> findGatti();

	public int count();

}
