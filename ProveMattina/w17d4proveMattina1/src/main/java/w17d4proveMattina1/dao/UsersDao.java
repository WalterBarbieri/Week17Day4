package w17d4proveMattina1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import w17d4proveMattina1.entities.User;

@Repository
public class UsersDao implements IUsersDao {

	@Autowired
	private JdbcTemplate jdbcT;

	@Override
	public void save(User user) {
		String sql = "INSERT INTO users (id, name, surname, email) VALUES (?, ?, ?, ?)";
		jdbcT.update(sql, user.getId(), user.getName(), user.getSurname(), user.getEmail());

	}

	@Override
	public int findByIdAndUpdate(int id, User user) {
		String sql = "UPDATE users SET name=?, surname=?, email=? WHERE id=?";
		return jdbcT.update(sql, user.getName(), user.getSurname(), user.getEmail(), id);

	}

	@Override
	public int findByIdAndDelete(int id) {
		String sql = "DELETE FROM users WHERE id=?";
		return jdbcT.update(sql, id);

	}

	@Override
	public User findById(int id) {
		String sql = "SELECT * FROM users WHERE id=?";
		return jdbcT.queryForObject(sql, new UsersRowMapper(), id);
	}

	@Override
	public List<User> findGatti() {
		String sql = "SELECT * FROM users";
		return jdbcT.query(sql, new UsersRowMapper());
	}

	@Override
	public int count() {
		String sql = "SELECT COUNT(*) FROM users";
		return jdbcT.queryForObject(sql, Integer.class);
	}

}
