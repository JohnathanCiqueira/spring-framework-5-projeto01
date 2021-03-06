package johnathan.io.projeto01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import johnathan.io.projeto01.entity.User;
import johnathan.io.projeto01.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {

		return userRepository.findAll();
	}
}
