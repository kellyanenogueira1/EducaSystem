package ifce.Educa.service;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import ifce.Educa.model.User;
import ifce.Educa.Repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository useRepository) {
		super();
		this.userRepository = userRepository; 
	}
	
	//@Override
	//public List<User> getAllUsers() {
	//	return userRepository.findAll();
	//}

	public Object getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
