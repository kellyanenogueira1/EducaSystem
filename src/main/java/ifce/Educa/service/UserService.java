package ifce.Educa.service;
import java.util.ArrayList;

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

	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) userRepository.findAll();
	}
}
