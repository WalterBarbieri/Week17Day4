package w17d4proveMattina2.exceptions;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(int id) {
		super("Item with ID: " + id + " not found!");
	}
}
