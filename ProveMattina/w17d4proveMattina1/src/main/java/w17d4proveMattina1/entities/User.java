package w17d4proveMattina1.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User {
	private int id;
	private String name;
	private String surname;
	private String email;
}
