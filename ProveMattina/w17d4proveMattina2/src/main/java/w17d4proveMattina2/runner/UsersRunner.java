package w17d4proveMattina2.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import w17d4proveMattina2.dao.IUsersDao;
import w17d4proveMattina2.entities.User;

@Component
@Slf4j
public class UsersRunner implements CommandLineRunner {

	@Autowired
	private IUsersDao ud;

	@Override
	public void run(String... args) throws Exception {
		User miao = User.builder().name("Fischietto").surname("Figlio di Brunella").email("fischietto@pazzo.it")
				.build();
		User brrr = User.builder().name("Brunella").surname("Gattapazza").email("brunella@pazza.it").build();

		User prrr = User.builder().name("Signorina").surname("Senzafigli").email("signorina@pazza.it").build();

		User nnnn = User.builder().name("Nina").surname("Figlia di Brunella").email("nina@pazza.it").build();

//		ud.save(miao);
//		ud.save(brrr);
//		ud.save(nnnn);
//		ud.save(prrr);

//		try {
//			ud.findByIdAndUpdate(152, brrr);
//		} catch (ItemNotFoundException e) {
//			log.error(e.getMessage());
//		}
//
//		try {
//			ud.findByIdAndDelete(153);
//		} catch (ItemNotFoundException e) {
//			log.error(e.getMessage());
//		}
//		try {
//			log.info(ud.findById(154).toString());
//		} catch (ItemNotFoundException e) {
//			log.error(e.getMessage());
//		}
//
//		log.info("Numero Gatti: " + ud.count());
//
//		ud.findAll().forEach(el -> log.info(el.toString()));
		log.info("***********Find All Ignore Case****************");
		ud.findByPartialNameIgnoreCase("br").forEach(el -> log.info(el.toString()));
	}

}
