package johnathan.io.projeto01.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import johnathan.io.projeto01.entity.User;
import johnathan.io.projeto01.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {

			createUser("Johnathan", "johnathan@teste.com.br");
			createUser("Matheus", "matheus@teste.com.br");
			createUser("Daniel", "daniel@teste.com.br");
		}
		
		//para buscar por nome
		User user = userRepository.findByName("Daniel");
		System.out.println(user.getName());
	
		User buscaEmail = userRepository.findByEmail("johnathan@teste.com.br");
		System.out.println(buscaEmail.getEmail());
		
		//para buscar 
//		User user2 = userRepository.findByName2("Dan");
//		System.out.println(user2.getName());
		
		//para alterar
		//User user = userRepository.getOne(1L);
		//user.setName("JohnathanCiqueira");
		//userRepository.save(user);
		
		// para buscar por id
		//User user = userRepository.getOne(2L);
	
		//para deletar por id
		//userRepository.deleteById(2L);
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		
		userRepository.save(user);
	}

}
