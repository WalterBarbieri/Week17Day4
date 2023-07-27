package w17d4proveMattina2.dao;

import java.util.List;

import w17d4proveMattina2.entities.User;

public interface IUsersDao {
	public void save(User user);

	public void findByIdAndUpdate(int id, User user);

	public void findByIdAndDelete(int id);

	public User findById(int id);

	public List<User> findAll();

	public long count();

	public List<User> findByPartialNameIgnoreCase(String name);

}
