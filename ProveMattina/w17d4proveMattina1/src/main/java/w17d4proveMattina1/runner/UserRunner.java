package w17d4proveMattina1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import w17d4proveMattina1.dao.UsersDao;
import w17d4proveMattina1.entities.User;

@Component
@Slf4j
public class UserRunner implements CommandLineRunner {

	@Autowired
	private UsersDao ud;

	@Override
	public void run(String... args) throws Exception {
		User miao = User.builder().id(1).name("Fischietto").surname("Figlio di Brunella").email("fischietto@pazzo.it")
				.build();
		User brrr = User.builder().id(2).name("Brunella").surname("Gattapazza").email("brunella@pazza.it").build();

//		ud.save(brrr);
//
//		int numeroModificati = ud.findByIdAndUpdate(1, miao);
//		log.info("Gatti modificati: " + numeroModificati);

//		int numeroCancellati = ud.findByIdAndDelete(2);
//		log.info("Gatti cancellati: " + numeroCancellati);
		log.info(ud.findById(2).toString());

		log.info("Numero Gatti: " + ud.count());

		ud.findGatti().forEach(el -> log.info(el.toString()));
	}

}
