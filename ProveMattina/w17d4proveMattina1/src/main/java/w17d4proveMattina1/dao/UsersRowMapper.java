package w17d4proveMattina1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import w17d4proveMattina1.entities.User;

public class UsersRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String surname = rs.getString("surname");
		String email = rs.getString("email");
		return new User(id, name, surname, email);
	}

}
